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
        
    public static int[] StringParaVetorInt(String binarioString){
        
        char[] vetor = binarioString.toCharArray();		
        int vetorInt[] = new int[vetor.length];
	for (int i = 0; i < vetor.length; i++) {
            vetorInt[i] = Character.getNumericValue(vetor[i]);
	}        
        return vetorInt;
    }
    
    public static String VetorIntParaString(int[] vetorBinario){
        
        String binS = "";
        for (int i = 0; i < vetorBinario.length; i++) {
            binS += Integer.toString(vetorBinario[i]);
        }
        return binS;
    }
    
}
