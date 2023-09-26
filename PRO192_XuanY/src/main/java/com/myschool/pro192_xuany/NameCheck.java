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
import java.util.Arrays; 
public class NameCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a new Scanner object
        System.out.println("Enter your full name: "); // print a line asking for your full name
        String name = sc.nextLine(); // read your full name from the keyboard and assign it to variable name
        sc.close(); // close the Scanner object

        // initialize an array of names
        String[] names = {"Truong Viet Hoang", "Nguyen Van Thuong", "Phan Thi Minh Phuong", "Le Quang Minh Da", "Vo Xuan Y"};

        // check if the input name exists in the array or not
        boolean exists = Arrays.asList(names).contains(name); // convert the array to a list and use the contains method to check if the name is in the list

        // print the result
        if (exists) { // if the name exists
            System.out.println("Yes"); // print "Yes"
        } else { // if the name does not exist
            System.out.println("No"); // print "No"
        }
    }
}
        
    

