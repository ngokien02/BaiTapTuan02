/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package oop.BaiTap02;

/**
 *
 * @author Admin
 */
public class Account {

    private String id, name;
    private int balance;

    public Account(String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBalance() {
        return balance;
    }

    public void setBalance(int balance) {
        this.balance = balance;
    }

    public void credit(int amount) {
        if (amount >= 0) {
            balance += amount;
            System.out.println("Tai khoan " + this.getName() + " Giao dich nap tien thanh cong. So tien nap: " + amount);
        } else {
            System.out.println("Tai khoan " + this.getName() + " Giao dich that bai. So tien nap phai lon hon 0");
        }
    }

    public void debit(int amount) {
        if (balance >= amount) {
            balance -= amount;
            System.out.println("Tai khoan " + this.getName() + " Giao dich rut tien thanh cong. So tien rut: " + amount);
        } else {
            System.out.println("Tai khoan " + this.getName() + " Giao dich that bai. So du khong du");
        }
    }

    public void transfer(Account other, int amount) {
        if (balance >= amount) {
            balance -= amount;
            other.balance += amount;
            System.out.println("Tai khoan " + this.getName() + " Giao dich chuyen khoan thanh cong. Da chuyen: " + amount
                    + " cho tai khoan: " + other.getName());
        } else {
            System.out.println("Tai khoan " + this.getName() + " Giao dich that bai. So du khong du");
        }
    }

    public void print() {
        System.out.println("\nId: " + this.getId()
                + "\nName: " + this.getName()
                + "\nBalance: " + this.getBalance() + "\n");
    }
}
