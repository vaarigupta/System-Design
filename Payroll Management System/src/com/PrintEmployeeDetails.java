package com;

public class PrintEmployeeDetails implements  Print{

    Employee emp;
    PrintEmployeeDetails(Employee emp)
    {
        this.emp = emp;
    }
    @Override
    public void print() {
        System.out.println("Emp Id : " + emp.getId());
        System.out.println("Emp Name : " +emp.getName());
        System.out.println("Emp Type : "+ emp.getEmpType());
        System.out.println("Salary : " +emp.getSalary());
        System.out.println();
    }
}
