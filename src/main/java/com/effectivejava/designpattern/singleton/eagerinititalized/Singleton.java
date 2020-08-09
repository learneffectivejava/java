package com.effectivejava.designpattern.singleton.eagerinititalized;

/**
 * Eager Initialized Singleton.
 * 
 * @author learneffectivejava
 *
 */
public class Singleton {

    private static final Singleton _instance = new Singleton();

    // private constructor, so that new instance cannot be created from outside
    private Singleton() {
    }

    public static Singleton getInstance() {
        return _instance;
    }

}