package com.effectivejava.corejava;

/**
 * Practical understanding of hashCode method (Part 2)
 * 
 * @author learneffectivejava
 *
 */
import java.util.HashSet;
import java.util.Set;

public class CoreJava13 {

    public static class Employee {

        private int id;

        public Employee(final int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + id;
            System.out.println("Returning hashCode value: " + result);
            return result;
        }

        @Override
        public boolean equals(Object obj) {
            return true;
        }
    }

    public static void main(final String[] args) {
        Set<Employee> employees = new HashSet<>();
        employees.add(new Employee(1));
        employees.add(new Employee(2));
        employees.add(new Employee(3));
        System.out.println(employees.size());
    }
}