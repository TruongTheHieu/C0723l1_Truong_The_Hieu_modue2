package repository.Impl;

import model.Product;
import repository.IProductRepository;

import java.util.ArrayList;

public class ProductRepository implements IProductRepository {
    private static ArrayList<Product> productList = new ArrayList<>();

    static {
        productList.add(new Product(1, "HIEU", 1000, "OK"));
        productList.add(new Product(2, "Hung", 2000, "OK"));
        productList.add(new Product(3, "Chanh", 3000, "OK"));
    }

    @Override
    public ArrayList<Product> getAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        productList.add(product);
    }

    @Override
    public void delete(int deleteId) {
        for (int i = 0; i < productList.size(); i++) {
            if (deleteId == productList.get(i).getId()) {
                productList.remove(i);
                break;
            }
        }

    }

    @Override
    public void edit(int editId, Product product) {
        for (int i = 0; i < productList.size(); i++) {
            if (editId == productList.get(i).getId()) {
                productList.set(editId, product);
                break;
            }
        }

    }

    @Override
    public void search(int searchId) {
        for (int i = 0; i < productList.size(); i++) {
            if (searchId == productList.get(i).getId()) {
                System.out.println(productList.get(i));
                break;
            }
        }


    }
}
