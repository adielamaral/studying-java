package academy.studyingjava.introducao;

/*
Prática

Crie variáveis para os campos descritos abaixo entre <> e imprima a seguinte mensagem:

Eu <nome>, morando no endereço <endereco>,
confirmo que recebi o salário de <salario>, na data <data>.
 */

public class Aula03TiposPrimitivosExercicio {
    public static void main(String[] args) {
        String nome = "Adiel Amaral";
        String endereco = "Stanford, Los Angeles CA, N° 7200, USA";
        double salario = 12500;
        String data = "30/11/2021";

        System.out.println("Eu " + nome + ", morando no endereço " + endereco + ", confirmo que recebi o salário de US$ " + salario + ", na data " + data + ".");
    }
}
