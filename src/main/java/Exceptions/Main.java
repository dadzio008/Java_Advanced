package Exceptions;

import java.util.Scanner;

public class Main {
    /**
     * Napisz program, który prosi użytkownika o dwie liczby(całkowite) a i b,
     * i wyświetla wynik dzielenia a/b. Jeżeli b jest ujemne program powinien wyświetlić odpowiedni komunikat.
     * (Dwie metody [przyjmujemy dwa argumenty])
     * Wariant 1: Zastosuj instrukcję if            (zamiast exception wyświetlamy komunikat)
     * Wariant 2: Zastosuj instrukcję try-catch     (wywołujemy metodę i przechwycenie odbywa się w main)
     */
    public static void main(String[] args) {
        try{
            Liczby liczby = new Liczby();
            liczby.dodajLiczby();
        }catch (CholeroProwadzacyException cme){
            System.err.println("Nie dziel cholero przez zero!!");
        }

    }
}
