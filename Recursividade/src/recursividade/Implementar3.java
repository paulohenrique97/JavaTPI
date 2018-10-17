package recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Implementar3 {
    
    public static void imprime(int num, int i, String resultado){ 
        
        if (i == num){ 

            resultado += (i);
            JOptionPane.showMessageDialog(null, resultado);
            
        } else if (i < num) { 

            resultado += (i + " ");
            i += 2;
            imprime(num, i, resultado);
            
        } else JOptionPane.showMessageDialog(null, resultado);
        
    }
    
    public static int leitura(String texto){ 
        
        int le;      
        le = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
        return le;
        
    }
    
    public static void main(String[] args){
        
        int numero;
        numero = leitura("Insira um número inteiro: ");
        imprime(numero, 1, "O números impares até " + numero + " são: ");
        imprime(numero, 0, "O números pares até " + numero + " são: ");
    }
    
}
