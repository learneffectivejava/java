package com.effectivejava.corejava;

/**
 * Using mutable object as a key in HashMap
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava9 {

    public static void main(final String[] args) {
        StudentWithoutEqualsHashCode student = new StudentWithoutEqualsHashCode("Student1", 1);
        System.out.println(student.hashCode());
        student.setName("Student2");
        System.out.println(student.hashCode());

    }
}