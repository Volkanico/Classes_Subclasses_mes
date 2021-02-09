package com.company;

public class Main {

    public static void main(String[] args) {

    }
    public static void printEmployee(Employee e) {
        System.out.println("Employee type: " + e.getClass().getSimpleName());
        System.out.println(e);
        System.out.println(e.grantStock());
    }
}
