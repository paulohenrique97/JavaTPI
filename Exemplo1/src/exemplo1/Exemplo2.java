/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package exemplo1;

public class Exemplo2 {
    
    static int x, res;
    
    static void referencia(int x){
        x += 5;
        res=x;
    }
    
    public static void main(String[] args){
        x=10;
        System.out.println("x "+x);
        referencia(x);
        System.out.println("x "+x);
        System.out.println("RES "+res);
    }
    
}
