/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula.pkg2;

import java.util.Scanner;

public class Aula2 {

    public static void main(String[] args) {

        Scanner sc1 = new Scanner(System.in);
        int[] num = new int[5];
        int x, maior = 0, menor = 999 ^ 99;
        for (x = 0; x < 5; x++) {
            System.out.println("Insira um número: ");
            num[x] = sc1.nextInt();
            if (num[x] > maior) {
                maior = num[x];
            }
            if (num[x] < menor) {
                menor = num[x];
            }

        }
        System.out.println("-----------------------------------------------------");
        System.out.println("O maior número é " + maior);
        System.out.println("O menor número é " + menor);

    }
}
