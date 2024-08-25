/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BaiTap01;

/**
 *
 * @author Admin
 */
public class Rectangle {
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }
    
    public Rectangle() {
        length = 1;
        width = 1;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }
    
    public int Area(){
        return width * length;
    }
    
    public int Parameter(){
        return (width + length) * 2; 
    }

    public String ToString(Rectangle r) {
        return "length = " + length + ", width = " + width + " ,area = " + " ,parameter = " + Parameter();
    }
    
}
