package com.bridgelabz;

public class EmpWageBuilder {
    private CompanyUC8 company;
    private double totalWage;

    public EmpWageBuilder(CompanyUC8 company) {
        this.company = company;
    }

    public void calculateTotalWage() {
        totalWage = company.getWage() * company.getWorkingDays() * company.getWorkingHour();
    }

    public CompanyUC8 getCompany() {
        return company;
    }

    public double getTotalWage() {
        return totalWage;
    }
}

