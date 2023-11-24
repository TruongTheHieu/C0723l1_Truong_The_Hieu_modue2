package controller;

import model.Doctor;
import service.ServiceDoctor;

import java.util.ArrayList;

public class ControllerDoctor {
    private static ServiceDoctor serviceDoctor = new ServiceDoctor();
    public static ArrayList<Doctor> getAll() {
        return serviceDoctor.getAll();
    }
    public void add(Doctor doctor){
         serviceDoctor.add(doctor);
    }

    public void delete(int idel ){
        serviceDoctor.delete(idel);
    }
    public void edit(int idEdit){
        serviceDoctor.edit(idEdit);
    }
}
