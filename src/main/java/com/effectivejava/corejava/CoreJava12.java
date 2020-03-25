package com.effectivejava.corejava;

import java.util.HashSet;
import java.util.Set;

/**
 * Practical understanding of hashCode method (Part 1)
 * 
 * @author learneffectivejava
 *
 */
public class CoreJava12 {

    public static class Employee {

        private int id;

        public Employee(final int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            System.out.println("Returning hashCode value: 1");
            return 1;
        }

        @Override
        public boolean equals(final Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Employee other = (Employee) obj;
            if (id != other.id)
                return false;
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