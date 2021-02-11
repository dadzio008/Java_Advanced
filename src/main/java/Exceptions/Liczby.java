package Exceptions;

import java.util.Scanner;

public class Liczby {
    public void dodajLiczby() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj dwie liczby dodatnie: ");
        Double a = scan.nextDouble();
        Double b = scan.nextDouble();
        if (b <= 0) {
            throw new CholeroProwadzacyException("Pamietaj cholero by nie dzielic przez zero");
        }
        else {
            System.out.println(a/b);
        }
    }
}
