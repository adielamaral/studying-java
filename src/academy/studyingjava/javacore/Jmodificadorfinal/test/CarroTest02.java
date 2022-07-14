package academy.studyingjava.javacore.Jmodificadorfinal.test;

import academy.studyingjava.javacore.Jmodificadorfinal.domain.Carro;
import academy.studyingjava.javacore.Jmodificadorfinal.domain.Comprador;

public class CarroTest02 {
    public static void main(String[] args) {
        Carro carro = new Carro();

        System.out.println(carro.COMPRADOR);
        carro.COMPRADOR.setNome("Kuririn");
        System.out.println(carro.COMPRADOR);
    }
}
