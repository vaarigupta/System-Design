package com;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public  static  void main(String[] args)
    {
        Company company = new Company();
        List<Employee> employeeList = company.getEmployeeList();
        Employee e1 = new Employee(1,"Vaari",EmpType.FullTime,140);
        Employee e2 = new Employee(2,"Raavi",EmpType.Intern,120);
        Employee e3 = new Employee(3,"Rajat",EmpType.FullTime,130);
        Employee e4 = new Employee(4,"Surya",EmpType.PartTime,140);

        employeeList.add(e1);
        employeeList.add(e2);
        employeeList.add(e3);
        employeeList.add(e4);
        company.GetAllEmployeeDetails();


        System.out.println("Old Tax System : ");
        for(Employee emp : employeeList)
        {
            Tax tax = new Tax(emp);
            PrintTax printTax = new PrintTax(emp,tax);
            tax.CalculateTax();
            printTax.print();
        }

        System.out.println();
        System.out.println("New Tax System : ");
        for(Employee emp : employeeList)
        {
            Tax tax = new Tax(emp);
            PrintTax printTax = new PrintTax(emp,tax);
            tax.setTaxByEmpType(emp.getEmpType());
            tax.CalculateTax(emp.getEmpType());
            printTax.print();
        }
    }

}
