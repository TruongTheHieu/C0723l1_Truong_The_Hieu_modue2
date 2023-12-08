package mvc_demo_tets.repository;

import mvc_demo_tets.repository.impl.IProductRepository;
import ss12_java_collection_framework.Product;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> list = new ArrayList<>();
    static {
        list.add(new Product(1,"Máy tính",150.000));
        list.add(new Product(2,"Bàn Phím",200.000));
        list.add(new Product(3,"lót chuột",15.000));
    }


    @Override
    public ArrayList<Product> getAll() {
        return list;
    }

    @Override
    public void add(Product product) {
        list.add(product);
    }

    @Override
    public void edit() {}


    @Override
    public void remove() {

    }
}
