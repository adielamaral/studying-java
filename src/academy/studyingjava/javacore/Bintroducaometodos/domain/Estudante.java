package academy.studyingjava.javacore.Bintroducaometodos.domain;

public class Estudante {
    public String nome;
    public int idade;
    public char sexo;

    // Utilizando o this
    public void imprime() {
        System.out.println("Nome: " + this.nome);
        System.out.println("Idade: " + this.idade + " anos");
        System.out.println("Sexo: " + this.sexo);

        System.out.println("---------------------------");
    }
}
