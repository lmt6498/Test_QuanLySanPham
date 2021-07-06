package com.codegym;

public class SanPham {
    private String maSP;
    private String tenSP;
    private double giaSP;
    private int soLuong;
    private String moTa;

    public SanPham(String maSP, String tenSP, double giaSP, int soLuong, String moTa) {
        this.maSP = maSP;
        this.tenSP = tenSP;
        this.giaSP = giaSP;
        this.soLuong = soLuong;
        this.moTa = moTa;
    }

    public String getMaSP() {
        return maSP;
    }

    public void setMaSP(String maSP) {
        this.maSP = maSP;
    }

    public String getTenSP() {
        return tenSP;
    }

    public void setTenSP(String tenSP) {
        this.tenSP = tenSP;
    }

    public double getGiaSP() {
        return giaSP;
    }

    public void setGiaSP(double giaSP) {
        this.giaSP = giaSP;
    }

    public int getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(int soLuong) {
        this.soLuong = soLuong;
    }

    public String getMoTa() {
        return moTa;
    }

    public void setMoTa(String moTa) {
        this.moTa = moTa;
    }

    @Override
    public String toString() {
        return "SanPham{" +
                "maSP='" + maSP + '\'' +
                ", tenSP='" + tenSP + '\'' +
                ", giaSP=" + giaSP +
                ", soLuong=" + soLuong +
                ", moTa='" + moTa + '\'' +
                '}';
    }

    public void display (){
        System.out.println("SanPham{" +
            "maSP='" + getMaSP() +
                    ", tenSP='" + getTenSP()+
                    ", giaSP=" + getGiaSP() +
                    ", soLuong=" + getSoLuong() +
                    ", moTa='" + getMoTa()+
                    '}');
    }

    public String write(){
        return maSP + "," + tenSP + "," + giaSP + "," + soLuong + "," + moTa;
    }
}
