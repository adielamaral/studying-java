package academy.studyingjava.javacore.Npolimorfismo.service;

import academy.studyingjava.javacore.Npolimorfismo.domain.AguaOxigenada;
import academy.studyingjava.javacore.Npolimorfismo.domain.Produto;

public class CalculadoraImposto {

    public static void calcularImposto(Produto produto) {
        System.out.println(".::: Relatório de imposto :::.");
        System.out.println("Produto: " + produto.getNome());
        System.out.println("Valor: R$ " + produto.getValor());
        double imposto = produto.calcularImposto();
        System.out.println("Imposto a ser pago: R$ " + imposto);
        if (produto instanceof AguaOxigenada) {
            // Usando cast e instanceof para verificar se o produto é AguaOxigenada
            AguaOxigenada aguaOxigenada = (AguaOxigenada) produto;
            System.out.println("Data de validade: " + aguaOxigenada.getDataDeValidade());
        }
    }
}
