/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo1;

public class Exemplo3 {

    static int funcao(int a, int b) {
        int c = 5;
        int d = 3;
        b += 5;
        a++;
        c++;
        d++;
        return (a + b + c + d);
    }

    public static void main(String[] args) {
        int a = 2, b = 4, var;
        var = funcao(a, b);
        System.out.println(a);
        System.out.println(b);
        System.out.println(var);
    }
}
