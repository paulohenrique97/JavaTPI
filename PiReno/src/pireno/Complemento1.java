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
public class Complemento1 {
    
    public static void converteC1(int binario[]){
        for(int i=0; i < binario.length; i++){
            if(binario[i] == 0){
                binario[i] = 1;
            } else binario[i] = 0;
        }
    }
    
}
