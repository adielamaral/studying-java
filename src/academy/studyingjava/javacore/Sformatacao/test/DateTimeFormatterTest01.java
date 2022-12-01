package academy.studyingjava.javacore.Sformatacao.test;

import javax.swing.text.DateFormatter;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        LocalDate date = LocalDate.now();
        String format1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String format2 = date.format(DateTimeFormatter.ISO_DATE);
        String format3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
        LocalDate parse1 = LocalDate.parse("20221201", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate parse2 = LocalDate.parse("2022-12-01+05:00", DateTimeFormatter.ISO_DATE);
        LocalDate parse3 = LocalDate.parse("2022-12-01", DateTimeFormatter.ISO_LOCAL_DATE);
        System.out.println(parse1);
        System.out.println(parse2);
        System.out.println(parse3);

        LocalDateTime now = LocalDateTime.now();
        String format4 = now.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(format4);
        LocalDateTime parse4 = LocalDateTime.parse("2022-12-01T10:39:31.9978761", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(parse4);

        // Formatação de data no Brasil: dd/MM/yyyy
        // Formatação de data nos EUA: MM/dd/yyyy
        // Formatação de data no Japão: yyyy/MM/dd
        DateTimeFormatter formatterBR = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String formatBR = LocalDate.now().format(formatterBR);
        System.out.println(formatBR);
        LocalDate parseBR = LocalDate.parse("01/12/2022", formatterBR);
        System.out.println(parseBR);

        DateTimeFormatter formatterGR = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String formatGR = LocalDate.now().format(formatterGR);
        System.out.println(formatGR);
        LocalDate parseGR = LocalDate.parse("01.Dezember.2022", formatterGR);
        System.out.println(parseGR);
    }
}
