package com.bridgelabz;

public class EmployeesUC8 {
    private String name;
    private CompanyUC8 company;

    public EmployeesUC8(String name, CompanyUC8 company) {
        this.name = name;
        this.company = company;
    }

    public double calculateMonthlySalary() {
        return company.getWage() * company.getWorkingDays() * company.getWorkingHour();
    }

    public String getName() {
        return name;
    }

    public CompanyUC8 getCompany() {
        return company;
    }

}
