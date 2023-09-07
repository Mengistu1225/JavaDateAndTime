import java.time.LocalDate;



public class LocalDateExample {
    public static void main(String[] args) {

        LocalDate today=LocalDate.now();
        LocalDate yesterday=today.minusDays(1);
        LocalDate tomorrow=yesterday.plusDays(2);
        System.out.println(today +" "+yesterday+" "+tomorrow);
    }

}
