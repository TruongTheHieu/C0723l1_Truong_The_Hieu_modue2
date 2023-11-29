package ss12_java_collection_framework;

import java.util.ArrayList;
import java.util.Scanner;

public class main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        ArrayList<Product> listProduct = new ArrayList<>();
        ProductManager productManager = new ProductManager();

        boolean flag = true;
        do {
            System.out.println("1:Thêm sản phẩm\n" +
                    "2 :Sửa thông tin sản phẩm theo id\n" +
                    "3 :Xoá sản phẩm theo id\n" +
                    "4 :Hiển thị danh sách sản phẩm\n" +
                    "5 :Tìm kiếm sản phẩm theo tên\n" +
                    "6 :Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("Nhập lựa chọn");
            int choice = Integer.parseInt(sc.nextLine());
            switch (choice) {
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
                case 4://hiển thị danh sách sản phẩm
                    ArrayList<Product> products = productManager.getProducts();
                    productManager.disPlay(products);
                    break;
                case 5://tìm kiếm sản phẩm theo tên
                    System.out.println("Nhập tên Product cần tìm");
                    String productSearch = sc.nextLine();
                    productManager.search(productSearch);
                    break;
                case 6:// Sắp xếp tăng dần, giảm dần theo giá.
                    System.out.println("bạn muốn sắp xếp tăng hay giảm");
                    System.out.println("\n1 : tăng " +
                            "\n2 : giảm");
                    int temp = Integer.parseInt(sc.nextLine());
                    switch (temp) {
                        case 1: // tăng
                            productManager.sortTheoGiaSanPham(false);
                            break;
                        case 2:// giảm
                            productManager.sortTheoGiaSanPham(true);
                            break;

                    }
                    break;
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }
}