package recursao;

import java.util.Scanner;
import static recursao.Questao9.naturaisCrescente;


public class Questao_10 {

   
    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = leitura.nextInt();
        naturaisCrescente(numero);

    }

    static int naturaisDecrescente(int n) {
        if (n == -1) {
            return 0;
        }
        System.out.printf("%d ", n);
        return naturaisDecrescente(n - 1);
    }

    static int sequencia(int n) {
        if (n < 0) {
            return naturaisDecrescente(n * -1);
        }
        return naturaisDecrescente(n);
    }
}
