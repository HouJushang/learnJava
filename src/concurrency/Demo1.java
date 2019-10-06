package concurrency;

public class Demo1 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println(1);
        Thread.sleep(6000L);
        System.out.println(2);
    }
}
