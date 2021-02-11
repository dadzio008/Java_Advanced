package Threads;

public class Juhuuu {
    public static void main(String[] args) throws InterruptedException {
        Thread thread = new Thread();
        thread.start();
        Thread.sleep(30000);
        System.out.println("Juhuuuuu!!!");
        thread.stop();
    }
}
