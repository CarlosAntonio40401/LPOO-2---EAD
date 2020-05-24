
package Lista_Lista;


public class Teste {

    
    public static void main(String[] args) {
        Lista<Integer> l = new Lista<>();
        
        //Questão 1
        //Letra A
        for (int i = 5; i > 2; i--) {
            System.out.println("Questao A");
            l.addFirst(i);
            
        }
        l.addFirst(l);
        
        //letra B
        for (int i = 0; i > 5; i++) {
             System.out.println("Questao B");
            l.addFirst(i);
            l.print();
        }
        
        //Questão 2
        
        //Letra A)
         System.out.println("Questao 2 A");
        l.pertence(5);
        
        //Letra B
         System.out.println("Questao 2 B");
        l.addLast(10);
        
        //Letra c
         System.out.println("Questao 2 C");
        l.removerFirst();
        
        //Letra D
         System.out.println("Questao 2 D");
        l.print();
        
        //Letra e
         System.out.println("Questao 2 E");
        Lista<Integer> l2 = new Lista<>();
        l2=l;
        l2.print();
        System.out.println("Para aqui a questao E");
        
        // Letra F 
      l.addFirst(l2);
        
        l.concatenarListas(l, l2);
    }
    
}
