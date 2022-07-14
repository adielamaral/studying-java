package academy.studyingjava.javacore.Npolimorfismo.test;

import academy.studyingjava.javacore.Npolimorfismo.domain.Celular;
import academy.studyingjava.javacore.Npolimorfismo.domain.Computador;
import academy.studyingjava.javacore.Npolimorfismo.domain.Produto;

public class ProdutoTest02 {
    public static void main(String[] args) {
        Produto produto1 = new Computador("MacBook Pro Retina, Intel Core i9", 29750);
        System.out.println(produto1.getNome());
        System.out.println(produto1.getValor());
        System.out.println(produto1.calcularImposto());

        System.out.println("=--=--=--=--=--=--=--=--=--=--=--=--=--=--=");

        Produto produto2 = new Celular("iPhone 13 128GB", 6339);
        System.out.println(produto2.getNome());
        System.out.println(produto2.getValor());
        System.out.println(produto2.calcularImposto());
    }
}
