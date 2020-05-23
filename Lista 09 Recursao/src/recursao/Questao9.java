package recursao;

import java.util.Scanner;


public class Questao9 {

    
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = leitura.nextInt();
        naturaisCrescente(numero);

    }

    static int naturaisCrescente(int n) {
        if (n == -1) {
            return 0;
        } else {
            System.out.printf("%d ", n);
        }
        return 1 + naturaisCrescente(n - 1);
    }

    static int sequencia(int n) {
        if (n < 0) {
            return naturaisCrescente(n * -1);
        }
        return naturaisCrescente(n);
    }
   
}
