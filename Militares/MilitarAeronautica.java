public class MilitarAeronautica extends Militar implements Carreira{
    private int anosPatente, horasVoo;

    public MilitarAeronautica(int matricula, String patente, int anosPatente, int horasVoo){
        super(matricula, patente);
        this.anosPatente = anosPatente;
        this.horasVoo = horasVoo;
    }
    
    //Polimorfismo é a habilidade de diferentes objetos receberem a mesma mensagem e comportar-se de maneira diferente.
    //Ex: podeProgredir(), que assume funções distintas.
    public boolean podeProgredir(){
        if (this.anosPatente > 2 && this.horasVoo > 100){
            return true;
        }
        return false;
    }
}
