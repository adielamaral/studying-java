package academy.studyingjava.javacore.Aintroducaoclasses.test;

import academy.studyingjava.javacore.Aintroducaoclasses.domain.Carro;

public class CarroTest01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        Carro carro2 = new Carro();

        carro1.nome = "HB20";
        carro1.modelo = "1.0 Comfort Plus";
        carro1.ano = 2022;

        carro2.nome = "Porsche Cayenne";
        carro2.modelo = "4.8 V8 S 4WD";
        carro2.ano = 2021;

        System.out.println("Nome: " + carro1.nome + " | Modelo: " + carro1.modelo + " | Ano: " + carro1.ano);
        System.out.println("Nome: " + carro2.nome + " | Modelo: " + carro2.modelo + " | Ano: " + carro2.ano);
    }
}
