package concurrency.countDownLatch;

import java.util.concurrent.CountDownLatch;

public class Demo {
    public static void main(String[] args) {

        final int num = 5;

        CountDownLatch cdl = new CountDownLatch(num);

        for(int i=0; i<num; i++){
            Thread thread = new Thread(() -> {
                System.out.println(123);
            });
            thread.start();
        }





    }
}
