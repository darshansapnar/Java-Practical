/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.operator2;
import java.util.Scanner;

/**
 *
 * @author darsh
 */
public class Operator2 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        System.out.print("input first number:");
        int num1 = in.nextInt();
        
        System.out.print("input second number:");
        int num2 = in.nextInt();
        
        System.out.println(num1+"+"+num2+"="+(num1+num2));
        System.out.println(num1+"-"+num2+"="+(num1-num2));
        System.out.println(num1+"*"+num2+"="+(num1*num2));
        System.out.println(num1+"/"+num2+"="+(num1/num2));
        
    }  
        
        
    }

