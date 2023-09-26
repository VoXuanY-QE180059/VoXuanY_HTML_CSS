/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.myschool.pro192_xuany;

/**
 *
 * @author Xuan Y
 */
import java.util.Scanner;
public class Fullname {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a new Scanner object
        System.out.println("Enter your full name: "); // print a line asking for your full name
        String fullName = sc.nextLine(); // read your full name from the keyboard and assign it to variable fullName
        sc.close(); // close the Scanner object

        // print your full name
        System.out.println("Your full name is: " + fullName);
    }

    }

