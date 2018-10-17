/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author a06164358
 */
public class Aula3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc1 = new Scanner(System.in);
        String nome, nvencedor = null;
        int i = 0;
        int tempo;
        int tvencedor = 9999;
        float media, soma = 0;
        for (i = 0; i < 5; i++) {
            System.out.println("Qual o nome do piloto " + (i + 1) + "?");
            nome = sc1.next();
            System.out.println("Qual o tempo em segundos de " + nome + "?");
            tempo = sc1.nextInt();
            soma = tempo + soma;
            if (tempo < tvencedor) {
                tvencedor = tempo;
                nvencedor = nome;
            }
            System.out.println("-----------------------------------------------");
        }
        media = soma / 5;
        System.out.println("O vencedor é " + nvencedor + ", com: " + tvencedor + "s");
        System.out.println("A média geral foi de: " + media + "s");
    }
}
