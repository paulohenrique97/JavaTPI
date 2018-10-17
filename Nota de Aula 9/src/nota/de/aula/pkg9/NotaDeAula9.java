/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nota.de.aula.pkg9;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class NotaDeAula9 {
    
    static String leString;
    static int leInt;
    
    static void leituraString(String texto){
        leString = JOptionPane.showInputDialog(null, texto);
    }
    
    static void leituraInt(String texto){
        leInt = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
    }
    
    static void repeteString(String texto, int vezes){
        while (vezes>0){
            JOptionPane.showMessageDialog(null, texto);
            vezes = vezes/2;
        }
    }
    
    public static void main(String[] args) {
        String S;
        int N;
        JOptionPane.showMessageDialog(null, "Repete texto.");
        leituraString("Insira um texto para ser repetido: ");
        S = leString;
        leituraInt("Insira quantas vezes o texto deve ser repetido: ");
        N = leInt;
        repeteString(S, N);
    }
    
}
