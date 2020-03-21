package com.effectivejava.corejava;

/**
 * Class members vs. instance members in inheritance.
 * 
 * @author learneffectivejava
 *
 */
class A {
    public static int i1 = 1;
    public int i2 = 2;

    public static void m1() {
        System.out.println("A:m1");
    }

    public void m2() {
        System.out.println("A:m2");
    }
}

class B extends A {
    public static int i1 = 3;
    public int i2 = 4;

    public static void m1() {
        System.out.println("B:m1");
    }

    @Override
    public void m2() {
        System.out.println("B:m2");
    }
}

public class CoreJava10 {
    public static void main(final String[] args) {
        A a = new A();
        A b = new B();
        System.out.println(a.i1);
        System.out.println(a.i2);
        System.out.println(b.i1);
        System.out.println(b.i2);
        a.m1();
        a.m2();
        b.m1();
        b.m2();
    }
}