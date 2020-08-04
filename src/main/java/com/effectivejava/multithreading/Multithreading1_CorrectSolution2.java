package com.effectivejava.multithreading;

/**
 * Race condition in custom AtomicInteger.
 * 
 * @author learneffectivejava
 *
 */
class SynchronizedInteger3 {
    private int data;

    public SynchronizedInteger3(int data) {
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

class Incrementer3 extends Thread {
    SynchronizedInteger3 synchronizedInteger;

    public Incrementer3(SynchronizedInteger3 synchronizedInteger) {
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
        SynchronizedInteger3 synchronizedInteger = new SynchronizedInteger3(0);
        Incrementer3 incrementer1 = new Incrementer3(synchronizedInteger);
        Incrementer3 incrementer2 = new Incrementer3(synchronizedInteger);

        System.out.println("synchronizedInteger before incrementer threads started: " + synchronizedInteger.getData());
        incrementer1.start();
        incrementer2.start();
        incrementer1.join();
        incrementer2.join();
        System.out.println("synchronizedInteger after incrementer threads completed: " + synchronizedInteger.getData());
    }
}