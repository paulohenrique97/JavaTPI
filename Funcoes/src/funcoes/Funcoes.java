package funcoes;

/**
 *
 * @author paulo
 */
public class Funcoes {

    public static int potencia(int base, int expoente){
        
        if (expoente == 0){
            return 1;
        } else {
            return base * potencia(base, expoente-1);
        }        
        
    }
    
    public static int fatorial(int numero){
        
        if (numero == 0){
            return 1;
        } else {
            return numero * fatorial(numero-1);
        }
        
    }
    
}
