package com.effectivejava.corejava;

/**
 * equals method String, StringBuffer and StringBuilder classes.
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava3 {

    public static void main(final String[] args) {
        String str1 = new String("Hello");
        String str2 = new String("Hello");
        System.out.println(str1 == str2);
        System.out.println(str1.equals(str2));
        System.out.println();

        StringBuffer stringBuffer1 = new StringBuffer("Hello");
        StringBuffer stringBuffer2 = new StringBuffer("Hello");
        System.out.println(stringBuffer1 == stringBuffer2);
        System.out.println(stringBuffer1.equals(stringBuffer2));
        System.out.println();

        StringBuilder stringBuilder1 = new StringBuilder("Hello");
        StringBuilder stringBuilder2 = new StringBuilder("Hello");
        System.out.println(stringBuilder1 == stringBuilder2);
        System.out.println(stringBuilder1.equals(stringBuilder2));

    }
}