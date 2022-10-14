package academy.studyingjava.javacore.Rdatas.test;

import java.util.Date;

public class DateTest01 {
    public static void main(String[] args) {
        Date date = new Date(1665690302778L); // Long 1000000
        date.setTime(date.getTime() + 3_600_000);
        System.out.println(date);
    }
}
