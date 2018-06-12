package com.company.menu;

//import com.company.people.*;
//import com.company.inventory.*;
//import com.company.animals.*;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Menu {

    protected  Scanner input = new Scanner(System.in);

    public void mainMenu(){

        System.out.println("Please choose an option: " + "\n1. Manage People" + "\n2. Manage Animals" + "\n3. Manage Inventory" + "\nOr '4' to exit");

        // Handles UserInput

        try {
            switch (input.nextInt()) {

                case 1:
                    PeopleMenu myPeople = new PeopleMenu();
                    myPeople.managePeople();
                    break;

                case 2:
                    AnimalsMenu myAnimals = new AnimalsMenu();
                    myAnimals.manageAnimals();
                    break;

                case 3:
                    InventoryMenu myInventory = new InventoryMenu();
                    myInventory.manageInventory();;
                    break;
                case 4:
                    System.out.println("Thank You!");
                    System.exit(0);
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


}
