package com.effectivejava.corejava;

import java.util.HashMap;

/**
 * Using mutable object as a key in HashMap
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava6 {

    public static void main(final String[] args) {
        Student student = new Student("Student1", 1);
        HashMap<Student, Integer> map = new HashMap<>();
        map.put(student, 1);

        System.out.println("student before update: " + student);
        System.out.println("map.get(student) before update: " + map.get(student));
        student.setName("Student2");
        System.out.println("student after update: " + student);
        System.out.println("map.get(student) after update: " + map.get(student));

    }
}