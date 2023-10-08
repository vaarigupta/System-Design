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

    public void GetAllEmployeeDetails()
    {
        for(Employee emp : employeeList)
        {
            PrintEmployeeDetails printEmployeeDetails = new PrintEmployeeDetails(emp);
            printEmployeeDetails.print();
        }
    }
}
