
package questao2;


public class TesteAgenda {
    
    public static void main(String[] args) {
        
        Agenda agenda = new Agenda();
        
        agenda.armazenaPessoa("joao", 1990, 170);
       
        agenda.buscaPessoa("joao");
        agenda.imprimePessoa(0);
        agenda.imprimeAgenda();
        agenda.removePessoa("joao"); 
        
    }
    
}
