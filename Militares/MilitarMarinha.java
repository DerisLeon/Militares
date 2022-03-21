

public class MilitarMarinha extends Militar implements Carreira{
    
    private boolean participouConsertoAviao;

    public MilitarMarinha(int matricula, String patente, boolean participouConsertoAviao) {
    //Herança é um mecanismo importante quando um grupo de classes apresenta a mesma interface, mas a implementação interna dos métodos é diferente.
    //Ex:MilitarMarinha herdou de Militar.
        super(matricula, patente);
        this.participouConsertoAviao = participouConsertoAviao;
    }

    
    //Métodos são as ações que os objetos podem exercer quando solicitados, onde podem interagir e se comunicarem com outros objetos.
    //Ex: podeProgredir...
    public boolean podeProgredir(){
        if (this.participouConsertoAviao == true){
            return true;
        }
        return false;
    }
}
