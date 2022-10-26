package academy.studyingjava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;
import java.util.Locale;

public class LocaleTest01 {
    public static void main(String[] args) {
        // pt-BR
        Locale localeItaly = new Locale("it", "IT"); // Itália
        Locale localeCH = new Locale("it", "CH"); // Suiça
        Locale localeIndia = new Locale("hi", "IN"); // India
        Locale localeJapao = new Locale("ja", "JP"); // Japão
        Locale localeHolanda = new Locale("nl", "NL"); // Holanda
        Locale localeEUA = new Locale("en", "US"); // EUA

        Calendar calendar = Calendar.getInstance();
        DateFormat df1 = DateFormat.getDateInstance(DateFormat.FULL, localeItaly);
        DateFormat df2 = DateFormat.getDateInstance(DateFormat.FULL, localeCH);
        DateFormat df3 = DateFormat.getDateInstance(DateFormat.FULL, localeIndia);
        DateFormat df4 = DateFormat.getDateInstance(DateFormat.FULL, localeJapao);
        DateFormat df5 = DateFormat.getDateInstance(DateFormat.FULL, localeHolanda);
        DateFormat df6 = DateFormat.getDateInstance(DateFormat.FULL, localeEUA);

        System.out.println("Itália: " + df1.format(calendar.getTime()));
        System.out.println("Suiça: " + df2.format(calendar.getTime()));
        System.out.println("India: " + df3.format(calendar.getTime()));
        System.out.println("Japão: " + df4.format(calendar.getTime()));
        System.out.println("Holanda: " + df5.format(calendar.getTime()));
        System.out.println("EUA: " + df6.format(calendar.getTime()));

        System.out.println(localeItaly.getDisplayCountry(localeEUA));
        System.out.println(localeEUA.getDisplayCountry(localeCH));
        System.out.println(localeHolanda.getDisplayCountry(localeJapao));
    }
}
