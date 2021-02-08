package com.company;

public class Main {

    public static void main(String[] args) {

        Employee employee1 = new Employee("49494949V", "Laura", 10000, 4030400);
        System.out.println("The ID is: " + employee1.getEmpId());
        System.out.println("Name: " + employee1.getName());
        System.out.println("Salary: " + employee1.getSalary());
        System.out.println("SSN: " + employee1.getSsn());

        Manager manager1 = new Manager("57575757V", "Max", 2000, 404040, "Marketing");
        System.out.println("The ID is: " + manager1.getEmpId());
        System.out.println("Name: " + manager1.getName());
        System.out.println("Salary: " + manager1.getSalary());
        System.out.println("SSN: " + manager1.getSsn());
        System.out.println("Department: " + manager1.getDepartment());

        Director director1 = new Director("43434340C", "Ander", 1800,404048,"Direction", 10000);
        System.out.println("The ID is: " + director1.getEmpId());
        System.out.println("Name: " + director1.getName());
        System.out.println("Salary: " + director1.getSalary());
        System.out.println("SSN: " + director1.getSsn());
        System.out.println("Department: " + director1.getDepartment());
        System.out.println("Budget: " + director1.pressupost_control);

        Engineer engineer1 = new Engineer("606060%&C", "Tomas", 1500, 202020);
        System.out.println("The ID is: " + engineer1.getEmpId());
        System.out.println("Name: " + engineer1.getName());
        System.out.println("Salary: " + engineer1.getSalary());
        System.out.println("SSN: " + engineer1.getSsn());

        Administrator administrator1 = new Administrator("50505055B", "Alien", 3000, 242424);
        System.out.println("The ID is: " + administrator1.getEmpId());
        System.out.println("Name: " + administrator1.getName());
        System.out.println("Salary: " + administrator1.getSalary());
        System.out.println("SSN: " + administrator1.getSsn());
    }
}
