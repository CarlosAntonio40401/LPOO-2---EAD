package recursao;

import java.util.Scanner;


public class Questao7 {

   
    public static void main(String[] args) {
        Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite um numero:");
        int numero = leitura.nextInt();
        System.out.printf("Informe o digito que deseja saber quantas vezes ele aparece no número digitado:");
        int digito = leitura.nextInt();

        System.out.println("O digito aparece: " + somaVezesDigitosAparece(numero, digito, 0) + " vezes no número informado.");

    }

    static int somaVezesDigitosAparece(int n, int k, int i) {
        if (n % 10 == k) {
            i++;
        }
        if (n % 10 == n) {
            return i;
        }
        return somaVezesDigitosAparece(n / 10, k, i);
    }
}
