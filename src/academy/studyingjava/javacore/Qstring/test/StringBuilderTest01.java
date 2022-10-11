package academy.studyingjava.javacore.Qstring.test;

public class StringBuilderTest01 {
    public static void main(String[] args) {
        String nome = "Adiel";
        nome.concat("Amaral");
        nome = nome.substring(1, 5);
        System.out.println(nome);

        StringBuilder sb = new StringBuilder("Adiel");
        sb.append(" Amaral").append(" Pires");
        sb.reverse();
        sb.reverse();
        sb.delete(0, 1);
        System.out.println(sb);
    }
}
