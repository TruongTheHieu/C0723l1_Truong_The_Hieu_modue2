package service;

import model.Doctor;
import repository.RepositoryDoctor;

import java.util.ArrayList;

public class ServiceDoctor implements IServiceDoctor {
    private static RepositoryDoctor repositoryDoctor = new RepositoryDoctor();
    @Override
    public ArrayList<Doctor> getAll() {
        return repositoryDoctor.getAll();
    }

    @Override
    public void add(Doctor doctor) {
         repositoryDoctor.add(doctor);

    }

    @Override
    public void delete(int idDel) {
        repositoryDoctor.delete(idDel);

    }

    @Override
    public void edit(int idEdit) {
        repositoryDoctor.edit(idEdit);

    }
}
