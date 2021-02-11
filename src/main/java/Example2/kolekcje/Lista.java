package Example2.kolekcje;

import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Lista {
    public static void set() {


        Scanner scan = new Scanner(System.in);
        List<Integer> list = new LinkedList<>();
        for (int i = 0; i < 5; i++) {
            list.add(scan.nextInt());
        }
        System.out.println(list);
    }

//    public static void main(String[] args) {
//        set();


}
