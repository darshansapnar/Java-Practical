/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.fibonaccicombine;



class FibonacciCombine {
    
    // Non-recursive Fibonacci method (Iterative)
    public static void nonRecursiveFibonacci(int count) {
        int n1 = 0, n2 = 1, n3;
        System.out.print(n1 + " " + n2); // Printing 0 and 1
        
        // Loop starts from 2 because 0 and 1 are already printed
        for (int i = 2; i < count; ++i) {
            n3 = n1 + n2;
            System.out.print(" " + n3);
            n1 = n2;
            n2 = n3;
        }
        System.out.println(); // Print a new line after the non-recursive output
    }

    // Recursive Fibonacci method
    static void recursiveFibonacci(int count, int n1, int n2) {
        if (count == 0) {
            return; // Base case: stop recursion when count reaches 0
        }
        
        int n3 = n1 + n2;
        System.out.print(" " + n3);
        
        // Recursive call to calculate the next Fibonacci number
        recursiveFibonacci(count - 1, n2, n3);
    }

    public static void main(String[] args) {
        int count = 10;  // Number of terms in Fibonacci series
        
        // Non-recursive approach
        System.out.println("Fibonacci Series using non-recursive method:");
        nonRecursiveFibonacci(count);
        
        // Recursive approach
        System.out.println("Fibonacci Series using recursive method:");
        System.out.print("0 1"); // Printing the first two numbers
        recursiveFibonacci(count - 2, 0, 1); // Call the recursive function (count-2 because 0 and 1 are already printed)
    }
}
