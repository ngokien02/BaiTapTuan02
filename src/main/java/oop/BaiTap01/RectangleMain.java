/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package oop.BaiTap01;

/**
 *
 * @author Admin
 */
public class RectangleMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Rectangle r1, r2;
        
        r1 = new Rectangle(9, 6);
        r2 = new Rectangle();
        
        System.out.println("r1: " + r1.ToString(r1));
        System.out.println("r2: " + r2.ToString(r2));
    }
    
}
