package com.company.menu;

import java.util.InputMismatchException;

public class AnimalsMenu extends Menu {

    protected void manageAnimals() {
        // add, view, or remove animals
        System.out.println("\n1. Rabbit" + "\n2. Lion" + "\n3. Rhino" + "\n4. Penguin" + "\n5. Back" + "\n5. Exit");
        try {
            switch (input.nextInt()) {
                case 1:
                    // addRabbit();
                    System.out.println("Rabbit");
                    break;

                case 2:
                    // addLion();
                    System.out.println("Lion");
                    break;

                case 3:
                    // addRhino();
                    System.out.println("Rhino");
                    break;

                case 4:
                    // addPenguin();
                    System.out.println("Penguin");

                case 5:
                    Menu mainMenu = new Menu();
                    mainMenu.mainMenu();
                    break;

                case 6:
                    System.out.println("Thank You!");
                    System.exit(0);
                    break;

                default:
                    System.out.println("Invalid Input! Please Try Again!");
                    manageAnimals();
                    break;

            }
        } catch (InputMismatchException exception) {

            System.out.println("Invalid Entry with Wrong Type! Please Try Again!");
            input.nextLine();
            manageAnimals();
        }
    }
}
