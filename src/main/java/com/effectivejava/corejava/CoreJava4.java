package com.effectivejava.corejava;

import java.util.HashMap;

/**
 * Using mutable object as a key in HashMap
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava4 {

    public static void main(final String[] args) {
        StringBuffer stringBuffer = new StringBuffer("Hello");
        HashMap<Object, String> map = new HashMap<>();
        map.put(stringBuffer, stringBuffer.toString());

        System.out.println("stringBuffer before update: " + stringBuffer);
        System.out.println("map.get(stringBuffer) Before updating stringBuffer: " + map.get(stringBuffer));
        stringBuffer.append("World");
        System.out.println("stringBuffer after update: " + stringBuffer);
        System.out.println("map.get(stringBuffer) After updating stringBuffer: " + map.get(stringBuffer));

    }
}