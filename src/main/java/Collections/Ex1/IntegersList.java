package Collections.Ex1;

import java.util.LinkedList;
import java.util.List;
import java.util.Random;
import java.util.Scanner;

public class IntegersList {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Random randomize = new Random();
        List list = new LinkedList();
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }
        for (int i = 0; i < 5; i++) {

            list.add(randomize.nextInt());
        }
        System.out.println(list);
    }
}
