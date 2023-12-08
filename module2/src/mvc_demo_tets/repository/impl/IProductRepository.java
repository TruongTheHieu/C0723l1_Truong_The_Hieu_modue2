package mvc_demo_tets.repository.impl;

import ss12_java_collection_framework.Product;

import java.util.ArrayList;

public interface IProductRepository {
    ArrayList<Product> getAll();
    void add(Product product);
    void edit();
    void remove();
}
