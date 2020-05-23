package recursao;

import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner leitura = new Scanner(System.in);
        System.out.println("informe um número que deseja ver o fatorial:");
        int numero = leitura.nextInt();
        System.out.println("O fatorial do número é:" + fact(numero));
    }

    public static int fact(int n) {
        if (n == 0) {
            return 1;
        } else {
            return n * fact(n - 1);
        }

    }
}
