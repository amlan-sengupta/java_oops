import java.util.Scanner;

public class Main {
    private static Scanner scanner=new Scanner(System.in);
    private static Places places=new Places();
    public static void main(String[] args) {
        printInstructions();
        boolean quit=false;
        int choice=0;
        while(!quit){
            System.out.println("Enter choie:");
            choice=scanner.nextInt();
            scanner.nextLine();
            switch (choice){
                case 0:
                    printInstructions();
                    break;
                case 1:
                    places.printList();
                    break;
                case 2:
                    addPlaces();
                    break;
                case 3:
                    removePlaces();
                    break;
                case 4:
                    visitPrevious();
                    break;
                case 5:
                    visitNext();
                    break;
                case 6:
                    System.out.println("Exiting from list");
                    quit=true;
                    break;
            }
        }
    }
    private static void printInstructions(){
        System.out.println("\nPress ");
        System.out.println("\t 0 - To print choice options.");
        System.out.println("\t 1 - To print the list of places.");
        System.out.println("\t 2 - To add a place to the list.");
        System.out.println("\t 3 - To remove the place.");
        System.out.println("\t 4 - To visit prev place.");
        System.out.println("\t 5 - To visit next place.");

        System.out.println("\t 6 - To quit the place.");
    }

    private static void addPlaces(){
        System.out.println("Enter the place to add:");
        String name=scanner.nextLine();
        places.addPlaces(name);
    }
    private static void removePlaces(){
        System.out.println("Enter the name of the place to be removed:");
        String name=scanner.nextLine();
        places.removePlaces(name);
    }

    private static void visitPrevious(){
        System.out.println("Enter the current location:");
        String name=scanner.nextLine();
        System.out.println("We are going back:");
        System.out.println(places.visitPrev(name));
    }
    private static void visitNext(){
        System.out.println("Enter the current location:");
        String name=scanner.nextLine();
        System.out.println("We are going forward:");
        System.out.println( places.visitNext(name));
    }
}
