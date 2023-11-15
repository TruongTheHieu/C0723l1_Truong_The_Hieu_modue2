package repository.Impl;

import model.Product;
import repository.IProductRepository;

public class ProductRepository implements IProductRepository {
    private static Product[] productList = new Product[5];
    static {
        productList[0] = new Product(1,"HIEU",1000,"OK");
        productList[1] = new Product(2,"Hung",2000,"OK");
        productList[2] = new Product(3,"Chanh",3000,"OK");
    }
    @Override
    public Product[] getAll() {
        return productList;
    }

    @Override
    public void add(Product product) {
        for (int i = 0; i <productList.length ; i++) {
            if(productList[i] == null){
                productList[i] = product;
                break;
            }

        }


    }

    @Override
    public void delete(int deleteId) {
        for (int i = 0; i <productList.length; i++){
            if(deleteId == productList[i].getId()){
                productList[i] = null;
                break;
            }
        }

    }

    @Override
    public void edit( int editId , Product product) {
        for (int i = 0; i < productList.length ; i++) {
            if(editId == productList[i].getId()){
                productList[i] = product;
                break;
            }
        }

    }

    @Override
    public void search(int searchId) {
        for (int i = 0; i < productList.length; i++) {
            if(searchId == productList[i].getId()){
                System.out.println(productList[i]);
            }
        }


    }
}
