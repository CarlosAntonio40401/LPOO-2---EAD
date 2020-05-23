package lista3;

/**
 *
 * @author Carlos Antonio
 */
public class Notebook extends MeiosEletronico {

    private double tamanhoTela;

    public Notebook(double tamanhoTela, String tipoConexao, String cor, String formato) {
        super(tipoConexao, cor, formato);
        this.tamanhoTela = tamanhoTela;
    }

    public double getTamanhoTela() {
        return tamanhoTela;
    }

    public void setTamanhoTela(double tamanhoTela) {
        this.tamanhoTela = tamanhoTela;
    }

    @Override
    public String funcoes() {
        return "Realizar calculos e comunicação com outras pessoas";
    }
}
