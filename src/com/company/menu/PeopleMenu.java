package com.company.menu;

import com.company.people.*;

import java.util.InputMismatchException;

public class PeopleMenu extends Menu {
    private Employee allEmployees = new Employee();
    private Visitor allVisitors = new Visitor();

    protected void managePeople() {
        // add, view, or remove people
        System.out.println("\n1. Employees" + "\n2. Visitors" + "\n3. Back" + "\n4. Exit");
        try {
            switch (input.nextInt()) {
                case 1:
                    manageEmployee();
                    break;
                case 2:
                    manageVisitor();
                    break;
                case 3:
                    Menu mainMenu = new Menu();
                    mainMenu.mainMenu();
                    break;
                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Entry! Please Try Again!");
                    managePeople();
                    break;
            }
        } catch (InputMismatchException exception) {
            input.nextLine();
            System.out.println("Invalid Entry with Wrong Type! Please Try Again!");
            managePeople();
        }
    }

    private void manageVisitor() {
        System.out.println("\nVisitors:" + "\n1. to Add" + "\n2. to View" + "\n3. to Remove" + "\n4. to Edit" + "\n5. Back" + "\n6. Exit");
        try {
            switch (input.nextInt()) {
                case 1:
                    // add
                    addVisitor();
                    break;
                case 2:
                    // view
                    viewVisitor();
                    break;
                case 3:
                    // remove
                    removeVisitor();
                    break;
                case 4:
                    // Edit
                    editVisitor();
                    break;
                case 5:
                    // back
                    managePeople();
                    break;
                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Entry! Please Try Again!");
                    manageVisitor();
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entry with Wrong Type! Please Try Again!");
            input.nextLine();
            manageVisitor();
        }
    }

    public void manageEmployee() {
        System.out.println("\nEmployees:" + "\n1. to Add" + "\n2. to View" + "\n3. to Remove" + "\n4. to Edit" + "\n5. Back" + "\n6. Exit");
        try {
            switch (input.nextInt()) {
                case 1:
                    // add
                    addEmployee();
                    break;
                case 2:
                    // view
                    viewEmployee();
                    break;
                case 3:
                    // remove
                    removeEmployee();
                    break;
                case 4:
                    // edit
                    editEmployee();
                    break;
                case 5:
                    // back
                    managePeople();
                    break;
                case 6:
                    // exit
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid Entry! Please Try Again!");
                    manageEmployee();
                    break;
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entry with Wrong Type! Please Try Again!");
            input.nextLine();
            manageEmployee();
        }
    }

    // TODO finish
    private void editEmployee() {

    }


    private void addEmployee() {
        System.out.println("Please enter: age, name, gender, race, employeeNumber, jobTitle, and hireDay");
        try {
            System.out.println("Age?");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Name?");
            String name = input.nextLine();
            System.out.println("Gender?");
            char gender = input.nextLine().charAt(0);
            System.out.println("Race?");
            String race = input.nextLine();
            System.out.println("employeeNumber?");
            int employeeNumber = input.nextInt();
            input.nextLine();
            System.out.println("What is your job?");
            String jobTitle = input.nextLine();
            System.out.println("Hire Day?");
            String hireDay = input.nextLine();
            Employee newEmploy = new Employee(age, name, gender, race, employeeNumber, jobTitle, hireDay);
            allEmployees.addEmployee(newEmploy);
            System.out.println("Type '1' to add another employee or '2' to move back to last menu, or '3' to go back to the main menu , or any other number to terminate");
            switch (input.nextInt()) {
                case 1:
                    addEmployee();
                    break;
                case 2:
                    manageEmployee();
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.exit(0);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entries! Please retype your information and make sure it is in correct type!");
            input.nextLine();
            addEmployee();
        }
    }

    private void viewEmployee() {
        allEmployees.viewEmployees();
        System.out.println("Type '1' to return to the previous menu, or '2' to view this list again; Type '3' to return to the main menu, or any other numbers to exit the program");
        try {
            switch (input.nextInt()) {
                case 1:
                    manageEmployee();
                    break;
                case 2:
                    viewEmployee();
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.exit(0);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Number of Entry! The program automatically returns to the previous menu");
            manageEmployee();
        }
    }


    private void removeEmployee() {
        System.out.println("Please Enter the EmployeeNumber associated With the Employee You Want to Remove");
        try {
            allEmployees.removeEmployee(input.nextInt());
            System.out.println("Type '1' to remove other employee, or any other numbers to return to the previous menu");
            switch (input.nextInt()) {
                case 1:
                    removeEmployee();
                    break;
                default:
                    manageEmployee();
                    break;

            }

        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entry! Please Try Again!");
            input.nextLine();
            removeEmployee();
        }
    }

    // TODO finish
    private void editVisitor() {

    }

    private void removeVisitor() {
        System.out.println("Please Enter the Name associated With the Visitor You Want to Remove");
        try {
            allVisitors.removeVisitor(input.nextLine());
            System.out.println("Type '1' to remove other visitor, or any other numbers to return to the previous menu");
            switch (input.nextInt()) {
                case 1:
                    removeVisitor();
                    break;
                default:
                    manageVisitor();
                    break;

            }

        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entry! Please Try Again!");
            input.nextLine();
            removeVisitor();
        }
    }

    private void viewVisitor() {
        allVisitors.viewVisitors();
        System.out.println("Type '1' to return to the previous menu, or '2' to view this list again; Type '3' to return to the main menu, or any other numbers to exit the program");
        try {
            switch (input.nextInt()) {
                case 1:
                    manageVisitor();
                    break;
                case 2:
                    viewVisitor();
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.exit(0);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Number of Entry! The program automatically returns to the previous menu");
            manageVisitor();
        }

    }

    private void addVisitor() {
        System.out.println("Please enter: age, name, gender, race, groupSize, membership, and homeAddress");
        try {
            System.out.println("Age?");
            int age = input.nextInt();
            input.nextLine();
            System.out.println("Name?");
            String name = input.nextLine();
            System.out.println("Gender?");
            char gender = input.nextLine().charAt(0);
            System.out.println("Race?");
            String race = input.nextLine();
            System.out.println("GroupSize?");
            int groupSize = input.nextInt();
            System.out.println("Do you have membership?");
            boolean membership = input.nextBoolean();
            System.out.println("Your Address?");
            input.nextLine();
            String homeAddress = input.nextLine();
            Visitor newVisit = new Visitor(age, name, gender, race, groupSize, membership, homeAddress);
            allVisitors.addVisitor(newVisit);
            System.out.println("Type '1' to add another visitor or '2' to move back to last menu, or '3' to go back to the main menu , or any other number to terminate");
            switch (input.nextInt()) {
                case 1:
                    addVisitor();
                    break;
                case 2:
                    manageVisitor();
                    break;
                case 3:
                    mainMenu();
                    break;
                default:
                    System.exit(0);
            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entries! Please retype your information and make sure it is in correct type!");
            input.nextLine();
            addVisitor();
        }
    }
}
