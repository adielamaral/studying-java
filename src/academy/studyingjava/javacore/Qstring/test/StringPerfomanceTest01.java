package academy.studyingjava.javacore.Qstring.test;

public class StringPerfomanceTest01 {
    public static void main(String[] args) {
        long inicio = System.currentTimeMillis();
        concatString(30_000); // Outra forma de representar 30000 para ficar mais fácil de visualizar
        long fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para String: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuilder(1_000_000); // Outra forma de representar 1000000 para ficar mais fácil de visualizar
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuilder: " + (fim - inicio) + "ms");

        inicio = System.currentTimeMillis();
        concatStringBuffer(1_000_000); // Outra forma de representar 1000000 para ficar mais fácil de visualizar
        fim = System.currentTimeMillis();
        System.out.println("Tempo gasto para StringBuffer: " + (fim - inicio) + "ms");
    }

    private static void concatString(int tamanho) {
        String texto = "";
        for (int i = 0; i < tamanho; i++) {
            texto += i;
        }
    }

    private static void concatStringBuilder(int tamanho) {
        StringBuilder sb = new StringBuilder(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }

    private static void concatStringBuffer(int tamanho) {
        StringBuffer sb = new StringBuffer(tamanho);
        for (int i = 0; i < tamanho; i++) {
            sb.append(i);
        }
    }
}
