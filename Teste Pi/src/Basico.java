/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Paulo
 */
public class Basico {
    
    public static int result[] = new int[4];  // INICIALIZA A VARIAVEL INTEIRA GLOBAL RESULT
    
    public static String somar(int a[], int b[]) {
        String resultado = "";
        for (int i = 3; i >= 0; i--) {

            if (a[i] == 0 && b[i] == 0) {
                result[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 0) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                result[i] = 0;
                if (i != 0) { //Testa se está na ultima casa
                    for (int j = i - 1; j >= 0; j--) { //se não estiver roda todas as outras casas até encontrar um 0
                        if (a[j] == 0) { //se achar só troca pra 1 e sai do if
                            a[j] = 1;
                            break;
                        } else {
                            a[j] = 0; //se não achar vai trocando pra 0
                        }
                    }
                }
            }

        }
        for (int i = 0; i <= 3; i++) {
            resultado += result[i]; // SALVA O RESULTADO EM UMA STRING PARA SER EXIBIDA EM UM JOPTION PANE

        }
        return resultado;
    }
    
    public static String subtrair(int a[], int b[]) {
        int resto;
        String resultado = "";
        for (int i = 3; i >= 0; i--) {

            if (a[i] == 0 && b[i] == 0) {
                result[i] = 0;
            } else if (a[i] == 0 && b[i] == 1) {
                result[i] = 1;
                if (i != 0) { //Testa se está na ultima casa
                    for (int j = i - 1; j >= 0; j--) { //se não estiver roda todas as outras casas até encontrar 1
                        if (a[j] == 1) { //se achar só troca pra 0 e sai do if
                            a[j] = 0;
                            break;
                        } else {
                            a[j] = 0; //se não achar vai trocando pra 0
                        }
                    }
                }
            } else if (a[i] == 1 && b[i] == 0) {
                result[i] = 1;
            } else if (a[i] == 1 && b[i] == 1) {
                result[i] = 0;

            }

        }
        for (int i = 0; i <= 3; i++) {
            resultado += result[i];

        }
        return resultado;
    }
    
    public static void main(String[] args){
        
        int a[] = {0,1,0,0};
        int b[] = {0,0,1,1};
        
        System.out.println(subtrair(a, b));
        
    }
    
}
