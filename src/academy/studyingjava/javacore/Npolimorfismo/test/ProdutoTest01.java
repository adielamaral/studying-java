package academy.studyingjava.javacore.Npolimorfismo.test;

import academy.studyingjava.javacore.Npolimorfismo.domain.Celular;
import academy.studyingjava.javacore.Npolimorfismo.domain.Computador;
import academy.studyingjava.javacore.Npolimorfismo.domain.Televisao;
import academy.studyingjava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest01 {
    public static void main(String[] args) {
        Computador computador = new Computador("MacBook Air 13.3\"", 10000);
        Celular celular = new Celular("Samsung Galaxy S21 Ultra", 6000);
        Televisao televisao = new Televisao("Smart TV QLED 75\" 8K Samsung", 49000);

        CalculadoraImposto.calcularImposto(computador);

        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");

        CalculadoraImposto.calcularImposto(celular);

        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");

        CalculadoraImposto.calcularImposto(televisao );
    }
}
