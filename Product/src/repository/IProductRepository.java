package repository;

import model.Product;

public interface IProductRepository {
    Product[] getAll();
    void add(Product product);
    void delete( int deleteId);
    void edit(int editId , Product product);

    void search(int search);
}
