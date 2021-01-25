package Example2.DateandTime;

import java.time.*;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class YourAge {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj datę twoich narodzin: ");
        String date1 = scanner.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate date2 = LocalDate.now();
//        String date2 = scanner.nextLine();
        LocalDate dateN = LocalDate.parse(date1, format);
        Period period = Period.between(dateN, date2);
        System.out.println("Masz " + period.getYears() + " lat, " + period.getMonths()
                + " miesięcy, " + period.getDays() + " dni Stary Koniu. :)");
        Instant dates1 = dateN.atStartOfDay().toInstant(ZoneOffset.UTC);
        Instant dates2 = date2.atTime(LocalDateTime.now().toLocalTime()).toInstant(ZoneOffset.UTC);
//Your age in seconds
        Duration sek = Duration.between(dates1, dates2);
        System.out.println(sek.toSeconds());
    }
}
