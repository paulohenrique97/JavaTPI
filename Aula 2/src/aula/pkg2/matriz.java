/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg2;

import java.util.Scanner;

/**
 *
 * @author a06164358
 */
public class matriz {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[][] num = new int[3][3];
        int l, c, dp = 0, ds = 0;
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                num[l][c] = sc1.nextInt();
            }
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Matriz: ");
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                System.out.print(num[l][c] + " ");
            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Diagonal Principal: ");
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                if (c == l) {
                    System.out.print(num[l][c] + " ");
                    dp = dp + num[l][c];
                } else {
                    System.out.print("x ");
                }

            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Soma da Diagonal Principal: " + dp);
        System.out.println("---------------------------------------------------");
        System.out.println("Diagonal Secundária: ");
        for (l = 0; l < 3; l++) {
            for (c = 0; c < 3; c++) {
                if (l + c == 2) {
                    System.out.print(num[l][c] + " ");
                    ds = ds + num[l][c];
                } else {
                    System.out.print("x ");
                }

            }
            System.out.println();
        }
        System.out.println("---------------------------------------------------");
        System.out.println("Soma da Diagonal Secundária: " + ds);
        System.out.println("---------------------------------------------------");
    }
}
