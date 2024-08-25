/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab02.BaiTap06;

/**
 *
 * @author Admin
 */
public class XeMay extends PhuongTien {
    private double congSuat;

    public XeMay(String id, String hangSX, String mau, int namSX, double giaBan, double congSuat) {
        super("Xe gan may", id, hangSX, mau, namSX, giaBan);
        this.congSuat = congSuat;
    }

    @Override
    public String toString() {
        return super.toString() + ", congSuat=" + congSuat + " }";
    }
    
}
