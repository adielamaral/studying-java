package academy.studyingjava.javacore.Eblocosinicializacao.test;

import academy.studyingjava.javacore.Eblocosinicializacao.domain.Funcionario;

// Exercise Exercise Exercise Exercise

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Funcionario funcionario = new Funcionario("Ana Carolina", 25, 'F');

        funcionario.setSalario(new double[]{3000, 4000, 6000});

        funcionario.imprime();
    }
}
