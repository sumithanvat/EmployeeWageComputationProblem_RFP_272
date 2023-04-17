package com.bridgelabz;

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






    }
}
