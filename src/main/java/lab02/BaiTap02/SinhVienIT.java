/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.BaiTap02;

/**
 *
 * @author Admin
 */
public class SinhVienIT extends SinhVien {
    public double diemJava, diemHTML, diemCSS;

    public SinhVienIT(double diemJava, double diemHTML, double diemCSS, String hoTen) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHTML = diemHTML;
        this.diemCSS = diemCSS;
    }
    
    @Override
    public double getDiem() {
        return (2 * diemJava + diemHTML + diemCSS) / 4;
    }
    
}
