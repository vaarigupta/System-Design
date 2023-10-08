package com;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private List<Employee> employeeList = new ArrayList<Employee>();

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }

    public void printEmployeeDetails()
    {
        for(Employee emp : employeeList)
        {

            System.out.println("Emp Id : " + emp.getId());
            System.out.println("Emp Name : " +emp.getName());
            System.out.println("Emp Type : "+ emp.getEmpType());
            System.out.println("Salary : " +emp.getSalary());
            System.out.println();
        }
    }
}
