package academy.studyingjava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.util.Locale;

public class NumberFormatTest01 {
    public static void main(String[] args) {
        Locale localeDefaut = Locale.getDefault(); // Puxa do sistema operacional
        Locale localeJP = Locale.JAPAN;
        Locale localeCA = Locale.CANADA;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getInstance(localeCA);
        nfa[1] = NumberFormat.getInstance(localeJP);
        nfa[2] = NumberFormat.getInstance(localeDefaut);
        nfa[3] = NumberFormat.getInstance(localeIT);

        double valor = 100_000_000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.format(valor));
        }
    }
}
