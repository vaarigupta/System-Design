package com;

public class Tax implements  TaxInterface{

    private double professionalTax;
    private double educationCess;
    private double studyTax;
    private double GST;
    private double tax;
    Employee emp;

    Tax(Employee emp)
    {
        this.emp = emp;
        this.professionalTax = 0.2;
        this.educationCess = 0.03;
        this.studyTax = 0.02;
        this.GST = 0.05;
    }

    public double getTax() {
        return this.tax;
    }

    public void setTax(double tax) {
        this.tax = tax;
    }

    @Override
    public void CalculateTax() {
         this.tax =   0.2* emp.getSalary() + 0.03*emp.getSalary();
    }

    public void setTaxByEmpType(EmpType empType)
    {
        switch (empType)
        {
            case FullTime :
                this.professionalTax = 0.3;
                break;
            default:
                break;
        }
    }

    @Override
    public void CalculateTax(EmpType empType) {

        switch (empType)
        {
            case FullTime :
                this.tax = this.professionalTax* emp.getSalary() + this.educationCess*emp.getSalary() + this.studyTax* emp.getSalary();
                break;
            case Intern:
                this.tax = this.professionalTax* emp.getSalary() ;
                break;
            case PartTime:
                this.tax = this.professionalTax* emp.getSalary() + this.GST*emp.getSalary() + this.studyTax*emp.getSalary();
                break;
            default:
                break;
        }
    }

}

