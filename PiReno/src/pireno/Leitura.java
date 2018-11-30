/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pireno;

/**
 *
 * @author A06164358
 */
public class Leitura {
        
    public static int[] StringParaVetor(String binarioString){
        String[] bin = binarioString.split("");
        //NÃO FUNCIONA DAQUI PRA BAIXO
        int vetor[] = new int[bin.length];
        for (int i = 0; i < bin.length-1 ; i++) {
            vetor[i] = Integer.parseInt(bin[i]);
        }
        return vetor;
    } 
    
}
