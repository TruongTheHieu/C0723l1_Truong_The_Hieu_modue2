package controller;

import model.Customer;
import service.ipml.ServiceCustomer;

import java.util.ArrayList;

public class ControllerCustomer {

    private static ServiceCustomer serviceCustomer = new ServiceCustomer();
    public ArrayList<Customer> getAll(){
        return serviceCustomer.getAll();
    };
    public void add(Customer customer) {
        serviceCustomer.add(customer);
    };
    public void delete(int idDelete){
        serviceCustomer.delete(idDelete);
    }

}
