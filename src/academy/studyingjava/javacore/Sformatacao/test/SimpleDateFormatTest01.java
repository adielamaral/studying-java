package academy.studyingjava.javacore.Sformatacao.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        String pattern = "'Rurópolis,' dd 'de' MMMM 'de' yyyy 'às' HH:mm:ss z";
        SimpleDateFormat sdf = new SimpleDateFormat(pattern);
        System.out.println(sdf.format(new Date()));

        // parse
        try {
            System.out.println(sdf.parse("Rurópolis, 03 de novembro de 2022 às 16:53:49 BRT"));
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
    }
}
