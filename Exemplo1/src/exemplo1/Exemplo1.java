/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

import javax.swing.JOptionPane;

public class Exemplo1 {

    static int a[][] = new int[3][3];
    static int b[][] = new int[3][3];

    static void leitura(int x[][], String texto) {
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                x[i][j] = Integer.parseInt(JOptionPane.showInputDialog(texto + "\nInsira o número da coluna " + (i + 1) + " e linha " + (j + 1)));
            }
        }
    }

    static int somaDiagonal(int x[][]) {
        int soma = 0;
        for (int i = 0; i < x.length; i++) {
            soma += x[i][i];
        }
        return soma;
    }

    static void escreveMatriz(int x[][]) {
        String matriz = "";
        for (int i = 0; i < x.length; i++) {
            for (int j = 0; j < x.length; j++) {
                matriz += x[i][j] + " ";
            }
            matriz += "\n";
        }
        JOptionPane.showMessageDialog(null, matriz);
    }

    static void maior(int x, int y) {
        if (x > y) {
            JOptionPane.showMessageDialog(null, "A DP de 'A' que é igual à: " + x + " é maior que a DP de 'B' que é igual à: " + y);
        } else if (x == y) {
            JOptionPane.showMessageDialog(null, "As DP's das duas matrizes são iguais à: " + x);
        } else {
            JOptionPane.showMessageDialog(null, "A DP de 'B' que é igual à: " + y + " é maior que a DP de 'A' que é igual à: " + x);
        }
    }

    public static void main(String[] args) {
        int somaa, somab;
        leitura(a, "Matriz A: ");
        escreveMatriz(a);
        somaa = somaDiagonal(a);
        leitura(b, "Matriz B: ");
        escreveMatriz(b);
        somab = somaDiagonal(b);
        maior(somaa, somab);
    }

}
