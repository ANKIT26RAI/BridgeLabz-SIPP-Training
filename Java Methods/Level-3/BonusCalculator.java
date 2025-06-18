package com.studyopedia.JavaMethods.Level3;

public class BonusCalculator {

    public static void main(String[] args) {
        double[][] employeeData = generateEmployeeData(10);
        double[][] bonusData = calculateBonusAndNewSalary(employeeData);
        displayTable(employeeData, bonusData);
    }

    public static double[][] generateEmployeeData(int n) {
        double[][] data = new double[n][2];
        for (int i = 0; i < n; i++) {
            data[i][0] = (int) (Math.random() * 90000) + 10000; // 5-digit salary
            data[i][1] = (int) (Math.random() * 11) + 1; // 1 to 11 years of service
        }
        return data;
    }

    public static double[][] calculateBonusAndNewSalary(double[][] employeeData) {
        double[][] result = new double[employeeData.length][2];
        for (int i = 0; i < employeeData.length; i++) {
            double salary = employeeData[i][0];
            double years = employeeData[i][1];
            double bonus = (years > 5) ? salary * 0.05 : salary * 0.02;
            result[i][0] = salary + bonus;
            result[i][1] = bonus;
        }
        return result;
    }

    public static void displayTable(double[][] employeeData, double[][] bonusData) {
        double sumOld = 0, sumNew = 0, sumBonus = 0;
        System.out.println("Emp\tOld Salary\tYears\tBonus\tNew Salary");
        for (int i = 0; i < employeeData.length; i++) {
            sumOld += employeeData[i][0];
            sumNew += bonusData[i][0];
            sumBonus += bonusData[i][1];
            System.out.printf("%d\t%.2f\t%.0f\t%.2f\t%.2f\n", i + 1, employeeData[i][0], employeeData[i][1],
                    bonusData[i][1], bonusData[i][0]);
        }
        System.out.println("------------------------------------------------------");
        System.out.printf("Total\t%.2f\t\t\t%.2f\t%.2f\n", sumOld, sumBonus, sumNew);
    }
}