package repository;

import model.Customer;

import java.util.ArrayList;

public class RepositoryCustomer implements IRepositoryCustomer {
    private static ArrayList<Customer> customersList = new ArrayList<>();

    @Override
    public ArrayList<Customer> getAll() {
        return customersList;
    }

    @Override
    public void add(Customer customer) {
        customersList.add(customer);
    }

    @Override
    public void delete(int idDelete) {
        boolean flag = false;
        for(int i  = 0; i<customersList.size();i++){
            if(customersList.get(i).getId()==idDelete){
                flag =true;
                customersList.remove(i);
            }
        }
        if(!flag){
            System.out.println("không tồn tại id cần xóa");
        }

    }

}
