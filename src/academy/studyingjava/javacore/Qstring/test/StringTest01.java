package academy.studyingjava.javacore.Qstring.test;

public class StringTest01 {
    public static void main(String[] args) {
        String nome = "Adiel"; // String constant pool
        String nome2 = "Adiel";
        nome = nome.concat(" Amaral"); // nome += " Amaral"
        System.out.println(nome);
        System.out.println(nome == nome2);
        String nome3 = new String("Adiel"); // 1 - Variável de referência, 2 - Objeto do tipo string, 3 - Uma string no pool de string
        System.out.println(nome2 == nome3);
        System.out.println(nome2 == nome3.intern());
    }
}
