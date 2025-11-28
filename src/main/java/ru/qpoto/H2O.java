package ru.qpoto;

class H2O {

    public H2O() { }

    public void hydrogen(Runnable releaseHydrogen) throws InterruptedException {
        releaseHydrogen.run();
    }

    public void oxygen(Runnable releaseOxygen) throws InterruptedException {
        releaseOxygen.run();
    }
}
