package com;

public class Employee {

    private int id;
    private String name;
    private double salary;
    private EmpType empType;

    Employee(int id, String name, EmpType empType,double salary)
    {
        this.id = id;
        this.name = name;
        this.salary = salary;
        this.empType = empType;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public EmpType getEmpType() {
        return empType;
    }

    public void setEmpType(EmpType empType) {
        this.empType = empType;
    }
}
