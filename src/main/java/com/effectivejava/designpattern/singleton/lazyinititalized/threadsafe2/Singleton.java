package com.effectivejava.designpattern.singleton.lazyinititalized.threadsafe2;

/**
 * Lazy Initialized Singleton thread-safe version 2.
 * 
 * @author learneffectivejava
 *
 */
public class Singleton {

    private static Singleton _instance;

    // private constructor, so that new instance cannot be created from outside
    private Singleton() {
    }

    public static Singleton getInstance() {
        synchronized (Singleton.class) {
            if (_instance == null) {
                _instance = new Singleton();
            }
        }
        return _instance;
    }

}