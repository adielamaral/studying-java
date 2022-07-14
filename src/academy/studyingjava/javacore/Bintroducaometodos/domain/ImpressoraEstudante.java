package academy.studyingjava.javacore.Bintroducaometodos.domain;

public class ImpressoraEstudante {
    public void imprime(Estudante estudante) {
        System.out.println("Nome: " + estudante.nome);
        System.out.println("Idade: " + estudante.idade + " anos");
        System.out.println("Sexo: " + estudante.sexo);

        System.out.println("---------------------------");
    }
}
