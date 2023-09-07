import java.time.LocalDate;

public class LocalDateExample2 {
    public static void main(String[] args) {
        LocalDate date1=LocalDate.of(2017,1,12);
        System.out.println(date1.isLeapYear());
        LocalDate date2=LocalDate.of(2016,9,16);
        System.out.println(date2.isLeapYear());
        System.out.println(date1.atStartOfDay());
    }
}
