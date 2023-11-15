package service.impl;

import model.Product;
import repository.Impl.ProductRepository;
import service.IProductService;

public class ProductService implements IProductService {
    private static ProductRepository productRepository = new ProductRepository();
    @Override
    public Product[] getAll() {
        return productRepository.getAll();
    }

    @Override
    public void add(Product product) {
        productRepository.add(product);

    }

    @Override
    public void  delete(int deleteId) {
        productRepository.delete(deleteId);

    }

    @Override
    public void edit(int editId,Product product) {
        productRepository.edit(editId,product);

    }

    @Override
    public void search(int searchId) {
        productRepository.search(searchId);

    }
}
