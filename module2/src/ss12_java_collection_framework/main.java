package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Product> listProduct = new ArrayList<>();
        ProductManager productManager = new ProductManager(listProduct);
        System.out.println("1:Thêm sản phẩm\n" +
                "2 :Sửa thông tin sản phẩm theo id\n" +
                "3 :Xoá sản phẩm theo id\n" +
                "4 :Hiển thị danh sách sản phẩm\n" +
                "5 :Tìm kiếm sản phẩm theo tên\n" +
                "6 :Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
        System.out.println("Nhập lựa chọn");
        int luachon = Integer.parseInt(sc.nextLine());
        while (luachon!= 7){
            switch (luachon){
                case 1: //thêm mới phần tử.
                    productManager.add();
                    break;
                case 2://sửa thông tin sản phầm
                    System.out.println("Nhập Product cần sửa :");
                    int productEdit = Integer.parseInt(sc.nextLine());
                    productManager.edit(productEdit);
                    break;
                case 3://xóa sản phẩm
                    System.out.println("Nhập sản phẩn cần xóa :");
                    int productDelete = Integer.parseInt(sc.nextLine());
                    productManager.delete(productDelete);
                case 4:
                case 5:
                case 6:

            }

        }
    }
}
