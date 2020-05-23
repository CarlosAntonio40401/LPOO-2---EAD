package recursao;

import java.util.Scanner;


public class Questao3 {

   
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = leitura.nextInt();
        System.out.println("O número inverso");

        invert(numero);
        
        
    }

    static int invert(int n) {
        if (n == 0) 
            return n;
         else 
            System.out.printf("%d ", n % 10);
        
        n = n / 10;
        return invert(n);
    }

}
