package recursividade;

import javax.swing.JOptionPane;



/**
 *
 * @author paulo
 */
public class RecursividadeExercicios6 {
      
    public static void imprime(int num, int i, String resultado){ 
//recebe o número, 1 no i que é o contador e o primeiro a ser imprimido, e o uma string vazia pro resultado
        
        if (i == num){ 
//se i for igual ao número recebido salva no resultado, imprime resultado e sai da função

            resultado += (i);
            JOptionPane.showMessageDialog(null, resultado);
            
        } else if (i < num) { 
//se i for menor que o número, salva i, soma 2 e chama a função de novo, assim são salvos sempre os impares: 1, 3, 5, etc.

            resultado += (i + " ");
            i += 2;
            imprime(num, i, resultado);
            
        } else JOptionPane.showMessageDialog(null, resultado);
//se i for maior que o número, imprime o resultado
        
    }
    
    public static int leitura(String texto){ 
//lê o número que o usuário quer, passando um texto dinámi
        
        int le;      
        le = Integer.parseInt(JOptionPane.showInputDialog(null, texto));
        return le;
        
    }
    
    public static void main(String[] args){
        
        int numero;
        numero = leitura("Insira um número inteiro: ");
        imprime(numero, 1, "");
        
    }
    
}
