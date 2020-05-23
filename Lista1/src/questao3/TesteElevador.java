package questao3;


public class TesteElevador {

    
    public static void main(String[] args) {
        
        Elevador elevador= new Elevador();
        
        
    
        elevador.setQtdPessoasElevador(0);

        elevador.setAndarAtual(0);
        
        elevador.inicializar(10, 15);
        elevador.entrar();
        elevador.sai();
        elevador.sobe();
        elevador.sobe();
        elevador.desce();
        
        
    }
    
}
