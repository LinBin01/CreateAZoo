package com.company.people;

import java.util.ArrayList;
import java.util.List;

public class Employee extends People {
    private int employeeNumber;
    private String jobTitle;
    private String hireDay;
    private int Hours;

    protected List<Employee> employees = new ArrayList<>();

    public Employee() {

    }

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

    public void addEmployee(Employee object) {
        employees.add(object);
        System.out.println(object.getName() + " has been added");
    }

    public void removeEmployee(int employeeNumber) {
        int index = -1;
        for (int i = 0; i < employees.size(); i++) {
            if (employeeNumber == employees.get(i).getEmployeeNUmber()) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println(employees.get(index).getName() + " has been removed");
            employees.remove(index);
        } else {
            System.out.println("No Records With Associated EmployeeNumber!");
        }
    }

    public void viewEmployees() {
        for (int i = 0; i < employees.size(); i++) {
            System.out.println("EmployeeNumber: " + employees.get(i).getEmployeeNUmber() + "; " + "Name: " + employees.get(i).getName() + "; "
                    + "Age: " + employees.get(i).getAge() + "; " + "Gender: " + employees.get(i).getGender() + "; " + "JobTitle: " + employees.get(i).getJobTitle() + "; " + "Race: " + employees.get(i).getRace() + "; "
                    + "HireDay: " + employees.get(i).getHireDay());
        }
    }


}
