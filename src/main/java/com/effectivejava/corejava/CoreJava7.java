package com.effectivejava.corejava;

/**
 * Using mutable object as a key in HashMap
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava7 {

    public static void main(final String[] args) {
        Student student = new Student("Student1", 1);
        System.out.println(student.hashCode());
        student.setName("Student2");
        System.out.println(student.hashCode());

    }
}