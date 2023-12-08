package mvc_demo_tets.service.impl;

import ss12_java_collection_framework.Product;

public interface IProductService {
    void add(Product p);
    void edit();
    Product inputDataProduct();
    void removeProduct();

    void display();
    void search();
    void sort();
}
