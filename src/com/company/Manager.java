package com.company;

public class Manager extends Employee {
    private String department;

    public Manager(String empId, String name, int ssn, int salary, String department) {
        super(empId, name, salary, ssn);
        this.department=department;
    }

    public String getDepartment() {
        return this.department;
    }
    @Override
    public void display() {
        super.display();
        System.out.println("Department: " + this.department);
    }

}
