package com.effectivejava.corejava;

/**
 * Practical understanding of hashCode method (Part 3)
 * 
 * @author learneffectivejava
 *
 */
import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class CoreJava14 {

    public static class Employee {

        private int id;

        public Employee(final int id) {
            this.id = id;
        }

        @Override
        public int hashCode() {
            Random random = new Random();
            final int upperRange = 100;
            int hash = random.nextInt(upperRange);
            System.out.println("Returning hashCode value: " + hash);
            return hash;
        }

        @Override
        public boolean equals(Object obj) {
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
        Employee employee = new Employee(1);
        employees.add(employee);
        System.out.println(employees.contains(employee));
    }
}