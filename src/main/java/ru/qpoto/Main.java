package ru.qpoto;

import java.util.stream.IntStream;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        IntStream.range(0, 100).forEach(i -> {
            Thread h1 = new Thread(new ReleaseHydrogen());
            Thread h2 = new Thread(new ReleaseHydrogen());
            Thread o  = new Thread(new ReleaseOxygen());

            h1.start();
            h2.start();
            o.start();

            try {
                o.join();
                h1.join();
                h2.join();
            } catch (InterruptedException e) {
                Thread.currentThread().interrupt();
                throw new RuntimeException(e);
            }

            System.out.println();
        });
    }
}