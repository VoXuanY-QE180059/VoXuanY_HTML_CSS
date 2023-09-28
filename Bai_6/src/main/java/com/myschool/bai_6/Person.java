/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myschool.bai_6;

/**
 *
 * @author Xuan Y
 */
public class Person {
    // Tạo class Person
    // Khai báo các thuộc tính
    private String email;
    private String name;
    private int yearOfBirth;
    private String gender;
    private String phoneNumber;
    private String address;

    // Tạo constructor
    public Person(String email, String name, int yearOfBirth, String gender, String phoneNumber, String address) {
        this.email = email;
        this.name = name;
        this.yearOfBirth = yearOfBirth;
        this.gender = gender;
        this.phoneNumber = phoneNumber;
        this.address = address;
    }

    // Tạo phương thức hiển thị tất cả thông tin
    public void displayAllInfo() {
        System.out.println("Email: " + email);
        System.out.println("Ho va Ten: " + name);
        System.out.println("Nam sinh: " + yearOfBirth);
        System.out.println("Gioi Tinh: " + gender);
        System.out.println("So Dien Thoai: " + phoneNumber);
        System.out.println("Dia Chi: " + address);
    }

    // Tạo phương thức thay đổi số điện thoại
    public void changePhoneNumber(String newPhoneNumber) {
        this.phoneNumber = newPhoneNumber;
    }

    // Tạo phương thức thay đổi địa chỉ
    public void changeAddress(String newAddress) {
        this.address = newAddress;
    }
}

// Khai báo object với thông tin cá nhân sinh viên


    

