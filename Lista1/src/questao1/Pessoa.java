
package questao1;


public class Pessoa {
    private String nome;
    private int anoNascimento;
    private float altura;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getAnoNascimento() {
        return anoNascimento;
    }

    public void setAnoNascimento(int anoNascimento) {
        this.anoNascimento = anoNascimento;
    }

    public float getAltura() {
        return altura;
    }

    public void setAltura(float altura) {
        this.altura = altura;
    }

    public Pessoa(String nome, int anoNascimento, float altura) {
        this.nome = nome;
        this.anoNascimento = anoNascimento;
        this.altura = altura;
    }
    
   
    
    @Override
    public String toString(){
        return "Dados da pessoa:"+
                "\n Nome:"+nome+
                "\n Data de nascimento:"+anoNascimento+
                "\n Altura:"+altura;
    }
    
    public int IdadePessoa(int anoAtual){
       int idade=(anoAtual-anoNascimento);
        return idade ;
    }
    
}
