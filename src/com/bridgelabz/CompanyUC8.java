package com.bridgelabz;

public class CompanyUC8 {

    private String name;
    private int workingHour;
    private int workingDays;
    private double wage;

    // calling paramiterise constractor of company
    public CompanyUC8(String name , int workingHour , int workingDays , double wage){
        this.name = name;
        this.wage = wage;
        this.workingHour = workingHour;
        this.workingDays = workingDays;
    }

    public String getName() {
        return name;
    }

    public int getWorkingHour() {
        return workingHour;
    }

    public int getWorkingDays() {
        return workingDays;
    }

    public double getWage() {
        return wage;
    }
}
