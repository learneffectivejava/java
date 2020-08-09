package com.effectivejava.corejava.designpattern.singleton.lazyinititalized.threadsafe1;

/**
 * Lazy Initialized Singleton thread-safe version.
 * 
 * @author learneffectivejava
 *
 */
public class Singleton {

    private static Singleton _instance;

    // private constructor, so that new instance cannot be created from outside
    private Singleton() {
    }

    public static synchronized Singleton getInstance() {
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }

}