package lista3;

/**
 *
 * @author Carlos Antonio
 */
public class Smartphone extends MeiosEletronico {

    private String tipoTela;
    private boolean aplicativosDeLigacao;

    public Smartphone(String tipoTela, boolean aplicativosDeLigacao, String tipoConexao, String cor, String formato) {
        super(tipoConexao, cor, formato);
        this.tipoTela = tipoTela;
        this.aplicativosDeLigacao = aplicativosDeLigacao;
    }

    public String getTipoTela() {
        return tipoTela;
    }

    public void setTipoTela(String tipoTela) {
        this.tipoTela = tipoTela;
    }

    public boolean isAplicativosDeLigacao() {
        return aplicativosDeLigacao;
    }

    public void setAplicativosDeLigacao(boolean aplicativosDeLigacao) {
        this.aplicativosDeLigacao = aplicativosDeLigacao;
    }
    
    @Override
    public String funcoes(){
        return "Realizar e receber ligações e acessar aplicativos dos mais diversos tipos";
    }
}
