package academy.studyingjava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        // int, double, float, char, byte, short, long, boolean
        int idade = 10;
        long numeroGrande = 100000;
        double salario = 2000.0;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 10;
        short idadeShort = 10;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = 'M';
        String nome = "Goku";

        System.out.println("Eu tenho " + idade + " anos.");
        System.out.println(verdadeiro);
        System.out.println(caractere);
        System.out.println(salarioFloat);
        System.out.println("Oi, eu sou o " + nome);
    }
}
