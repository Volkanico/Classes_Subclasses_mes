package com.company;

public class Administrator extends Employee implements Management {
    private String project;

    public Administrator (String empId, String name, int salary, int ssn, String project) {
        super(empId, name, salary, ssn);
        this.project = project;


    }
    @Override
    public void hire(Employee e) {
        System.out.println("Administrator:\n" + this);
        System.out.println("\nHires:\n" + e);
    }
    @Override
    public void plan() {
        System.out.println("Administrator:\n" + this);
        System.out.println("\nPlans: " + this.project);
    }
}
