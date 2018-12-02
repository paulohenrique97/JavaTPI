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
public class Complementos {
    
    public static void converteC1(int binario[]){
        for(int i=0; i < binario.length; i++){
            if(binario[i] == 0){
                binario[i] = 1;
            } else binario[i] = 0;
        }
    }
   
    public static String converteC2(int[] c1){
        int i = c1.length-1;
        String binC2 = "";
        if (c1[i] == 0){            
            c1[i] = 1;           
            binC2 = Leitura.VetorIntParaString(c1);            
        } else {
            while(i >= 0){ 
                if (c1[i] == 0){ 
                   c1[i] = 1;
                   binC2 = Leitura.VetorIntParaString(c1);
                   i = -1;
                } else if (c1[i] == 1 && i == 0){
                   c1[i] = 0;
                   binC2 = "1" + Leitura.VetorIntParaString(c1);
                   i = -1;
                } else {
                    c1[i] = 0;
                    i--; 
                }
            }
        }
        return binC2;
    }
    
}
