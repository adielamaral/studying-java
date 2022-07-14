package academy.studyingjava.introducao;

public class Aula07Arrays02 {
    public static void main(String[] args) {
        // byte, short, int, long, float e double = 0
        // char '\u0000' = ' '
        // boolean = false
        // String = null

        String[] nomes = new String[4];
        nomes[0] = "João";
        nomes[1] = "Maria";
        nomes[2] = "Joaquina";
        nomes[3] = "Hinata";

        for (int i = 0; i < nomes.length; i++) {
            System.out.println(nomes[i]);
        }
    }
}
