package view;

import controller.ControllerCustomer;
import model.Customer;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewCustomer {
    private static final int DISPLAY = 1;
    private static final int ADD =2;
    private static final int DELETE=3;

    private static final int EDIT=4;

    private static ControllerCustomer controllerCustomer = new ControllerCustomer();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        do {
            System.out.println("chương trình quản lý sản phẩm");
            System.out.println("\n1.Hiển Thị danh sách sản phẩm"+
                                             "\n2.Thêm sản phẩm" +
                                            "\n3.xóa sản phẩm"+
                                            "\n4.chỉnh sửa sản phẩm");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice) {
                case DISPLAY:
                    ArrayList<Customer> customers = controllerCustomer.getAll();
                    display(customers);
                    break;

                case ADD:
                    inputDataCustomer();
                    break;
                case DELETE:
                    int idDelete = deleteCustomer();
                    controllerCustomer.delete(idDelete);
            }
        }while (flag);
    }

    public static void inputDataCustomer(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("nhập tên sản phẩm :");
        String name = scanner.nextLine();
        Customer customer = new Customer(id, name);
        controllerCustomer.add(customer);
    }
    public static void display(ArrayList<Customer> customers){
        for (Customer item: customers) {
            System.out.println(item);
        }
    }
    public static int deleteCustomer(){
            Scanner scanner = new Scanner(System.in);
        System.out.println("nhập id cần xóa");
        return Integer.parseInt(scanner.nextLine());
    }

}
