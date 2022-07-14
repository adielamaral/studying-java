package academy.studyingjava.javacore.Bintroducaometodos.test;

import academy.studyingjava.javacore.Bintroducaometodos.domain.Estudante;

public class EstudanteTest02 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();

        estudante01.nome = "Thiago Martins";
        estudante01.idade = 23;
        estudante01.sexo = 'M';

        estudante02.nome = "Maria Madalena";
        estudante02.idade = 21;
        estudante02.sexo = 'F';

        estudante01.imprime();
        estudante02.imprime();
    }
}
