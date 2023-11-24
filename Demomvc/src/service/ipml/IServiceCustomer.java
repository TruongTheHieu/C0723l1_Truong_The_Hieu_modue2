package service.ipml;

import model.Customer;

import java.util.ArrayList;

public interface IServiceCustomer {
    ArrayList<Customer>getAll();

    void add(Customer customer);

    void delete(int idDelete);

}
