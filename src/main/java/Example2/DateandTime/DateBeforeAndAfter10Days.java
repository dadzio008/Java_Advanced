package Example2.DateandTime;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.Scanner;

public class DateBeforeAndAfter10Days {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj datę: ");
        String date = scan.nextLine();
        DateTimeFormatter format = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        LocalDate data = LocalDate.parse(date, format);

        System.out.println("Data - 10 wcześniej to: " + data.minusDays(10) + " 10 dni później: " + data.plusDays(10));
    }
}

