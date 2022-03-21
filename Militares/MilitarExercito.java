public class MilitarExercito extends Militar implements Carreira{
    private boolean participouGuerra, ganhouGuerra;
   
   
    //Atributos são as características de um objeto, essas características também são conhecidas como variáveis.
    //Ex: matricula, patente...


    
    //Construtor são os responsáveis por criar o objeto em memória, ou seja, instanciar a classe que foi definida. Eles são obrigatórios e são declarados.
    //Ex: MilitarExercito
    public MilitarExercito(int matricula, String patente, boolean participouGuerra, boolean ganhouGuerra) {
        super(matricula, patente);
        this.participouGuerra = participouGuerra;
        this.ganhouGuerra = ganhouGuerra;
    }

    public boolean podeProgredir(){
        if (this.participouGuerra == true && this.ganhouGuerra == true){
            return true;
        }
        return false;
    }
}


