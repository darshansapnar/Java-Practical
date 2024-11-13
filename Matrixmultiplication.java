/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.matrixmultiplication;
import java.util.Scanner;

public class Matrixmultiplication {
    public static void main(String args[]) {
        int i, j, k, n;
        Scanner input = new Scanner(System.in);

        System.out.println("Enter the base of squared matrices");
        n = input.nextInt();

        int[][] a = new int[n][n];
        int[][] b = new int[n][n];
        int[][] c = new int[n][n];

        System.out.println("Enter the elements of 1st matrix row-wise:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = input.nextInt();
            }
        }

        System.out.println("Enter the elements of 2nd matrix row-wise:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = input.nextInt();
            }
        }

        System.out.println("Multiplying the matrices...");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                for (k = 0; k < n; k++) {
                    c[i][j] =c[i][j] + a[i][k] * b[k][j];
                }
            }
        }

        System.out.println("The resulting matrix is:");
        for (i = 0; i < n; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }

        input.close();
    }
}

