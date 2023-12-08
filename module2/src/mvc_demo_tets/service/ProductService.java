package mvc_demo_tets.service;

import mvc_demo_tets.repository.ProductRepository;
import mvc_demo_tets.service.impl.IProductService;
import ss12_java_collection_framework.Product;

import java.util.ArrayList;
import java.util.Scanner;



public class ProductService implements IProductService {
     static Scanner sc  = new Scanner(System.in);
    static ProductRepository productRepository = new ProductRepository();

    @Override
    public void add(Product product) {
        productRepo.add(product);
    }
    public Product inputDataProduct() {
        System.out.println("Nhập id");
        int id = sc.nextInt();
        System.out.print("Nhập tên : ");
        String name = sc.nextLine();
        System.out.print("Nhập giá thành tiền : ");
        double price = Double.parseDouble(sc.nextLine());
        return new Product(id, name, price);
    }

    @Override
    public void edit() {

    }

    @Override
    public void removeProduct() {

    }

    @Override
    public void display() {
        ArrayList<Product> products = productRepository.getAll();
        for (Product item: products) {
            System.out.println(item);
        }

    }

    @Override
    public void search() {

    }

    @Override
    public void sort() {

    }
}
