/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pi;

import javax.swing.JOptionPane;

/**
 *
 * @author a06164358
 */
public class leitura {
    
    public static void ler(int binVetor[], String n){
        String binString;
        binString = JOptionPane.showInputDialog(null, "Insira o "+n+"º número binário: ");
        StringBuilder sb = new StringBuilder(binString);
        binString = sb.reverse().toString();
        String binVetorString[] = new String[binVetor.length];
        binVetorString = binString.split("");
    }
    
}
