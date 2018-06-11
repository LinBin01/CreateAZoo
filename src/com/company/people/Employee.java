package com.company.people;
import java.util.ArrayList;
import java.util.List;

public class Employee extends People {
    private int employeeNumber;
    private String jobTitle;
    private String hireDay;
    private int Hours;

    protected List<Employee> employees = new ArrayList<>();

    public Employee(int age, String name, char gender, String race, int employeeNumber, String jobTitle, String hireDay) {
        super(age, name, gender, race);
        this.employeeNumber = employeeNumber;
        this.jobTitle = jobTitle;
        this.hireDay = hireDay;
    }

    public int getEmployeeNUmber() {
        return employeeNumber;
    }

    public String getJobTitle() {
        return jobTitle;
    }

    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    public String getHireDay() {
        return hireDay;
    }

    public int getHours() {
        return Hours;
    }

    public void setHours(int hours) {
        Hours = hours;
    }

    @Override
    public void infoPeople(){}

}
