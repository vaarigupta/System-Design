package com;

public class PrintTax implements  Print{
    Employee emp;
    Tax tax;
    PrintTax(Employee emp, Tax tax)
    {
        this.emp = emp;
        this.tax = tax;
    }


    @Override
    public void print() {
        System.out.println(emp.getId() + " : Salary :- " + emp.getSalary()+ " | Tax :- " + tax);
    }
}
