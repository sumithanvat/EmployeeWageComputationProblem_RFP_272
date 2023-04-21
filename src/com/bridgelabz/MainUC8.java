package com.bridgelabz;

public class MainUC8 {
    public static void main(String[] args) {
        // Create instances of the Company class for each company
        CompanyUC8 company1 = new CompanyUC8("TCS", 15, 20, 20);
        CompanyUC8 company2 = new CompanyUC8("Tesla.", 20, 25, 30);

        // Create instances of the Employee class for each employee, passing in the appropriate Company instance
        EmployeesUC8 employee1 = new EmployeesUC8("Dev", company1);
        EmployeesUC8 employee2 = new EmployeesUC8("Divya", company2);

        // Calculate monthly salary for each employee
        double monthlySalary1 = employee1.calculateMonthlySalary();
        double monthlySalary2 = employee2.calculateMonthlySalary();

        // Print the results
        System.out.println("Montly salary for " + employee1.getName() + " at " + employee1.getCompany().getName() + " is " + monthlySalary1);
        System.out.println("Monthly salery for " + employee2.getName() + " at " + employee2.getCompany().getName() + " is " + monthlySalary2);
    }
    }

