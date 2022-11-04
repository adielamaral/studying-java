package academy.studyingjava.javacore.Sformatacao.test;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumberFormatTest02 {
    public static void main(String[] args) {
        Locale localeDefaut = Locale.getDefault(); // Puxa do sistema operacional
        Locale localeJP = Locale.JAPAN;
        Locale localeCA = Locale.CANADA;
        Locale localeIT = Locale.ITALY;
        NumberFormat[] nfa = new NumberFormat[4];

        nfa[0] = NumberFormat.getCurrencyInstance(localeCA);
        nfa[1] = NumberFormat.getCurrencyInstance(localeJP);
        nfa[2] = NumberFormat.getCurrencyInstance(localeDefaut);
        nfa[3] = NumberFormat.getCurrencyInstance(localeIT);

        double valor = 1000.2130;
        for (NumberFormat numberFormat : nfa) {
            System.out.println(numberFormat.getMaximumFractionDigits());
            System.out.println(numberFormat.format(valor));
        }

        String valorString = "￥1,000";
        try {
            System.out.println(nfa[1].parse(valorString));
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
