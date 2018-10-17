/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author paulo
 */
public class Questao4 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int[][] matriz = new int[50][50];
        int soma = 0, i, j;
        for (i = 0; i < 50; i++) {
            for (j = 0; j < 50; j++) {
                System.out.println("Qual o valor da posição " + i + "," + j + "?");
                matriz[i][j] = sc1.nextInt();
            }

        }
        for (i = 0; i < 50; i++) {
            for (j = 0; j < 50; j++) {
                if (j - i >= 1) {
                    soma = matriz[i][j] + soma;
                }
            }
        }
        System.out.println("---------------------------------------------------------------------");
        System.out.println("A soma do elemetos que estão acima da diagonal principal é: " + soma);
    }

}
