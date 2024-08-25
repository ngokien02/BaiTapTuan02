/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab02.BaiTap02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Admin
 */
public class SVMain {

    /**
     * @param args the command line arguments
     */
    static Scanner sc = new Scanner(System.in);
    static List<SinhVien> listSV = new ArrayList<>();
    static SinhVien sv = null;

    public static void main(String[] args) {
        // TODO code application logic here

        Menu();
    }

    public static void Menu() {
        int chon = 0;
        while (chon != 5) {
            System.out.print("\n=====QUAN LY SINH VIEN=====");
            System.out.print("\n1. Nhap danh sach sinh vien"
                    + "\n2. Xuat danh sach sinh vien"
                    + "\n3. Danh sach sinh vien hoc luc gioi"
                    + "\n4. Danh sach sinh vien theo diem"
                    + "\n5. Ket thuc"
                    + "\nChon hanh dong ban muon thuc hien: ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    nhapSV();
                    break;
                case 2:
                    xuatSV();
                    break;
                case 3:
                    xuatSVGioi();
                    break;
                case 4:
                    sapXepTheoDiem();
                    break;
                case 5:
                    System.out.print("\nGood bye. See you again!");
                    break;
            }
        }
    }

    public static void nhapSV() {
        String tiep = "y";
        int chon = 0;
        while ("y".equals(tiep)) {
            System.out.print("\nChon loai sinh vien muon nhap(1:IT, 2:Biz): ");
            chon = sc.nextInt();
            switch (chon) {
                case 1:
                    System.out.print("\nNhap ho ten: ");
                    String hoTen = sc.next();
                    System.out.print("\nNhap diem Java: ");
                    double diemJava = sc.nextDouble();
                    System.out.print("\nNhap diem HTML: ");
                    double diemHTML = sc.nextDouble();
                    System.out.print("\nNhap diem CSS: ");
                    double diemCSS = sc.nextDouble();
                    sv = new SinhVienIT(diemJava, diemHTML, diemCSS, hoTen);
                    listSV.add(sv);
                    break;
                case 2:
                    System.out.print("\nNhap ho ten: ");
                    hoTen = sc.next();
                    System.out.print("\nNhap diem Marketing: ");
                    double diemMKT = sc.nextDouble();
                    System.out.print("\nNhap diem Sales: ");
                    double diemSales = sc.nextDouble();
                    sv = new SinhVienBiz(diemMKT, diemSales, hoTen);
                    listSV.add(sv);
                    break;
                default:
                    System.out.print("\nChon ko hop le!");
                    break;
            }
            System.out.print("\nBan co muon nhap tiep?(y/n) ");
            tiep = sc.next();
        }
    }

    public static void xuatSV() {
        for (SinhVien sv : listSV) {
            System.out.println(sv.toString());
        }
    }

    public static void xuatSVGioi() {
        int dem = 1;
        for (SinhVien sv : listSV) {
            if ("Gioi".equals(sv.getHocLuc())) {
                System.out.println("\n" + dem + ". Ho ten: " + sv.getHoTen()
                        + ", diem trung binh: " + sv.getDiem());
                dem++;
            }
        }
    }

    public static void sapXepTheoDiem() {
        Comparator<SinhVien> cpr = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv1.getDiem(), sv2.getDiem());
            }
        };
        Collections.sort(listSV, cpr);

        for (SinhVien sv : listSV) {
            System.out.println(sv.toString());
        }
    }

}
