package academy.studyingjava.javacore.Hheranca.test;

import academy.studyingjava.javacore.Hheranca.domain.Endereco;
import academy.studyingjava.javacore.Hheranca.domain.Funcionario;
import academy.studyingjava.javacore.Hheranca.domain.Pessoa;

public class HerancaTest01 {
    public static void main(String[] args) {
        Endereco endereco = new Endereco();
        endereco.setRua("Arroz com feijão, N° 36 - Guamá");
        endereco.setCep("66684-235");

        Pessoa pessoa = new Pessoa("Calebe Junior");
        pessoa.setCpf("321.456.234-00");
        pessoa.setEndereco(endereco);

        pessoa.imprime();

        Funcionario funcionario = new Funcionario("Calebe Junior");
        funcionario.setCpf("021.534.222-89");
        funcionario.setEndereco(endereco);
        funcionario.setSalario(20700);

        funcionario.imprime();
        funcionario.relatorioPagamento();
    }
}
