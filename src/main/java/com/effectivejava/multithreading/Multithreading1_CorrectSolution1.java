package com.effectivejava.multithreading;

/**
 * Race condition in custom AtomicInteger.
 * 
 * @author learneffectivejava
 *
 */
class SynchronizedInteger2 {
    private int data;

    public SynchronizedInteger2(int data) {
        this.data = data;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }
}

class Incrementer2 extends Thread {
    SynchronizedInteger2 synchronizedInteger;

    public Incrementer2(SynchronizedInteger2 synchronizedInteger) {
        this.synchronizedInteger = synchronizedInteger;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10000; i++) {
            synchronized (synchronizedInteger) {
                int data = synchronizedInteger.getData();
                synchronizedInteger.setData(data + 1);
            }
        }
    }
}

public class Multithreading1_CorrectSolution1 {
    public static void main(final String[] args) throws InterruptedException {
        SynchronizedInteger2 synchronizedInteger = new SynchronizedInteger2(0);
        Incrementer2 incrementer1 = new Incrementer2(synchronizedInteger);
        Incrementer2 incrementer2 = new Incrementer2(synchronizedInteger);

        System.out.println("synchronizedInteger before incrementer threads started: " + synchronizedInteger.getData());
        incrementer1.start();
        incrementer2.start();
        incrementer1.join();
        incrementer2.join();
        System.out.println("synchronizedInteger after incrementer threads completed: " + synchronizedInteger.getData());
    }
}