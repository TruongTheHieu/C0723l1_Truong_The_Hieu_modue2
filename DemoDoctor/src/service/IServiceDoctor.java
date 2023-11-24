package service;

import model.Doctor;

import java.util.ArrayList;

public interface IServiceDoctor {
    ArrayList<Doctor> getAll ();

    void add(Doctor doctor);

    void delete(int idDel);

    void edit(int idEdit);
}
