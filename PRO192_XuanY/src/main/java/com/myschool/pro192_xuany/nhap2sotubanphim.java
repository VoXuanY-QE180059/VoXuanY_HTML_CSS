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
public class nhap2sotubanphim {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a new Scanner object
        System.out.println("Enter the first number: "); // print a line asking for the first number
        double a = sc.nextDouble(); // read the first number from the keyboard and assign it to variable a
        System.out.println("Enter the second number: "); // print a line asking for the second number
        double b = sc.nextDouble(); // read the second number from the keyboard and assign it to variable b
        sc.close(); // close the Scanner object

        // calculate and print the results of addition, subtraction, multiplication, and division
        System.out.println("The sum of two numbers is: " + (a + b));
        System.out.println("The difference of two numbers is: " + (a - b));
        System.out.println("The product of two numbers is: " + (a * b));
        System.out.println("The quotient of two numbers is: " + (a / b));
    }
}
        
  

