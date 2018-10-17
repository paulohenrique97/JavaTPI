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
public class Questao2 {

    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int produto, peso;
        double preco = 0, imposto = 0, precot;
        String pais;
        System.out.println("Qual o código do produto de 1 a 10?");
        produto = sc1.nextInt();
        System.out.println("Qual o peso do produto em gramas?");
        peso = sc1.nextInt();
        System.out.println("Qual o código do país do produto? A, B ou C?");
        pais = sc1.next();
        if (produto > 0 && produto < 5) {
            preco = 10 * peso;
        } else if (produto > 4 && produto < 8) {
            preco = 25 * peso;
        } else if (produto > 7 && produto < 11) {
            preco = 35 * peso;
        }
        if (pais.equals("A")) {
            imposto = preco * 0;
        } else if (pais.equals("B")) {
            imposto = preco * 0.15;
        } else if (pais.equals("C")) {
            imposto = preco * 0.25;
        }
        precot = preco - imposto;
        System.out.println("--------------------------------------------------");
        System.out.println("Preço: " + preco + " Imposto: " + imposto + " Preço final: " + precot);
    }
}
