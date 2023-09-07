import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class DateTimeFormater {
    public static void main(String[] args) {
        LocalDateTime d1=LocalDateTime.now();
        String d1Str=d1.format(DateTimeFormatter.ISO_DATE);
        System.out.println("d1str formater is :"+d1Str);

        LocalDate d2 = LocalDate.of(2002, 05, 01);
        String d2Str = d2.format(DateTimeFormatter.ISO_DATE);
        System.out.println("Date2 in string :  " + d2Str);
    }
}
