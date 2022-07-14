package academy.studyingjava.javacore.Bintroducaometodos.test;

import academy.studyingjava.javacore.Bintroducaometodos.domain.Calculadora;

public class CalculadoraTest03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(10, 2);
        System.out.println(resultado);

        calculadora.imprimeDivisaoDeDoisNumeros(80, 0);
    }
}
