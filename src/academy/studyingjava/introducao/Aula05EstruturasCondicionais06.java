package academy.studyingjava.introducao;

public class Aula05EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando Switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int dia = 7;

        switch (dia) {
            case 1:
                System.out.println("Domingo");
                System.out.println("Final de semana. Descanse e aproveite da melhor forma possível :)");
                break;
            case 2:
                System.out.println("Segunda-feira");
                System.out.println("Dia útil");
                break;
            case 3:
                System.out.println("Terça-feira");
                System.out.println("Dia útil");
                break;
            case 4:
                System.out.println("Quarta-feira");
                System.out.println("Dia útil");
                break;
            case 5:
                System.out.println("Quinta-feira");
                System.out.println("Dia útil");
                break;
            case 6:
                System.out.println("Sexta-feira");
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Sábado");
                System.out.println("Final de semana. Descanse e aproveite da melhor forma possível :)");
                break;
            default:
                System.out.println("Valor inválido.");
                break;
        }
    }
}
