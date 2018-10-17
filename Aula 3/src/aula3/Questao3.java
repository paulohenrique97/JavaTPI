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
public class Questao3 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        String[] G = new String[10];
        String[] R = new String[10];
        int acertos = 0, nota = 0, i;
        for (i = 0; i < 10; i++) {
            System.out.println("Qual a resposta certa da questão " + (i + 1) + " ?");
            G[i] = sc1.next();
        }
        for (i = 0; i < 10; i++) {
            System.out.println("Qual a resposta do aluno para a questão " + (i + 1) + " ?");
            R[i] = sc1.next();
        }
        for (i = 0; i < 10; i++) {
            if (G[i].equals(R[i])) {
                acertos = acertos + 1;
                nota = nota + 3;
            }
        }
        System.out.println("----------------------------------------------------");
        System.out.println("O aluno teve " + acertos + " acertos.");
        System.out.println("A nota do aluno foi: " + nota + " pontos.");
        System.out.println("----------------------------------------------------");
    }

}
