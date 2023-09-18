package org.quangphan.java.design.patterns.singleton_pattern.eager;

public class ClientDemo {

    public static void main(String[] args) {

        Runnable runnable1 = () -> {
            try {
                System.out.println("Start thread " + Thread.currentThread().getId());
                Thread.sleep(2000);
                Captain.getCaptain();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        Runnable runnable2 = () -> {
            try {
                System.out.println("Start thread " + Thread.currentThread().getId());
                Thread.sleep(2000);
                Captain.getCaptain();
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        };

        runnable1.run();
        runnable2.run();
    }

}
