package service;

import model.Product;

public interface IProductService {
    Product[] getAll();
    void add(Product product);
    void delete(int deleteId);
    void edit(int editId,Product product);
    void search(int search);
}
