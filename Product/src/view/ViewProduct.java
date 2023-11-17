package view;

import controller.ProductController;
import model.Product;

import java.util.ArrayList;
import java.util.Scanner;

public class ViewProduct {
    private static ProductController productController = new ProductController();

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean flag = true;
        do {
            System.out.println("Chương trình quản lý sản phẩm");
            System.out.println("\n1. Thêm sản phẩm" +
                    "\n2 . Hiện thị" +
                    "\n3 . Xóa" +
                    "\n4. Sửa" +
                    "\n5. Tìm kiếm sản phẩm" +
                    "\n6.Kết thúc");
            int choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    Product product = inputProduct();
                    productController.add(product);
                    break;
                case 2:
                    disPlay();
                    break;
                case 3:
                    delete();
                    break;
                case 4:
                    edit();
                    break;
                case 5:
                    search();
                    break;
                case 6:
                default: {
                    flag = false;
                }
            }
        } while (flag);
    }

    public static void disPlay() {
        ArrayList<Product> products = productController.getAll();
        for (int i = 0; i < products.size(); i++) {
                System.out.println(products.get(i));
        }
    }

    public static Product inputProduct() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id :");
        int id = Integer.parseInt(scanner.nextLine());
        System.out.println("Nhập Tên : ");
        String name = scanner.nextLine();
        System.out.println("Nhập Gía :");
        double price = Double.parseDouble(scanner.nextLine());
        System.out.println("Nhập mô tả :");
        String describe = scanner.nextLine();
        Product product = new Product(id, name, price, describe);
        return product;
    }

    public static void delete() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập Id cần xóa : ");
        int deleteId = Integer.parseInt(scanner.nextLine());
        productController.delete(deleteId);

    }

    public static void edit() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập id cần sửa :");
        int editId = Integer.parseInt(scanner.nextLine());
        System.out.println("Mời bạn thông tin đối tượng cần sửa");
        Product product = inputProduct();
        productController.edit(editId, product);
    }

    public static void search() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhập Id cần tìm");
        int searchId = Integer.parseInt(scanner.nextLine());
        productController.search(searchId);
    }
}
