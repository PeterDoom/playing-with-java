package arraysAndLists;

import java.util.Scanner;

public class GroceryListMain {
    private static Scanner scanner = new Scanner(System.in);
    private static GroceryList groceryList = new GroceryList();


    public static void main(String[] args) {
        boolean quit = false;
        int choice = 0;
        printInstructions();

        while (!quit) {
            System.out.println("Enter your choice: ");
            choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 0:
                    printInstructions();
                    break;
                case 1:
                    groceryList.printGroceryList();
                    break;
                case 2:
                    addItem();
                    break;
                case 3:
                    modifyItem();
                    break;
                case 4:
                    removeItem();
                    break;
                case 5:
                    searchForItem();
                    break;
                case 6:
                    quit = true;
                    break;
            }
        }
    }

    public static void printInstructions() {
        System.out.println("\nPress ");
        System.out.println("0 - to print");
        System.out.println("1 - to print items");
        System.out.println("2 - to add");
        System.out.println("3 - to modify");
        System.out.println("4 - to remove");
        System.out.println("5 - to search");
        System.out.println("6 - to quit");
    }

    public static void addItem() {
        System.out.print("Please enter the grocery item: ");
        groceryList.addGroceryItem(scanner.nextLine());
    }

    public static void modifyItem() {
        System.out.print("Enter item: ");
        String itemNumber = scanner.nextLine();
        System.out.print("Enter replacement item: ");
        String newItem = scanner.nextLine();
        groceryList.modifyGroceryItem(itemNumber,newItem);
    }

    public static void removeItem(){
        System.out.print("Enter number here: ");
        String item = scanner.nextLine();
        groceryList.removeGroceryItem(item);
    }

    public static void searchForItem(){
        System.out.print("Give your search here: ");
        String searchWord = scanner.nextLine();
        boolean item = groceryList.onFile(searchWord);
        if(item) {
            System.out.println("Found: " + searchWord + " in our grocery list");
        } else {
            System.out.print("Item not in here");
        }
    }
}
