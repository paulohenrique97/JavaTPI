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
        String[] vetorString = binarioString.split("");
        //NÃO FUNCIONA DAQUI PRA BAIXO
        int vetorInt[] = new int[vetorString.length];
        for (int i = 0; i < vetorString.length-1 ; i++) {
            vetorInt[i] = Integer.parseInt(vetorString[i]);
        }
        return vetorInt;
    } 
    
}
