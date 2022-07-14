package academy.studyingjava.javacore.Bintroducaometodos.test;

import academy.studyingjava.javacore.Bintroducaometodos.domain.Funcionario;

public class FuncionarioTest01 {
    /*
    Crie uma classe Funcionário com os seguintes atributos:
    nome
    idade
    salario // três salários devem ser guardados

    Crie dois métodos
    1. Para imprimir os dados
    2. Para tirar a média dos salários e imprimir o resultado
     */
    public static void main(String[] args) {
        Funcionario funcionario01 = new Funcionario();

        funcionario01.nome = "Adiel Amaral";
        funcionario01.idade = 21;
        funcionario01.salarios = new double[]{10364, 15698, 21856};

        funcionario01.imprimeDados();
    }
}
