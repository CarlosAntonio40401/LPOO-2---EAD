package questao4;

public class Televisao {

    private int volume;
    private String canal;

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    public String getCanal() {
        return canal;
    }

    public void setCanal(String canal) {
        this.canal = canal;
    }

    public int aumentaVolume() {

        this.volume++;

        return this.volume;
    }

    public int diminuiVolume() {

        this.volume--;

        return this.volume;
    }

    public String trocaCanal(String canal) {
        
        this.canal=canal;

        return this.canal;
    } 
    
    public void consultaVolumeCanal(){
        
        System.out.println("O volume atual é:"+this.volume);
        System.out.println("O canal atual é:"+this.canal);
    }

}
