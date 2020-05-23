package recursao;

import java.util.Scanner;


public class Questao8 {

   
    public static void main(String[] args) {
         Scanner leitura = new Scanner(System.in);
        System.out.printf("Digite 1° numero:");
        int numero1 = leitura.nextInt();
         System.out.printf("Digite 2° numero:");
        int numero2 = leitura.nextInt();
        System.out.println(multiplicacaoSomatoria(numero1, numero2));
    }
    
    static int multiplicacaoSomatoria(int a, int b) {
	if(a == 0 || b == 0) {
		return 0;
	}
	if(b == 1) {
		return a;
	}
	return a + multiplicacaoSomatoria(a, b - 1);
}
}
