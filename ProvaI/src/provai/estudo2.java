/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package provai;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class estudo2 {
    
    static void LeituraVetor (String vetor[], String texto) {
        
        for (int i = 0; i < vetor.length; i++){
            
            vetor[i] = JOptionPane.showInputDialog(null, texto + ":\nInsira a resposta da questão " + (i+1));
            
        }
        
    }
    
    static int nota(String gabarito[], String respostas[]) {
        
        int nota = 0;
        
        for (int i = 0; i < gabarito.length; i++){
            
            if (gabarito[i].equals(respostas[i])) nota += 3;
            
        }
        
        return nota;
        
    }
    
    public static void main(String[] args){
        
        String gabarito[] = new String[10];
        String respostas[] = new String[10];
        int nota;
        
        LeituraVetor(gabarito, "Gabarito");
        LeituraVetor(respostas, "Respostas do Aluno");        
        nota = nota(gabarito, respostas);
        
        JOptionPane.showMessageDialog(null, "A nota do aluno foi: " + nota);
        
    }
    
}
