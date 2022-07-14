package academy.studyingjava.introducao;

public class Aula07Arrays01 {
    public static void main(String[] args) {
        // Arrays são de tipo 'Reference' e são objetos | int[] idades - referencia | = new int[3] - criando objetos
        int[] idades = new int[3];
        idades[0] = 15;
        idades[1] = 20;
        idades[2] = 51;

        System.out.println(idades[0]);
        System.out.println(idades[1]);
        System.out.println(idades[2]);
    }
}
