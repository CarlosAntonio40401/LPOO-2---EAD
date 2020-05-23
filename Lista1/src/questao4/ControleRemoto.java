package questao4;


public class ControleRemoto {

  
    public static void main(String[] args) {
       
        Televisao televisao=new Televisao();
        
        televisao.aumentaVolume();
        televisao.aumentaVolume();
        televisao.aumentaVolume();
        
        
        televisao.diminuiVolume();
        
        televisao.trocaCanal("Globo");
        
        televisao.consultaVolumeCanal();
    }
    
}
