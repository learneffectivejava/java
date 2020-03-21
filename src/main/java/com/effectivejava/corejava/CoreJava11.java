package com.effectivejava.corejava;

/**
 * Java equals hashCode contract
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava11 {
    public static void main(final String[] args) {
        String s1 = "Hello";
        String s2 = "Hello";
        String s3 = new String("Hello");

        System.out.println((s1 == s2));
        System.out.println((s2 == s3));
        System.out.println((s3 == s1));

        System.out.println((s1.equals(s2)));
        System.out.println((s2.equals(s3)));
        System.out.println((s3.equals(s1)));

        System.out.println((s1.hashCode() == s2.hashCode()));
        System.out.println((s2.hashCode() == s3.hashCode()));
        System.out.println((s3.hashCode() == s1.hashCode()));
    }
}