package questao2;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Agenda {

    private String nome;
    private int dataNasc;
    private float altura;

   

    ArrayList<Agenda> agenda = new ArrayList();

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getDataNasc() {
        return dataNasc;
    }

    public void setDataNasc(int dataNasc) {
        this.dataNasc = dataNasc;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public void armazenaPessoa(String nome, int dataNasc, float altura) {
        Agenda a= new Agenda();
        System.out.println(a);
        a.setNome(nome);
        a.setDataNasc(dataNasc);
        a.setAltura(altura);
        this.agenda.add(a);
    }

    public void removePessoa(String nome) {

//        System.out.println("Informe o nome da pessoa que deseja excluir:");
//        Scanner c = new Scanner(System.in);
//        nome = c.next();
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.get(i).getNome().equals(nome)) {
                agenda.remove(i);
                System.out.println("O registro foi deletado com sucesso!");
            }
        }

    }

    public int buscaPessoa(String nome) {
        System.out.println("Informe o nome da pessoa que deseja excluir:");
        Scanner c = new Scanner(System.in);
        nome = c.next();
        int posicao = 0;
        for (int i = 0; i < agenda.size(); i++) {

            if (agenda.get(i).getNome().equals(nome)) {

                System.out.println("A pessoa informada está na posíção:" + agenda.get(i));
                posicao = i;
            }
        }

        return posicao;
    }
    
    
   public  void imprimeAgenda(){
       for (int i = 0; i < agenda.size(); i++) {
                        System.out.println("Dados da pessoa "+agenda.get(i));
                System.out.println("Nome:"+agenda.get(i).getNome());
                System.out.println("Data de Nascimento:"+agenda.get(i).getDataNasc());
                System.out.println("Altura:"+agenda.get(i).getDataNasc());
               
            }
        
       
   }
   
   public void imprimePessoa(int index){
       
        for (int i = 0; i < agenda.size(); i++) {
            
        
              if (i == index) {
                        System.out.println("Dados da pessoa "+agenda.get(i));
                System.out.println("Nome:"+agenda.get(i).getNome());
                System.out.println("Data de Nascimento:"+agenda.get(i).getDataNasc());
                System.out.println("Altura:"+agenda.get(i).getDataNasc());
               
            }
        }
   }
}
