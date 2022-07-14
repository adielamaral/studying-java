package academy.studyingjava.javacore.Npolimorfismo.test;

import academy.studyingjava.javacore.Npolimorfismo.domain.AguaOxigenada;
import academy.studyingjava.javacore.Npolimorfismo.domain.Celular;
import academy.studyingjava.javacore.Npolimorfismo.domain.Produto;
import academy.studyingjava.javacore.Npolimorfismo.service.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {

        Produto produto = new Celular("iPhone 13 128GB", 6339);

        CalculadoraImposto.calcularImposto(produto);

        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");

        AguaOxigenada aguaOxigenada = new AguaOxigenada("Loreal Oxidante Inoa 20VOL 1000ml", 86);
        aguaOxigenada.setDataDeValidade("20/02/2022");

        CalculadoraImposto.calcularImposto(aguaOxigenada);
    }
}
