package repository;

import model.Customer;

import java.util.ArrayList;

public interface IRepositoryCustomer {
    ArrayList<Customer> getAll();

    void add(Customer customer);

    void delete(int idDelete);

}
