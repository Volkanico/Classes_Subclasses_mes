package com.company;

public class Director extends Manager {
    double pressupost_control;

    public Director(String empId, String name, int salary, int ssn, String department, double pressupost_control) {
        super(empId, name, salary, ssn, department);
        this.pressupost_control = pressupost_control;
    }

    public double getPressupost() {
        return this.pressupost_control;
    }

    @Override
    public void display() {
        super.display();
        System.out.println("Budget: " + this.pressupost_control);
    }

}
