package HERANCA2;

public class Main{
    public static void main(String[] args) {
        // Exemplo de Uso
        Carro carro = new Carro("Ford", "Focus", 2022, "Preto", 4);
        Moto moto = new Moto("Honda", "CBR", 2022, "Vermelho", "Esportivo");
        Caminhao caminhao = new Caminhao("Volvo", "FH", 2022, "Branco", 20000.0);

        System.out.println(carro.obterInformacoes());   // Carro
        System.out.println(moto.obterInformacoes());    // Moto
        System.out.println(caminhao.obterInformacoes());// Caminhao
    }
}
