package com.effectivejava.corejava;

/**
 * Using mutable object as a key in HashMap
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava5 {

    public static void main(final String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        System.out.println(stringBuffer.hashCode());
        stringBuffer.append("World");
        System.out.println(stringBuffer.hashCode());

    }
}