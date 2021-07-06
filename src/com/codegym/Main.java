package com.codegym;

import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Manage manageSP = new Manage();
        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("----CHƯƠNG TRÌNH QUẢN LÝ SẢN PHẨM-----");
            System.out.println("Chọn chức năng theo số (để tiếp tục)");
            System.out.println("1. Xem danh sách sản phẩm");
            System.out.println("2. Thêm mới");
            System.out.println("3. Cập nhật");
            System.out.println("4. Xóa");
            System.out.println("5. Sắp xếp");
            System.out.println("6. Tìm sản phẩm giá đắt nhất");
            System.out.println("7. Đọc từ file");
            System.out.println("8. Ghi vào file");
            System.out.println("9. Exit");
            System.out.println("Enter choise: ");
            int choise = Integer.parseInt(sc.nextLine());
            switch (choise) {
                case 1 -> {
                    System.out.println("Danh sách sản phẩm");
                    manageSP.show();
                }
                case 2 -> {
                    System.out.println("Nhập mã sản phẩm: ");
                    String maSp = sc.nextLine();
                    System.out.println("Nhập tên sản phẩm: ");
                    String tenSp = sc.nextLine();
                    System.out.println("Nhập giá sản phẩm: ");
                    double giaSP = Double.parseDouble(sc.nextLine());
                    System.out.println("Nhập số lượng sản phẩm: ");
                    int soLuong = Integer.parseInt(sc.nextLine());
                    System.out.println("Nhập mô tả: ");
                    String moTa = sc.nextLine();

                    manageSP.addSP(maSp,tenSp,giaSP,soLuong,moTa);
                }
                case 3 -> {
                    System.out.println("Nhập tên sản phẩm cần sửa:");
                    String tenSP = sc.nextLine();
                    manageSP.update(tenSP);
                }
                case 4 -> {
                    manageSP.deleteSP();
                }
                case 5 -> {
                    System.out.println("Sắp xếp....");
                    manageSP.sortSP();
                    manageSP.show();
                }
                case 6 -> {
                    manageSP.giaMax();
                }
                case 7 -> {
                    System.out.println("Đọc từ file....");
                    manageSP.read();
                }
                case 8 -> {
                    System.out.println("Ghi vào file.....");
                    manageSP.write();
                }
                case 9 -> System.exit(0);
            }
        }
    }
}
