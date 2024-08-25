/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BaiTap04;

/**
 *
 * @author Admin
 */
public class HinhTron {
    private double banKinh;

    public HinhTron(double banKinh) {
        this.banKinh = banKinh;
    }

    public HinhTron() {
        this.banKinh = 1;
    }
    
    public double getBanKinh() {
        return banKinh;
    }

    public void setBanKinh(double banKinh) {
        this.banKinh = banKinh;
    }
    
    public double tinhDienTich(){
        return Math.PI * banKinh * banKinh;
    }
    
    public double tinhChuVi(){
        return Math.PI * banKinh * 2;
    }

    @Override
    public String toString() {
        return "Hinh tron{ ban kinh: " + banKinh + ", chu vi:  " + tinhChuVi()
                + ", dien tich: " + tinhDienTich() + " }";
    }
    
}
