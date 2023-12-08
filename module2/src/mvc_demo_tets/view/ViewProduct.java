package mvc_demo_tets.view;

import mvc_demo_tets.controller.ProductController;
import ss12_java_collection_framework.Product;

import java.util.Scanner;

public class ViewProduct {
    private static final int ADD = 1;
    private static final int EDIT = 2;

    private static final int REMOVE = 3;
    private static final int DISPLAY = 4;
    private static final int SEARCH = 5;
    private static final int SORT = 6;

       private static ProductController productController = new ProductController();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do{
            System.out.println("Menu");
            System.out.println("1 :Thêm sản phẩm\n" +
                    "2 : Sửa thông tin sản phẩm theo id\n" +
                    "3 : Xoá sản phẩm theo id\n" +
                    "4 :Hiển thị danh sách sản phẩm\n" +
                    "5 :Tìm kiếm sản phẩm theo tên\n" +
                    "6 :Sắp xếp sản phẩm tăng dần, giảm dần theo giá");
            System.out.println("Nhập lựa chọn của bạn");
            int choice = Integer.parseInt(scanner.nextLine());
            switch (choice){
                case ADD:
                case EDIT:
                    productController.edit();
                    break;
                case REMOVE:
                case DISPLAY:
                    productController.display();
                    break;
                case SEARCH:
                case SORT:
                default:
                    flag = false;
            }

        }while (flag);
    }
}
