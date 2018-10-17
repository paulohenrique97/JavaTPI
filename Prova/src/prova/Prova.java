/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova;

import javax.swing.JOptionPane;

public class Prova {

    static void leituraVetor (int vetor[]) {
        
        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da casa " + (i+1) + ":"));
            
        }
        
    }
    
    static int compara (int vetor1[], int vetor2[]){
        
        int resultado = 0;
        
        for (int i = 0; i< vetor1.length; i++) {
            
            if (vetor1[i] == vetor2[i]) resultado += 1;
            
        }
        
        return resultado;
        
    }
    
    public static void main(String[] args) {
        
        int a[] = new int[10];
        int b[] = new int[10];
        
        leituraVetor(a);
        leituraVetor(b);
        
        int iguais = compara(a, b);
        
        JOptionPane.showMessageDialog(null, iguais + " casas são iguais.");
        
    }
    
}
