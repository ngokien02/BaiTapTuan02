/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BaiTap02;

import java.text.DecimalFormat;

/**
 *
 * @author Admin
 */
public class AccountMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        DecimalFormat fm = new DecimalFormat("#,##0");

        Account ac1, ac2;

        ac1 = new Account("ac001", "Ngo Trung Hieu Kien", 100000000);
        ac2 = new Account("ac002", "Ha Tan Tai", 50000000);

        System.out.println("*****THONG TIN BAN DAU*****");
        System.out.print("Thong tin tai khoan 1: ");
        ac1.print();
        System.out.print("Thong tin tai khoan 2: ");
        ac2.print();
        
        ac1.credit(15000000);
        ac2.debit(50000001);
        ac1.print();
        ac2.print();
        
        ac1.transfer(ac2, 25000000);
        ac1.print();
        ac2.print();
    }

}
