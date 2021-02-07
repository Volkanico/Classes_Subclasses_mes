package com.company;

public class Employee {

    private String empId;
    private String name;
    private int salary;
    private int ssn;


    public Employee() {
        this.empId = "identification";
        this.name = "name";
        this.salary = 1500;
        this.ssn = 25252525;
    }

    public String getName () {
        return name;
    }
    public void setName (String newName) {
        this.name = newName;
    }
    public int getSalary () {
        return salary;
    }
    public void setSalary (int salary1) {
        salary1 = (salary*5)/100;
        this.salary = salary1;
    }



}