package HERANCA;

// Classe base para representar animais
class Animal {
    private String nome;
    private int idade;
    private String som;

    // Construtor
    public Animal(String nome, int idade, String som) {
        this.nome = nome;
        this.idade = idade;
        this.som = som;
    }

    // Métodos getters
    public String getNome() {
        return nome;
    }

    public int getIdade() {
        return idade;
    }

    public String getSom() {
        return som;
    }

    // Método para fazer o animal emitir som
    public void emitirSom() {
        System.out.println("O " + nome + " faz " + som);
    }

    // Método para exibir informações sobre o animal
    public void mostrarInformacoes() {
        System.out.println("Nome: " + nome);
        System.out.println("Idade: " + idade + " anos");
        System.out.println("Som: " + som);
    }
}

// Subclasse para representar um tipo específico de animal: Cachorro
class Cachorro extends Animal {
    private String raca;

    // Construtor
    public Cachorro(String nome, int idade, String raca) {
        super(nome, idade, "Latido"); // Chamada ao construtor da classe base
        this.raca = raca;
    }

    // Método getter específico para a raça
    public String getRaca() {
        return raca;
    }

    // Sobrescrevendo o método mostrarInformacoes para incluir informações específicas do Cachorro
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Chama o método da classe base
        System.out.println("Raça: " + raca);
    }
}

// Subclasse para representar outro tipo específico de animal: Gato
class Gato extends Animal {
    private boolean pelagemLonga;

    // Construtor
    public Gato(String nome, int idade, boolean pelagemLonga) {
        super(nome, idade, "Miado"); // Chamada ao construtor da classe base
        this.pelagemLonga = pelagemLonga;
    }

    // Método getter específico para a pelagem longa
    public boolean hasPelagemLonga() {
        return pelagemLonga;
    }

    // Sobrescrevendo o método mostrarInformacoes para incluir informações específicas do Gato
    @Override
    public void mostrarInformacoes() {
        super.mostrarInformacoes(); // Chama o método da classe base
        System.out.println("Pelagem Longa: " + (pelagemLonga ? "Sim" : "Não"));
    }
}



