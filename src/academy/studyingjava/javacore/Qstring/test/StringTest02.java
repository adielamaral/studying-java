package academy.studyingjava.javacore.Qstring.test;

import java.util.Locale;

public class StringTest02 {
    public static void main(String[] args) {
        String nome = "Wemila";
        String nome2 = "   Adiel   ";
        String numeros = "012345";
        System.out.println(nome.charAt(0));
        System.out.println(nome.length());
        System.out.println(nome.replace("W", "U"));
        System.out.println(nome.toLowerCase());
        System.out.println(nome.toUpperCase());
        System.out.println(numeros.length());
        System.out.println(numeros.substring(3,numeros.length())); // Recebe dois valores, o índice (de onde você quer começar) e o índice de onde você quer terminar
        System.out.println(nome2.trim()); // Remove os valores em branco do começo e do fim da string
    }
}
