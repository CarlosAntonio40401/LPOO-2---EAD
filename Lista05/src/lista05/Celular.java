package lista05;

/**
 *
 * @author Carlos Antonio
 */
public class Celular extends MeiosEletronico{
    
    private int numero;
    private int ddd;
    private String operadora;

    public Celular(int numero, int ddd, String operadora, String tipoConexao, String cor, String formato) {
        super(tipoConexao, cor, formato);
        this.numero = numero;
        this.ddd = ddd;
        this.operadora = operadora;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getDdd() {
        return ddd;
    }

    public void setDdd(int ddd) {
        this.ddd = ddd;
    }

    public String getOperadora() {
        return operadora;
    }

    public void setOperadora(String operadora) {
        this.operadora = operadora;
    }
    
    @Override
    public String funcoes(){
        return "Realizar e receber ligações";
    }
    
}
