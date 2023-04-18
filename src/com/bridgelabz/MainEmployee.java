package com.bridgelabz;

public class MainEmployee {
    public static void main(String[] args) {
        Employee fullTimeEmployee = new Employee(20, 20, 100);
        int fullTimeWage = fullTimeEmployee.computeWage();
        System.out.println("UC_7 Full-time employee wage for the month: " + fullTimeWage);

        Employee partTimeEmployee = new Employee(20, 20, 100);
        int partTimeWage = partTimeEmployee.computeWage();
        System.out.println("UC_7 Part-time employee wage for the month: " + partTimeWage);
    }
}
