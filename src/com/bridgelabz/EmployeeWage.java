package com.bridgelabz;

import java.util.Random;

public class EmployeeWage {
    public static void main(String[] args) {
        System.out.println("Wellcome to Employee Wage ");

        int attendance =(int) Math.round(Math.random());

        if (attendance == 1){
            System.out.println("employee is present");
        }
        else {
            System.out.println("employee is absent");
        }
        // UC_2
        int fullTimeHour = 8;
        int wagePerHour = 20;
        double dailyWage = fullTimeHour*wagePerHour;
        System.out.println("uc2 DailyWage of enployee is :-"+dailyWage);
        // uc 3
        int partTimeHour = 4;
        dailyWage =partTimeHour*wagePerHour;
        System.out.println("uc3 Daily wage of part time is :- "+dailyWage);

        //uc4
        int employeeType=new Random().nextInt(2)+1;

        // using switch case
        switch (employeeType){
            case 1:
                dailyWage = wagePerHour * fullTimeHour;
                System.out.println("uc4 full time wage of employee is :-"+dailyWage);
                break;
            case 2:
                dailyWage = wagePerHour * partTimeHour;
                System.out.println("uc4 part time wage of employee is :-"+dailyWage);
                break;
            default:
                System.out.println("invalid employee");
        }


        //uc5
        int workingDay = 20;
        double totalWage = wagePerHour*fullTimeHour*workingDay;
        System.out.println("uc5 total monthly wage is :-"+totalWage);

        // UC 6: Calculate Wages till a condition of total working hours or days is reached for a month
        int maxWorkingHours = 100;
        int maxWorkingDays = 20;
        int empHours = 0;
        int totalHours = 0;
        int totalDays = 0;
        double MonthlyTotalWage = 0;

        while (totalHours < maxWorkingHours && totalDays < maxWorkingDays) {
            totalHours += empHours;
            totalDays++;
            double empWage = 0;
            totalWage += empWage;
        }

        System.out.println("Total employee wage: " + totalWage);








    }
}
