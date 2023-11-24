package repository;

import model.Doctor;

import java.util.ArrayList;

public interface IRepositoryDoctor {
    ArrayList<Doctor> getAll ();

    void add(Doctor doctor);

    void delete(int idDel);

    void edit(int idEdit);
}
