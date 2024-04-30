package com.blogapp12.blogapp;

public class Employee {

    private long id;
    private String name;
    private int salary;
    private String address;

    public Employee(long id, String name, int salary, String address) {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.address = address;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public int getSalary() {
        return salary;
    }

    public String getAddress() {
        return address;
    }
}
