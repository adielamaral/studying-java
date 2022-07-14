package academy.studyingjava.javacore.Lclassesabstratas.test;

import academy.studyingjava.javacore.Lclassesabstratas.domain.Desenvolvedor;
import academy.studyingjava.javacore.Lclassesabstratas.domain.Gerente;

public class FuncionarioTest01 {
    public static void main(String[] args) {
        Gerente gerente = new Gerente("Judas", 7000);
        Desenvolvedor desenvolvedor = new Desenvolvedor("Marcela", 12000);

        System.out.println(gerente);
        System.out.println(desenvolvedor);

        gerente.imprime();
        desenvolvedor.imprime();
    }
}
