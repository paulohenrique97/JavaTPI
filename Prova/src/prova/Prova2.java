/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package prova;

import javax.swing.JOptionPane;

public class Prova2 {
    
    static void leituraVetor (int vetor[]) {
        
        for (int i = 0; i < vetor.length; i++) {
            
            vetor[i] = Integer.parseInt(JOptionPane.showInputDialog(null, "Insira o número da casa " + (i+1) + ":"));
            
        }
            
    }
    
    static void inverte (int vetor[]) {
        
        int backup[] = new int[vetor.length];
        
        for (int i = 0; i < vetor.length; i++) {
            
            backup[i] = vetor[i];
            
        }
        
        int j = vetor.length-1;
        
        for (int i = 0; i < vetor.length; i++) {
            
                vetor[i] = backup[j];
                
                if (j > 0) j--;
                
        }
    
    }    
        
    static void escreveVetor(int vetor[]) {
            
       String vetorS = "|";
       
       for (int i = 0; i < vetor.length; i++) {
           
           vetorS += vetor[i] + "|";
           
       }
       
       JOptionPane.showMessageDialog(null, vetorS);
            
    }           
    
    public static void main(String[] args) {
        
        int a[] = new int[10];
        
        leituraVetor(a);
        inverte(a);       
        escreveVetor(a);
        
    }   
    
}
