package com.effectivejava.multithreading.correct2;

/**
 * Race condition in custom AtomicInteger.
 * 
 * @author learneffectivejava
 *
 */
class SynchronizedInteger {
    private int data;

    public SynchronizedInteger(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public synchronized void incrementData() {
        this.data++;
    }
}

class Incrementer extends Thread {
    SynchronizedInteger synchronizedInteger;

    public Incrementer(SynchronizedInteger synchronizedInteger) {
        this.synchronizedInteger = synchronizedInteger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            // int data = synchronizedInteger.getData();
            // synchronizedInteger.setData(data + 1);
            synchronizedInteger.incrementData();
        }
    }
}

public class Multithreading1_CorrectSolution2 {
    public static void main(final String[] args) throws InterruptedException {
        SynchronizedInteger synchronizedInteger = new SynchronizedInteger(0);
        Incrementer incrementer1 = new Incrementer(synchronizedInteger);
        Incrementer incrementer2 = new Incrementer(synchronizedInteger);

        System.out.println("synchronizedInteger before incrementer threads started: " + synchronizedInteger.getData());
        incrementer1.start();
        incrementer2.start();
        incrementer1.join();
        incrementer2.join();
        System.out.println("synchronizedInteger after incrementer threads completed: " + synchronizedInteger.getData());
    }
}