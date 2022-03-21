    //Classe abstrata é um tipo de classe especial que não pode ser instanciada, apenas herdada. Portanto, uma classe abstrata não pode ter um objeto criado a partir de sua instanciação. Essas classes são muito importantes quando não queremos criar um objeto a partir de uma classe “geral”, apenas de suas “subclasses”.
    //Ex: public abstract class Militar...

public abstract class Militar {
    
    //O encapsulamento nos ajudam a agrupar os dados relacionados a cada objeto de forma que possamos acessar cada um deles sem conflito, por estarem cada um em seu domínio.
    //private matricula, patente...
    private int matricula;
    private String patente;

    public Militar(int matricula, String patente){
        this.matricula = matricula;
        this.patente = patente;
    }

    public int getMatricula() {
        return matricula;
    }

    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }

    public String getPatente() {
        return patente;
    }

    public void setPatente(String patente) {
        this.patente = patente;
    }
}
