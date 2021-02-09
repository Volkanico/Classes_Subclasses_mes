package com.company;

public class Manager extends Employee implements  Management {
    private String department;
    private final int maxEmployees = 20;
    private Employee[] Employees;
    private int numEmployees;

    public Manager(String empId, String name, int ssn, int salary, String department) {
        super(empId, name, salary, ssn);
        this.department = department;
        this.Employees = new Employee[maxEmployees];
        numEmployees = 0;
    }
    public void hire(Employee e) {
        if (addEmployee(e)) {
            System.out.println("Manager:\n" + this);
            System.out.println("\nHires:\n" + e);
        }
    }
    @Override
    public void plan() {
        System.out.println("Manager:\n" + this);
        System.out.println("\nDepartment: " + this.department);
    }

    public int findEmployee (Employee e) {
        for(int i = 0; i < this.numEmployees; i++) {
            if(Employees[i].getEmpId() == e.getEmpId()){
                return i;
            }
        }
        return -1;
    }

    public boolean addEmployee (Employee e) {
        if (findEmployee(e) == -1) {
            this.Employees[numEmployees] = e;
            this.numEmployees++;
            return true;
        }
        return false;
    }
    public boolean removeEmployee(Employee e) {
        int employeeToRemoveIndex = findEmployee(e);

        if (employeeToRemoveIndex != -1) {
            Employee[] auxEmployees = new Employee[maxEmployees];
            for (int i = 0; i < this.numEmployees; i++) {
                if (i < employeeToRemoveIndex) {
                    auxEmployees[i] = this.Employees[i];
                } else {
                    auxEmployees[i] = this.Employees[i + 1];
                }
            }
            this.Employees = auxEmployees;
            this.numEmployees--;
            return true;
        }
        return false;
    }
    public void printStaffDetails () {
        System.out.println(toString());
        System.out.println("\n The employees list: ");
        for(int i = 0; i < this.numEmployees; i++) {
            System.out.println();
            Employees[i].toString();
        }
    }
    public String getDepartment() {
        return this.department;
    }



    @Override
    public int grantStock () {
        return 100;
    }
    @Override
    public String toString () {
        super.toString();
        return super.toString() + "Department: " + this.department;
    }

}
