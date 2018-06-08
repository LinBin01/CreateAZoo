package com.company;
import jdk.internal.util.xml.impl.Input;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    private Scanner input = new Scanner(System.in);

    public void mainMenu(){

        System.out.println("Please choose an option: " + "\n1. Manage People" + "\n2. Manage Animals" + "\n3. Manage Inventory" + "\nOr type something else to exit");

        // Handles UserInput

        try {
            switch (input.nextInt()) {

                case 1:
                    managePeople();
                    break;

                case 2:
                    manageAnimals();
                    break;

                case 3:
                    manageInventory();
                    break;

                default:
                    // handles wrong number
                    // allow user to try again
                    System.out.println("Not Valid Entry! Please Try Again!");
                    mainMenu();
                    break;

            }
        }catch(InputMismatchException exception){
            input.nextLine();
            System.out.println("Invalid Entry! Please Try Again!");
            mainMenu();
        }
    }

    public void managePeople(){
        // add, view, or remove people
        System.out.println("\n1. Employees" + "\n2. Visitors");
            switch(input.next()) {
                case "1":
                    manageEmployees();
                    break;
            }
    }

    public void manageAnimals(){
        // add, view, or remove animals
        System.out.println("\nR. Rabbit" + "\nL. Lion" + "\nR. Rhino" + "\nP. Penguin");
        switch(input.next()){
            case "R":
                System.out.println("rabbit");
                break;
        }
    }

    public void manageInventory(){
        // add, view, or remove items
        System.out.println("\n1. Food" + "\n2. Souvenir");
    }

    public void manageEmployees(){
        System.out.println("\n1. to Add" + "\n2. to View" + "\n3. to Remove");
        switch(input.next()){
            case "1":
                System.out.println("add");
                break;
            case "2":
                System.out.println("view");
                break;
            case "3":
                System.out.println("remove");
                break;
            default:
                System.out.println("??");
                break;
        }
    }



}
