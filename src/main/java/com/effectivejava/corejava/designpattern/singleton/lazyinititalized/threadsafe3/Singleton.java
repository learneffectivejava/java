package com.effectivejava.corejava.designpattern.singleton.lazyinititalized.threadsafe3;

/**
 * Lazy Initialized Singleton thread-safe version 3 with Double-Checked-Locking.
 *
 * @author learneffectivejava
 * 
 */
public class Singleton {
    private static volatile Singleton _instance;

    // private constructor, so that new instance cannot be created from outside
    private Singleton() {
    }

    public static Singleton getInstance() {
        if (_instance == null) {
            synchronized (Singleton.class) {
                if (_instance == null)
                    _instance = new Singleton();
            }
        }
        return _instance;
    }
}