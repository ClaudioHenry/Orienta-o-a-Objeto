import java.util.Scanner;

public class Circulo {
    private float raio;
    private final float pi = (float) 3.14;

    // Método para definir o raio (modificador private)
    private void setRaio(float raio) {
        this.raio = raio;
    }

    // Método para obter o raio (modificador public)
    public float getRaio() {
        return raio;
    }

    // Método para calcular a área (modificador public)
    public float calcularArea() {
        return pi * raio * raio;
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Circulo circulo1 = new Circulo();

            System.out.println("Digite o valor do raio: ");
            float raioInserido = entrada.nextFloat();

            // Utilizando o método privado para definir o raio
            circulo1.setRaio(raioInserido);

            // Utilizando o método público para obter o raio
            float raioObtido = circulo1.getRaio();
            System.out.println("O valor do raio é: " + raioObtido);

            // Utilizando o método público para calcular e exibir a área
            float area = circulo1.calcularArea();
            System.out.println("A área do círculo é: " + area);
        }
    }
}
