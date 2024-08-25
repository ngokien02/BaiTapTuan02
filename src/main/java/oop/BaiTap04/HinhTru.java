/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BaiTap04;

/**
 *
 * @author Admin
 */
public class HinhTru extends HinhTron {
    private double chieuCao;

    public HinhTru(double chieuCao, double banKinh) {
        super(banKinh);
        this.chieuCao = chieuCao;
    }

    public HinhTru(double chieuCao) {
        this.chieuCao = chieuCao;
    }
    
    public HinhTru() {
        super(1);
        this.chieuCao = 1;
    } 

    public double getChieuCao() {
        return chieuCao;
    }

    public void setChieuCao(double chieuCao) {
        this.chieuCao = chieuCao;
    }

    @Override
    public double tinhDienTich() {
        return super.tinhChuVi() * chieuCao;  
    }

    public double tinhTheTich(){
        return super.tinhDienTich() * chieuCao;
    }

    @Override
    public String toString() {
        return "Hinh tru{ ban kinh: " + super.getBanKinh() + ", chieu cao:"
                + chieuCao + ", dien tich: " + tinhDienTich() + ", chu vi: "
                + ", the tich: " + tinhTheTich() + " }";
    }
    
}
