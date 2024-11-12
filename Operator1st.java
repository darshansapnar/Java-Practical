/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operator1st;
import java.util.Scanner;
/**
 *
 * @author darsh
 */
public class Operator1st {

    public static void main(String[] args) {
       int first,second,add,subtract,multiply;
       float divide;
       Scanner scanner = new Scanner(System.in);
       
       System.out.print("Enter two numbers: ");
       first = scanner.nextInt();
       second = scanner.nextInt();
       
       add = first +second;
       subtract = first - second;
       multiply = first * second;
       divide = (float)first/second;
       
       System.out.println("sum ="+add);
       System.out.println("difference ="+subtract);
       System.out.println("Multiplication ="+multiply);
       System.out.println("division ="+divide);
    }
}
