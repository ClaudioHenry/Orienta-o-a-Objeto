package HERANCA;

public class TesteHeranca {
    public TesteHeranca(String string, int i, boolean b) {
    }

    public static void main(String[] args) {
        Cachorro meuCachorro = new Cachorro("Rex", 3, "Labrador");
        TesteHeranca meuGato = new TesteHeranca("Whiskers", 2, true);

        meuCachorro.emitirSom();
        meuCachorro.mostrarInformacoes();

        System.out.println(); // Linha em branco para separar as informações dos dois animais

        meuGato.emitirSom();
        meuGato.mostrarInformacoes();
    }

    private void mostrarInformacoes() {
    }

    private void emitirSom() {
    }
}