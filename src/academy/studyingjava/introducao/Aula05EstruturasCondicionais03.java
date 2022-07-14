package academy.studyingjava.introducao;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {
        // Doar se salario > 5000
        double salario = 6000;
//        String mensagemDoar = "Eu vou doar 500.";
//        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter!";

        // (condição) ? verdadeiro : falso - Operador ternário
        String resultado = salario >= 5000 ? "Eu vou doar 500." : "Ainda não tenho condições, mas vou ter!";

        System.out.println(resultado);
    }
}
