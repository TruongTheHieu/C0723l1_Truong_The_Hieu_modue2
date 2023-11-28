package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class ProductManager {

    private ArrayList<Product> listProduct = new ArrayList<>();

    public ProductManager (ArrayList<Product> listProduct) {
        this.listProduct = listProduct;
    }

    public ArrayList<Product> getProducts(){
        return listProduct;
    }

    public void add(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id :");
        int id = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên :");
        String name = sc.nextLine();
        System.out.println("Nhập giá :");
        double price = sc.nextDouble();
        Product product = new Product(id,name,price);
        listProduct.add(product);
    }

    public void edit(int idedit) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Nhập id :");
        int idNew = Integer.parseInt(sc.nextLine());
        System.out.println("Nhập tên :");
        String nameNew = sc.nextLine();
        System.out.println("Nhập giá :");
        double priceNew = sc.nextDouble();

        boolean flag = true;
        for (int i = 0; i <listProduct.size() ; i++) {
            if(listProduct.get(i).getId()== idedit){
                listProduct.get(i).setId(idNew);
                listProduct.get(i).setName(nameNew);
                listProduct.get(i).setPrice(priceNew);
                flag = false;
            }
            }if (flag){
            System.out.println("không tìm thấy Product cần sửa ");
        }
    }
    public  void delete(int productDelete){
        boolean flag = true;
        for (int i = 0; i <listProduct.size() ; i++) {
            if(listProduct.get(i).getId() == productDelete){
                listProduct.remove(i);
                flag = false;
            }
        }
        if(flag){
            System.out.println("không tìm thấy Product cần xóa");
        }
    }
}
