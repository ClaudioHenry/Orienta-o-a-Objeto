package HERANCA2;

// Classe Veiculo
class Veiculos {
    // Atributos
    protected String marca;
    protected String modelo;
    protected int ano;
    protected String cor;

    // Construtor
    public Veiculos(String marca, String modelo, int ano, String cor) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.cor = cor;
    }

    // Métodos
    public String obterInformacoes() {
        return String.format("Marca: %s, Modelo: %s, Ano: %d, Cor: %s", marca, modelo, ano, cor);
    }

    public void acelerar(float velocidade, float velocidadeAtual) {
        if (velocidade > 0) {
            velocidadeAtual += velocidade;
            System.out.println("O veículo acelerou, nova velocidade: " + velocidadeAtual);
        } else {
            System.out.println("O veículo está parado");
        }
    }

    public void frear(float velocidadeAtual) {
        if (velocidadeAtual > 0) {
            velocidadeAtual = 0;
            System.out.println("O veículo está parando. Velocidade zerada");
        } else {
            System.out.println("O veículo já está parado. Não tem como frear!");
        }
    }
}

// Classe Carro
class Carro extends Veiculos {
    // Atributo adicional
    private int numPortas;

    // Construtor
    public Carro(String marca, String modelo, int ano, String cor, int numPortas) {
        super(marca, modelo, ano, cor);
        this.numPortas = numPortas;
    }

    // Método adicional
    public String abrirPortas() {
        return "Portas abertas.";
    }

    // Sobrescrevendo o método obterInformacoes
    @Override
    public String obterInformacoes() {
        return super.obterInformacoes() + String.format(", Número de Portas: %d", numPortas);
    }
}

// Classe Moto
class Moto extends Veiculos {
    // Atributo adicional
    private String tipoGuidao;

    // Construtor
    public Moto(String marca, String modelo, int ano, String cor, String tipoGuidao) {
        super(marca, modelo, ano, cor);
        this.tipoGuidao = tipoGuidao;
    }

    // Método adicional
    public String empinar() {
        return "Moto empinando.";
    }

    // Sobrescrevendo o método obterInformacoes
    @Override
    public String obterInformacoes() {
        return super.obterInformacoes() + String.format(", Tipo de Guidão: %s", tipoGuidao);
    }
}

// Classe Caminhao
class Caminhao extends Veiculos {
    private double capacidadeCarga;

    // Construtor específico de Caminhao
    public Caminhao(String marca, String modelo, int ano, String cor, double capacidadeCarga) {
        super(marca, modelo, ano, cor); // Chamada ao construtor da classe pai (Veiculo)
        this.capacidadeCarga = capacidadeCarga;
    }

    // Método adicional de Caminhao
    public void abrirPortas() {
        System.out.println("Abrindo portas do caminhão.");
    }

    // Método sobrescrito da classe pai (Veiculo)
    @Override
    public String obterInformacoes() {
        return String.format("Marca: %s, Modelo: %s, Ano: %d, Cor: %s, Capacidade de Carga: %.2f toneladas",
                marca, modelo, ano, cor, capacidadeCarga);
    }
}

