package lista05;

/**
 *
 * @author Carlos Antonio
 */
public class TesteMeiosEletronicos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Celular c = new Celular(0, 0, "", "", "", "");

        c.setCor("Cinza");
        c.setDdd(61);
        c.setFormato("Quadrado");
        c.setNumero(33355645);
        c.setOperadora("NET");
        c.setTipoConexao("Com fio");

        Notebook n = new Notebook(0, "", "", "");

        n.setCor("Preto");
        n.setFormato("Quadrado");
        n.setTamanhoTela(15.5);
        n.setTipoConexao("Wireles e com fio");

        Smartphone s = new Smartphone("", true, "", "", "");

        s.setAplicativosDeLigacao(true);
        s.setCor("Azul");
        s.setFormato("Retangular");
        s.setTipoConexao("Wireles e com fio");
        s.setTipoTela("Númerica");

        System.out.println("Celular:\n"
                + "Cor:" + c.getCor()
                + "DDD:" + c.getDdd()
                + "Formato:" + c.getFormato()
                + "Operadora:" + c.getOperadora()
                + "Tipo de conexão:" + c.getTipoConexao()
        );
        System.out.println("Notebook:\n"
                + "Cor:" + n.getCor()
                + "Formato:" + n.getFormato()
                + "Tamanho da tela em polegadas:" + n.getTamanhoTela()
                + "Tipo de conexão:" + n.getTipoConexao()
        );
        System.out.println("Smartphone:\n"
                + "Possui aplicativos de ligação? " + s.isAplicativosDeLigacao()
                + "Cor:" + s.getCor()
                + "Formato:" + s.getFormato()
                + "Tipo de conexão:" + s.getTipoConexao()
                + "Tipo de tela:" + s.getTipoTela()
        );

    }

}
