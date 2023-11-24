package repository;

import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class RepositoryDoctor implements IRepositoryDoctor {
    private static ArrayList<Doctor> doctorList = new ArrayList<>();

    static {
        doctorList.add(new Doctor(1, "hieu", 21, "bac si ngoai khoa"));
        doctorList.add(new Doctor(2, "hung", 22, "bac si da khoa"));
        doctorList.add(new Doctor(3, "chanh", 23, "bac si chuan doan"));
    }

    @Override
    public ArrayList<Doctor> getAll() {
        return doctorList;
    }

    @Override
    public void add(Doctor doctor) {
        doctorList.add(doctor);
    }

    @Override
    public void delete(int idDel) {
        boolean flag = false;
        for (int i = 0; i < doctorList.size(); i++) {
            if (doctorList.get(i).getIdDoctor() == idDel) {
                flag = true;
                doctorList.remove(i);
                break;
            }
        }

        if (!flag) {
            System.out.println("không tồn tại id cần xoa");
        }
    }

    @Override
    public void edit(int idEdit) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = false;
        for (int i = 0; i < doctorList.size(); i++) {
            if (doctorList.get(i).getIdDoctor() == idEdit) {
                flag = true;
                System.out.println(" \n1.sua ten" +
                        "\n2.sua tuoi" +
                        "\n3.sua chuc vu");
                int choice = Integer.parseInt(scanner.nextLine());
                switch (choice) {
                    case 1:
                        System.out.println("ten moi la:");
                        doctorList.get(i).setNameDoctor(scanner.nextLine());
                        break;
                    case 2:
                        System.out.println("tuoi moi la");
                        doctorList.get(i).setAgeDoctor(Integer.parseInt(scanner.nextLine()));
                        break;
                    case 3:
                        System.out.println("chuc vu moi la:");
                        doctorList.get(i).setPositionDoctor(scanner.nextLine());
                        break;
                }
            }
        }

        if (!flag) {
            System.out.println("k tim thay id tuong ung");
        }
    }
}

