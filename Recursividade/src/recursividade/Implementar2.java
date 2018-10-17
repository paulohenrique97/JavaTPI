package recursividade;

import javax.swing.JOptionPane;

/**
 *
 * @author paulo
 */
public class Implementar2 {
    
    public static int fatorial(int numero){
        
        if (numero == 0){
            return 1;
        } else {
            return numero * fatorial(numero-1);
        }
        
    }
    
    public static int leitura(String texto){ 
        
        int le;      
        le = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
        return le;
        
    }
    
    public static void main(String[] args){
        
        int numero;
        numero = leitura("Insira um número inteiro: ");
        
        if (numero >= 0){
            JOptionPane.showMessageDialog(null, "Fatorial de " + numero + " é: " + fatorial(numero));
        } else JOptionPane.showMessageDialog(null, "ERRO: NÚMERO NEGATIVO");
        
    }

}
