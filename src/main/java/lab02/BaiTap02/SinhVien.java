/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.BaiTap02;

/**
 *
 * @author Admin
 */
public abstract class SinhVien {
    private String hoTen, nganh;

    public SinhVien(String hoTen, String nganh) {
        this.hoTen = hoTen;
        this.nganh = nganh;
    }

    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    abstract public double getDiem();
    
    public String getHocLuc(){
        if(getDiem() < 5 && getDiem() >= 0){
            return "Yeu";
        }
        else if(getDiem() >= 5 && getDiem() < 6.5){
            return "Trung binh";
        }
        else if(getDiem() >= 6.5 && getDiem() < 7.5){
            return "Kha";
        }
        else if(getDiem() >= 7.5 && getDiem() < 9){
            return "Gioi";
        }
        else if(getDiem() >= 9 && getDiem() <= 10){
            return "Xuat sac";
        }
        else{
            return "Diem khong hop le, khong the xep loai hoc luc!";
        }
    }

    @Override
    public String toString() {
        return "\nSinhVien: " + hoTen + ", nganh=" + nganh
                + "\nDiem trung binh: " + getDiem();
    }
    
}
