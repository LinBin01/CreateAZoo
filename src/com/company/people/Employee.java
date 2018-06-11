package com.company.people;

public class Employee extends People {
    private int employeeNUmber;
    private String jobTitle;
    private String hireDay;
    private int Hours;

    public Employee(int age, String name, char gender, String race, int employeeNUmber, String jobTitle, String hireDay) {
        super(age, name, gender, race);
        this.employeeNUmber = employeeNUmber;
        this.jobTitle = jobTitle;
        this.hireDay = hireDay;
    }

    public int getEmployeeNUmber() {
        return employeeNUmber;
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
