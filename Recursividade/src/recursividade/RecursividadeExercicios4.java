/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package recursividade;

/**
 *
 * @author Paulo
 */
public class RecursividadeExercicios4 {

    public static int Calculo(int m, int n) {
        if (m == 0) {
            return (n + 1);
        } else {
            if (m != 0 && n == 0) {
                return 1 + Calculo(m - 1, 1);
            } else {
                return 2 + Calculo(m, n - 1);
            }
        }

    }
    
    public static void main(String[] args){
        System.out.println(Calculo(3,2));
    }
}
