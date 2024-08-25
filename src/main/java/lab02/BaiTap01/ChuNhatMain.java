/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.BaiTap01;

/**
 *
 * @author Admin
 */
public class ChuNhatMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        ChuNhat cn = new ChuNhat(4, 3);
        ChuNhat vg = new Vuong(3);
        System.out.println("Hinh chu nhat: ");
        cn.xuat();
        System.out.println("\nHinh vuong: ");
        vg.xuat();
    }
    
}
