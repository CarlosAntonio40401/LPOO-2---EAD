package recursao;


public class Questao2 {

    
    public static void main(String[] args) {
       
        System.out.println("enezimo números da sequência de fibonacci:");
        for (int i = 0; i < 50; i++) {
            System.out.print("(" + i + "):" + fibonnaci(i) + "\n");
        }
       
       
    }
    
    static long fibonnaci(int n) {
        if (n < 2) {
            return n;
        } else {
            return fibonnaci(n - 1) + fibonnaci(n - 2);
        }
    }
}
