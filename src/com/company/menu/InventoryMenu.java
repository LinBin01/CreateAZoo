package com.company.menu;
import java.util.InputMismatchException;

public class InventoryMenu extends Menu{

    protected void manageInventory() {
        // add, view, or remove items
        System.out.println("\n1. Food" + "\n2. Souvenir" + "\n3. Back" + "\n4. Exit");

        try {
            switch (input.nextInt()) {
                case 1:
                    manageFood();
                    break;
                case 2:
                    manageSouvenir();
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
                    manageInventory();
                    break;

            }
        } catch (InputMismatchException exception) {
            System.out.println("Invalid Entry with Wrong Type! Please Try Again!");
            input.nextLine();
            manageInventory();
        }
    }

    private void manageFood() {

    }

    private void manageSouvenir() {

    }
}
