public class Principal {
    public static void main(String[] args) {
        CadastroMilitar cadastro = new CadastroMilitar();

        //Objetos são caracterizados por atributos e métodos.
        //Ex: militar 1, militar 2, militar 3...
        Militar militar1 = new MilitarAeronautica(4145516, "Tenente", 2, 450);
        Militar militar2 = new MilitarMarinha(518712, "Cabo", true);
        Militar militar3 = new MilitarExercito(6588461, "Tenente", true, false);

        cadastro.adicionarMilitares(militar1);
        cadastro.adicionarMilitares(militar2);
        cadastro.adicionarMilitares(militar3);
        cadastro.podeProgredir();
        cadastro.realizarProgressao();
    }
}
