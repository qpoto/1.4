package ru.qpoto;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        for (int i = 0; i < 100; i++) {
            Thread threadHydrogen = new Thread(new ReleaseHydrogen());
            Thread threadOxygen = new Thread(new ReleaseOxygen());
            threadHydrogen.start();
            threadOxygen.start();
            threadOxygen.join();
            threadHydrogen.join();
        }
    }
}