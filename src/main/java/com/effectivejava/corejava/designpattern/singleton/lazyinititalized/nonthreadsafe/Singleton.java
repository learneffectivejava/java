package com.effectivejava.corejava.designpattern.singleton.lazyinititalized.nonthreadsafe;

/**
 * Lazy Initialized Singleton.
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
        if (_instance == null) {
            _instance = new Singleton();
        }
        return _instance;
    }

}