package mvc_demo_tets.controller;

import mvc_demo_tets.service.ProductService;
import ss12_java_collection_framework.Product;

public class ProductController {
    ProductService productService = new ProductService();

    public void add(Product p) {
        productService.add(p);
    }

    public void edit() {
        productService.edit();
    }

    public void removeProduct() {
        productService.removeProduct();
    }

    public void display() {
        productService.display();
    }

    public void search() {
    }

    public void sort() {
    }
}
