package Example2.DateandTime;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class PeriodBetweenTwoDates {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String date1 = scan.nextLine();
        String date2 = scan.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd.MM.yyyy");
        LocalDate dates1 = LocalDate.parse(date1, format);
        LocalDate dates2 = LocalDate.parse(date2, format);
        Period period = Period.between(dates1, dates2);
        System.out.println("Years: " + period.getYears() + " Months: " + period.getMonths() + " Days: " + period.getDays());
        System.out.println("Minęło " + period.getYears() + " lat, " + period.getMonths() + " miesięcy " + period.getDays() + " dni: ");

    }
}
