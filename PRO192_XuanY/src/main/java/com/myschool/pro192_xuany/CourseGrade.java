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
public class CourseGrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // create a new Scanner object
        System.out.println("Enter your attendance score (out of 10): "); // print a line asking for the attendance score
        double attendance = sc.nextDouble(); // read the attendance score from the keyboard and assign it to variable attendance
        System.out.println("Enter your midterm score (out of 10): "); // print a line asking for the midterm score
        double midterm = sc.nextDouble(); // read the midterm score from the keyboard and assign it to variable midterm
        System.out.println("Enter your final score (out of 10): "); // print a line asking for the final score
        double Final = sc.nextDouble(); // read the final score from the keyboard and assign it to variable final
        sc.close(); // close the Scanner object

        // calculate and print the course grade
        double courseGrade = attendance * 0.1 + midterm * 0.1 + Final * 0.7; // calculate the course grade by using the given weights
        System.out.println("Your course grade is: " + courseGrade);
    }
}
        
    
    

