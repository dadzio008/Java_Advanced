package Threads;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class MyThread {
    public static void main(String[] args) throws InterruptedException {


        Thread t1 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.print("Hello "+"\n");
            }
        });


        Thread t2 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.print("world"+"\n");
            }
        });


        Thread t3 = new Thread(() -> {
            for (int i = 0; i < 4; i++) {
                System.out.println("!"+"\n");
            }
        });



        t1.run();
        t2.start();
        t3.start();
    }
}