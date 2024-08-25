/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.BaiTap01;

/**
 *
 * @author Admin
 */
public class ChuNhat {
    private double dai, rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }
    
    public double getChuVi(){
        return (dai + rong) * 2;
    }
    
    public double getDienTich(){
        return dai * rong;
    }
    
    public void xuat(){
        System.out.print("Chieu dai: " + dai + ", chieu rong: "
        + rong + ", chu vi: " + getChuVi() + ", dien tich: " + getDienTich());
    }
    
}
