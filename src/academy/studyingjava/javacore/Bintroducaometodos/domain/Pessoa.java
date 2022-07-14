package academy.studyingjava.javacore.Bintroducaometodos.domain;

public class Pessoa {
    private String nome;
    private int idade;

    public void imprime() {
        System.out.println(this.nome);
        System.out.println(this.idade);
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public String getNome() {
        return this.nome;
    }

    public int getIdade() {
        if (this.idade < 0) {
            System.out.println("Idade inválida");
            return 0;
        }
        return this.idade;
    }
}
