package recursao;

import java.util.Scanner;


public class Questao5 {

    
    public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = leitura.nextInt();
        System.out.println(somatorioAteN(numero));
    }
    
    static int somatorioAteN(int n){
        
        if(n==1)
            return n;
        else
            
           return  n + somatorioAteN(n - 1);
            }
    
        
    
}
