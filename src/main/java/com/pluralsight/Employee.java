package com.pluralsight;

public class Employee {
    private String employeeId;
    private String name;
    private String department;
    private double payRate;
    private double hoursWorked;
    private double totalPay;
    private double regularHours;
    private double overtimeHours;

    public Employee(String employeeId, String name, String department, double payRate, double hoursWorked, double totalPay, int regularHours, int overtimeHours){
        this.employeeId = employeeId;
        this.name = name;
        this.department = department;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
        this.totalPay = totalPay;
        this.regularHours = regularHours;
        this.overtimeHours = overtimeHours;
    }

    public double getTotalPay() {
        return totalPay;
    }

    public double getRegularHours() {
        return regularHours;
    }

    public double getOvertimeHours() {
        return overtimeHours;
    }
}
