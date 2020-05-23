
package lista3;

/**
 *
 * @author Carlos Antonio
 */
public abstract class MeiosEletronico {
    
    private String tipoConexao;
    private String cor;
    private String formato;

    public MeiosEletronico(String tipoConexao, String cor, String formato) {
        this.tipoConexao = tipoConexao;
        this.cor = cor;
        this.formato = formato;
    }

    public String getTipoConexao() {
        return tipoConexao;
    }

    public void setTipoConexao(String tipoConexao) {
        this.tipoConexao = tipoConexao;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public String getFormato() {
        return formato;
    }

    public void setFormato(String formato) {
        this.formato = formato;
    }
    
    public abstract String funcoes();
}
