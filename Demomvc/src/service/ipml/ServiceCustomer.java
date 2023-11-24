package service.ipml;

import model.Customer;
import repository.RepositoryCustomer;

import java.util.ArrayList;

public class ServiceCustomer implements IServiceCustomer {
    private static RepositoryCustomer repositoryCustomer = new RepositoryCustomer();

    @Override
    public ArrayList<Customer> getAll() {
        return repositoryCustomer.getAll();
    }

    @Override
    public void add(Customer customer) {
        repositoryCustomer.add(customer);

    }

    @Override
    public void delete(int idDelete) {

        repositoryCustomer.delete(idDelete);
    }

}
