package academy.studyingjava.introducao;
// I want to know how much I have to pay in the Netherlands 2020 based on my annual salary
// € 0          € 34.712        9.70%
// € 34.713     € 68.507        37.35%
// € 68.508+                    49.50%
public class Aula05EstruturasCondicionais04 {
    public static void main(String[] args) {
        double salarioAnual = 70000;
        double valorImposto;

        if (salarioAnual <= 34712) {
            valorImposto = salarioAnual * 0.0970;
        } else if (salarioAnual >= 34713 && salarioAnual <= 68507) {
            valorImposto = salarioAnual * 0.3735;
        } else {
            valorImposto = salarioAnual * 0.4950;
        }
        System.out.println("Taxa anual: € " + valorImposto);
    }
}
