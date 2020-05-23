package recursao;


public class Questao4 {

  
    public static void main(String[] args) {

        int vet[] = {1, 20, 37, 4, 5};
        System.out.println("O valor da soma dos vetores é:" + somaVetores(vet, vet.length));

    }

    static int somaVetores(int a[], int n) {

        if (n > 0) {
            return a[n - 1] + somaVetores(a, n - 1);

        } else {
            return 0;
        }
    }
}
