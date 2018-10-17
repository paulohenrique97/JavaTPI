package aula.pkg1.pkg2;
import java.util.Scanner;

public class Aula12 {
    
    public static void main(String args[]) {
        Scanner sc1 = new Scanner(System.in);
        int n, m, cont;
        
        System.out.println("Exibir inteiros de 1 a n");
        System.out.println("Digite o valor de n:");
        n = sc1.nextInt();
        System.out.println("Digite o valor de m:");
        m = sc1.nextInt();
        cont = m;
        System.out.println("--------------------------------");
                
        while ( cont <= n ) 
        {
            System.out.println(cont); 
            cont = cont + 1;                       
        }
    }
}