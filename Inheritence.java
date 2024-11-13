/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.inheritence;



import java.util.Scanner;

class Student {
    String name;
    int rollNo;

    // Method to input student details
    void inputDetails() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        name = scanner.nextLine();
        System.out.print("Enter student roll number: ");
        rollNo = scanner.nextInt();
    }

    // Method to display student details
    void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Roll Number: " + rollNo);
    }
}

class Topper extends Student {
    // Additional method specific to Topper
    void top() {
        System.out.println(name + " is a Topper.");
    }
}

class Backbencher extends Student {
    // Additional method specific to Backbencher
    void play() {
        System.out.println(name + " is a Backbencher and loves to play.");
    }
}

public class Inheritence {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Create a Topper object
        System.out.println("Enter details for the Topper:");
        Topper topper = new Topper();
        topper.inputDetails();  // Input common details
        topper.displayDetails();  // Display common details
        topper.top();  // Topper-specific method
        
        // Create a Backbencher object
        System.out.println("\nEnter details for the Backbencher:");
        Backbencher backbencher = new Backbencher();
        backbencher.inputDetails();  // Input common details
        backbencher.displayDetails();  // Display common details
        backbencher.play();  // Backbencher-specific method
        
        scanner.close();  // Close the scanner
    }
}
