package view;

import controller.ControllerDoctor;
import model.Doctor;

import java.util.ArrayList;
import java.util.Scanner;

public class view {
    private static final int ADD = 1;
    private static final int DISPLAY =2;
    private static final int DELETE = 3;
    private static final int EDIT=4;
   private  static  Scanner scanner = new Scanner(System.in);
   private static ControllerDoctor controllerDoctor = new ControllerDoctor();

    public static void main(String[] args) {
        boolean flag = true;
        do {
            System.out.println("Quản Lý bác sĩ :" +
                    "\n1.Thêm bác sĩ"+
                    "\n2.Hiển thị danh sách bác sĩ"+
                    "\n3.Xóa bác sĩ"+
                    "\n4.Sửa thông tin bác sĩ");
            System.out.println("Nhập lựa chọn :");
            int choice =Integer.parseInt(scanner.nextLine());
            switch (choice){
                case ADD: {
                    Doctor doctor = add();
                    controllerDoctor.add(doctor);
                    break;
                }

                case DISPLAY: {
                    ArrayList<Doctor> doctors = controllerDoctor.getAll();
                    display(doctors);
                    break;
                }

                case DELETE: {
                    int idDel = delete();
                    controllerDoctor.delete(idDel);
                    break;
                }

                case EDIT: {
                    int idEdit = edit();
                    controllerDoctor.edit(idEdit);
                    break;
                }
            }
        }while (flag);
    }

    public static void display(ArrayList<Doctor> doctors){
        for (Doctor item: doctors) {
            System.out.println(item);
        }

    }
    public static Doctor add(){
        System.out.println("nhập mã bác sĩ");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập tên bác sĩ");
        String name = scanner.nextLine();
        System.out.println("Nhập tuổi bác sĩ");
        int age = Integer.parseInt(scanner.nextLine());
        System.out.println("Chức vụ là:");
        String position = scanner.nextLine();
        Doctor doctor = new Doctor(id, name, age, position);
        return doctor;
    }

    public static int delete(){
        System.out.println("nhap ma bac si can xoa");
        return Integer.parseInt(scanner.nextLine());
    }
    public static int edit(){
        System.out.println("nhap ma bac si can sua");
        return Integer.parseInt(scanner.nextLine());
    }

}

