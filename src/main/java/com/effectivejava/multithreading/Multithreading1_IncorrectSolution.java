package com.effectivejava.multithreading;

/**
 * Race condition in custom AtomicInteger.
 * 
 * @author learneffectivejava
 *
 */
class SynchronizedInteger1 {
    private volatile int data;

    public SynchronizedInteger1(int data) {
        this.data = data;
    }

    public synchronized int getData() {
        return data;
    }

    public synchronized void setData(int data) {
        this.data = data;
    }
}

class Incrementer1 extends Thread {
    SynchronizedInteger1 synchronizedInteger;

    public Incrementer1(SynchronizedInteger1 synchronizedInteger) {
        this.synchronizedInteger = synchronizedInteger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            int data = synchronizedInteger.getData();
            synchronizedInteger.setData(data + 1);
        }
    }
}

public class Multithreading1_IncorrectSolution {
    public static void main(final String[] args) throws InterruptedException {
        SynchronizedInteger1 synchronizedInteger = new SynchronizedInteger1(0);
        Incrementer1 incrementer1 = new Incrementer1(synchronizedInteger);
        Incrementer1 incrementer2 = new Incrementer1(synchronizedInteger);

        System.out.println("synchronizedInteger before incrementer threads started: " + synchronizedInteger.getData());
        incrementer1.start();
        incrementer2.start();
        incrementer1.join();
        incrementer2.join();
        System.out.println("synchronizedInteger after incrementer threads completed: " + synchronizedInteger.getData());
    }
}