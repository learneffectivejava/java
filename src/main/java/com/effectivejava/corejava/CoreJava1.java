package com.effectivejava.corejava;

/**
 * A sample java class which shows that it extends java.lang.Object class. It
 * proves that java.lang.Object does not contain any abstract method as we do
 * not implement any method.
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava1 {

    public static void main(String[] args) {
        CoreJava1 coreJava1 = new CoreJava1();
        // There is no method in this class, but we can call methods inherited from
        // java.lang.Object class
        System.out.println(coreJava1.hashCode());
        System.out.println(coreJava1.toString());
    }
}
