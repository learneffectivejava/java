package com.effectivejava.corejava;

/**
 * Mutable class to represent a Student.
 * 
 * @author learneffectivejava
 *
 */
public class StudentWithoutEqualsHashCode {
    private String name;
    private int id;

    public StudentWithoutEqualsHashCode(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", id=" + id + "]";
    }

}