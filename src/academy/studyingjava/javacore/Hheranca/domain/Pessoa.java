package academy.studyingjava.javacore.Hheranca.domain;

public class Pessoa {
    /* protected é um modificador de acesso que permite que as classes que são "FILHAS" (extends)
       ou que estejam no MESMO PACOTE terem acesso aos atributos como se estivessem na mesma classe, como se fossem 'public' (públicos) */
    protected String nome;
    protected String cpf;
    protected Endereco endereco;

    // 0 - Bloco de inicialização estático da SUPER CLASSE é executado quando a JVM carregar a classe pai
    // 1 - Bloco de inicialização estático da SUB CLASSE é executado quando a JVM carregar a classe filha
    // 2 - Alocado espaço de memória para o objeto da SUPER CLASSE
    // 3 - Cada atributo da SUPER CLASSE é criado e inicializado com valores ou o que for passado
    // 4 - Bloco de inicialização da SUPER CLASSE é executado na ordem em que aparece
    // 5 - Construtor é executado da SUPER CLASSE
    // 6 - Alocado espaço de memória para o objeto da SUB CLASSE
    // 7 - Cada atributo da SUB CLASSE é criado e inicializado com valores ou o que for passado
    // 8 - Bloco de inicialização da SUB CLASSE é executado na ordem em que aparece
    // 9 - Construtor é executado da SUB CLASSE

    static {
        System.out.println("Dentro do bloco de inicialização estático de Pessoa");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 1");
    }

    {
        System.out.println("Dentro do bloco de inicialização de Pessoa 2");
    }

    public Pessoa(String nome) {
        System.out.println("Dentro do construtor de Pessoa");
        this.nome = nome;
    }

    public void imprime() {
        System.out.println("-------------------------------------");
        System.out.println("Nome: " + this.nome);
        System.out.println("CPF: " + this.cpf);
        System.out.println("Rua: " + this.endereco.getRua() + " | CEP: " + this.endereco.getCep());
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }
}
