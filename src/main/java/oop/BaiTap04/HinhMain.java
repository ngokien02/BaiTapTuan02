/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BaiTap04;

/**
 *
 * @author Admin
 */
public class HinhMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        HinhTron tron = new HinhTron();
        System.out.println(tron.toString());
        
        HinhTru tru = new HinhTru(6, 2);
        System.out.print(tru.toString());
    }
    
}
