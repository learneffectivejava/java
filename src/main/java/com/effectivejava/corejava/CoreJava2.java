package com.effectivejava.corejava;

/**
 * Immutable vs. Mutable class in Java
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava2 {

    public static void main(final String[] args) {
        String str1 = "Hello";
        String str2 = str1;
        str1 += "World";
        System.out.println(str1 + " " + str2 + " " + (str1 == str2));

        StringBuffer sb1 = new StringBuffer("Hello");
        StringBuffer sb2 = sb1;
        sb1.append("World");
        System.out.println(sb1 + " " + sb2 + " " + (sb1 == sb2));
    }
}