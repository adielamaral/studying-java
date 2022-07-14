package academy.studyingjava.javacore.Bintroducaometodos.test;

import academy.studyingjava.javacore.Bintroducaometodos.domain.Pessoa;

public class PessoaTest01 {
    public static void main(String[] args) {
        Pessoa pessoa = new Pessoa();

        pessoa.setNome("Hamilton");
        pessoa.setIdade(22);

//        pessoa.imprime();

        System.out.println(pessoa.getNome());
        System.out.println(pessoa.getIdade());
    }
}
