/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BaiTap03;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SanPhamMain {

    /**
     * @param args the command line arguments
     */
    static List<SanPham> listSP = new ArrayList<>();
    static SanPham sp = null;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        // TODO code application logic here
        menu();
    }

    public static void menu() {
        String tiep = "y";
        while ("y".equals(tiep)) {
            System.out.println("\n=====QUAN LY SAN PHAM=====");
            System.out.print("\n*****Menu*****"
                    + "\n1. Nhap san pham"
                    + "\n2. Sap xep giam dan theo gia"
                    + "\n3. Xoa san pham theo ten"
                    + "\n4. Tinh gia trung binh cua cac san pham"
                    + "\nChon hanh dong ban muon thuc hien: ");
            int menu = sc.nextInt();
            switch (menu) {
                case 1:
                    nhapSP();
                    break;
                case 2:
                    xepGiamTheoGia();
                    break;
                case 3:
                    xoaTheoTen();
                    break;
                case 4:
                    tinhTB();
                    break;
                default:
                    System.out.println("Chon ko hop le!");
                    break;
            }
            System.out.print("\nBan co muon quan ly tiep?(y/n) ");
            tiep = sc.next();
        }
    }

    public static void nhapSP() {
        String nhap = "y";
        while ("y".equals(nhap)) {
            sp = new SanPham();
            System.out.print("\nNhap ten san pham: ");
            sp.setTen(sc.next());
            System.out.print("\nNhap gia san pham: ");
            sp.setGia(sc.nextDouble());
            listSP.add(sp);
            System.out.print("\nBan co muon nhap tiep?(y/n) ");
            nhap = sc.next();
        }
    }

    public static void xepGiamTheoGia() {
        Comparator<SanPham> cpr = new Comparator<SanPham>() {
            @Override
            public int compare(SanPham sp1, SanPham sp2) {
                return Double.compare(sp1.getGia(), sp2.getGia());
            }
        };
        Collections.sort(listSP, cpr);
        Collections.reverse(listSP);
        for (SanPham sp : listSP) {
            System.out.println("\nSan pham: " + sp.getTen() + ", gia: " + sp.getGia());
        }
    }

    public static void xoaTheoTen() {
        String xoaTiep = "y";
        while ("y".equals(xoaTiep)) {
            System.out.print("\nNhap ten san pham can xoa: ");
            String spXoa = sc.next();
            for (int i = 0; i < listSP.size(); i++) {
                if (sp.getTen().equals(spXoa)) {
                    listSP.remove(sp);
                }
            }
            System.out.print("\nBan co muon xoa tiep?(y/n) ");
            xoaTiep = sc.next();
        }

    }
    
    public static void tinhTB(){
        double tongGia = 0;
        for (int i = 0; i < listSP.size(); i++) {
            tongGia += listSP.get(i).getGia();
        }
        double tb = tongGia / listSP.size();
        System.out.println("\nGia trung binh cac san pham: " + tb);
    }
    
}
