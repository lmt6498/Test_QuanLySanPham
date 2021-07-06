package com.codegym;

import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Manage {
    List<SanPham> sanPhams = ReadWriteFile.readFile("src/SanPham.csv");
    static Scanner sc = new Scanner(System.in);
    static SortSP sortSP = new SortSP();

    public Manage() throws IOException {
    }

    public void show(){
        for (SanPham s: sanPhams){
            s.display();
        }
    }

    public void addSP (String maSP, String tenSP, double giaSP, int soLuong, String moTa) throws IOException {
        sanPhams.add(new SanPham(maSP,tenSP,giaSP,soLuong,moTa));
//        ReadWriteFile.writeFile("src/SanPham.csv",sanPhams);
    }

    public void update (String name) throws IOException {
        for (SanPham s: sanPhams){
            if (s.getTenSP().equals(name)){
                System.out.println("Nhập mã sản phẩm");
                String maSP = sc.nextLine();
                System.out.println("Nhập tên sản phẩm");
                String tenSP = sc.nextLine();
                System.out.println("Nhập giá sản phẩm");
                double giaSP = Double.parseDouble(sc.nextLine());
                System.out.println("Nhập số lượng: ");
                int soLuong = Integer.parseInt(sc.nextLine());
                System.out.println("Nhập mô tả: ");
                String moTa = sc.nextLine();

                s.setMaSP(maSP);
                s.setTenSP(tenSP);
                s.setGiaSP(giaSP);
                s.setSoLuong(soLuong);
                s.setMoTa(moTa);
//                ReadWriteFile.writeFile("src/SanPham.csv",sanPhams);
            }
        }
    }

    public void deleteSP() throws IOException {
        System.out.println("Nhập tên sản phẩm cần xóa ");
        String tenSP = sc.nextLine();
        sanPhams.removeIf(x -> x.getTenSP().equals(tenSP));
        ReadWriteFile.writeFile("src/SanPham.csv",sanPhams);
    }

    public void sortSP(){
        Collections.sort(sanPhams,sortSP);
    }

    public void giaMax(){
        double max = 0;
        int index = 0;
        for (int i = 0; i < sanPhams.size(); i++) {
            if(sanPhams.get(i).getGiaSP() > max){
                max = sanPhams.get(i).getGiaSP();
                index = i;
            }
        }
        System.out.println(sanPhams.get(index));
    }

    public void read() throws IOException {
        sanPhams = ReadWriteFile.readFile("src/SanPham.csv");
        show();
    }

    public void write() throws IOException {
        ReadWriteFile.writeFile("src/SanPham.csv",sanPhams);
    }


}
