package academy.studyingjava.introducao;

public class Aula08ArraysMultidimensionais01 {
    public static void main(String[] args) {
        // 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12 - Meses
        // 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 - Dias respectivos de cada mês

        int[][] dias = new int[12][1];

        dias[0][0] = 31;
        dias[1][0] = 28;
        dias[2][0] = 31;
        dias[3][0] = 30;
        dias[4][0] = 31;
        dias[5][0] = 30;
        dias[6][0] = 31;
        dias[7][0] = 31;
        dias[8][0] = 30;
        dias[9][0] = 31;
        dias[10][0] = 30;
        dias[11][0] = 31;

        for (int i = 0; i < dias.length; i++) {
            switch (i) {
                case 0:
                    System.out.print("Janeiro - ");
                    break;
                case 1:
                    System.out.print("Fevereiro - ");
                    break;
                case 2:
                    System.out.print("Março - ");
                    break;
                case 3:
                    System.out.print("Abril - ");
                    break;
                case 4:
                    System.out.print("Maio - ");
                    break;
                case 5:
                    System.out.print("Junho - ");
                    break;
                case 6:
                    System.out.print("Julho - ");
                    break;
                case 7:
                    System.out.print("Agosto - ");
                    break;
                case 8:
                    System.out.print("Setembro - ");
                    break;
                case 9:
                    System.out.print("Outubro - ");
                    break;
                case 10:
                    System.out.print("Novembro - ");
                    break;
                case 11:
                    System.out.print("Dezembro - ");
                    break;
            }
            for (int j = 0; j < dias[i].length; j++) {
                System.out.println(dias[i][j] + " Dias");
            }
        }

        System.out.println("=-=-=-=-=-=-=-=-=-=-=-=-=-=-=");

        for (int[] arrayBase : dias) {
            for (int num : arrayBase) {
                System.out.println(num);
            }
        }
    }
}
