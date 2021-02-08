package com.company;

public class Employee {

    private String empId;
    private String name;
    private int salary;
    private int ssn;


    public Employee(String empId, String name, int salary, int ssn) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
        this.ssn = ssn;
    }


    public String getName () {
        return name;
    }
    public int getSsn () {
        return ssn;
    }
    public String getEmpId () {
        return empId;
    }
    public void setName (String newName) {
        this.name = newName;
    }
    public int getSalary () {
        return salary;
    }
    public void setSalary (double percent) {
        this.salary = this.salary + (int)(this.salary + percent);

    }

    public void display () {

        System.out.println("The employee " + name + " have the next ID: " + empId +
                ". He or she have this SSN: " + ssn + " and this salary: " + salary );
    }



}