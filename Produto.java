import java.util.Scanner;

public class Produto {
    private String nome;
    private float preco;
    private int quantidade;

    public void setNome(String nome) {
        this.nome = nome.trim();
    }

    public String getNome() {
        return nome;
    }

    public void setPreco(float preco) {
        while (preco < 0) {
            System.out.println("O preço não pode ser menor que 0. Digite novamente: ");
            Scanner scanner = new Scanner(System.in);
            preco = scanner.nextFloat();
        }
        this.preco = preco;
    }

    public float getPreco() {
        return preco;
    }

    public void setQuantidade(int quantidade) {
        while (quantidade < 0) {
            System.out.println("A quantidade nao pode ser menor que 0. Digite novamente: ");
            Scanner scanner = new Scanner(System.in);
            quantidade = scanner.nextInt();
        }
        this.quantidade = quantidade;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public static void main(String[] args) {
        try (Scanner entrada = new Scanner(System.in)) {
            Produto produto1 = new Produto();

            System.out.println("Digite o nome do produto: ");
            produto1.setNome(entrada.nextLine());

            System.out.println("Digite o preço do produto: ");
            produto1.setPreco(entrada.nextFloat());
            entrada.nextLine(); // Consumir a nova linha

            System.out.println("Digite a quantidade do produto: ");
            produto1.setQuantidade(entrada.nextInt());

            System.out.println("O nome do produto: " + produto1.getNome());
            System.out.println("O preço do produto: " + produto1.getPreco());
            System.out.println("A quantidade do produto é: " + produto1.getQuantidade());
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }
    }
}
