package controller;

import model.Product;
import service.impl.ProductService;

public class ProductController {
    public static ProductService productService = new ProductService();
    public Product[] getAll(){
        return productService.getAll();
    }
    public void add(Product product){
        productService.add(product);
    }

    public  void delete(int deleteId){
        productService.delete(deleteId);
    }

    public void edit(int editId, Product product){
        productService.edit(editId,product);
    }

public void search(int searchId){
        productService.search(searchId);
}
}
