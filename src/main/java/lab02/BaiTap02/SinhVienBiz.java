/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.BaiTap02;

/**
 *
 * @author Admin
 */
public class SinhVienBiz extends SinhVien {
    public double diemMarketing, diemSales;

    public SinhVienBiz(double diemMarketing, double diemSales, String hoTen) {
        super(hoTen, "Biz");
        this.diemMarketing = diemMarketing;
        this.diemSales = diemSales;
    }

    @Override
    public double getDiem() {
        return (2 * diemMarketing + diemSales) / 3;
    }
    
    
}
