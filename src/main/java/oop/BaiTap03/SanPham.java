/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BaiTap03;
/**
 *
 * @author Admin
 */
public class SanPham {

    private String ten;
    private double gia;

    public SanPham(String ten, double gia) {
        this.ten = ten;
        this.gia = gia;
    }
    
    public SanPham() {
        this.ten = null;
        this.gia = 0;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public double getGia() {
        return gia;
    }

    public void setGia(double gia) {
        this.gia = gia;
    }

}
