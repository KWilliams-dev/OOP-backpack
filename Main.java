import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;
        String input;

        int spcounter = 0;
        int wpcounter = 0;
        int hpcounter = 0;

        Backpack schoolpack = new Backpack("Schoolpack", 3, true);
        Backpack workpack = new Backpack("Workpack", 4, false);
        Backpack hikingpack = new Backpack("Hikingpack", 5, false);

        Items pencil = new Items("pencil");
        Items eraser = new Items("eraser");
        Items notebook = new Items("notebook");

        List<Items> items1 = new ArrayList<>();
        List<Items> items2 = new ArrayList<>();
        List<Items> items3 = new ArrayList<>();

        System.out.println("Would you like to add items to one of your backpacks?");
        answer = scan.next();

        while(answer.equalsIgnoreCase("yes")){
            System.out.println("Which bag would you like to add to?");
            String choice = scan.next();

            if(choice.equalsIgnoreCase("Schoolpack")) {

                System.out.println("Would you like to add a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items1.add(pencil);
                    spcounter += 1;
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items1.add(eraser);
                    spcounter += 1;
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items1.add(notebook);
                    spcounter += 1;
                }
                schoolpack.setItems(items1);
                schoolpack.setNumOfItems(spcounter);
            }

            if(choice.equalsIgnoreCase("Workpack")) {
                System.out.println("Would you like to add a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items2.add(pencil);
                    wpcounter += 1;
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items2.add(eraser);
                    wpcounter += 1;
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items2.add(notebook);
                    wpcounter += 1;
                }
                workpack.setItems(items2);
                workpack.setNumOfItems(wpcounter);
            }

            if(choice.equalsIgnoreCase("Hikingpack")) {
                System.out.println("Would you like to add a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items3.add(pencil);
                    hpcounter += 1;
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items3.add(eraser);
                    hpcounter += 1;
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items3.add(notebook);
                    hpcounter += 1;
                }
                hikingpack.setItems(items3);
                hikingpack.setNumOfItems(hpcounter);
            }
            System.out.println("Would you like to add another item?");
            answer = scan.next();
        }

        System.out.println("Would you like to remove an item?");
        input = scan.next();

        while(input.equalsIgnoreCase("yes")) {
            System.out.println("Which backpack would you like to remove the item from?");
            String choice1 = scan.next();

            if(choice1.equalsIgnoreCase("Schoolpack")) {
                System.out.println("Would you like to remove a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items1.remove(pencil);
                    spcounter -= 1;
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items1.remove(eraser);
                    spcounter -= 1;
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items1.remove(notebook);
                    spcounter -= 1;
                }
            }

            if(choice1.equalsIgnoreCase("Workpack")) {
                System.out.println("Would you like to remove a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items2.remove(pencil);
                    wpcounter -= 1;
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items2.remove(eraser);
                    wpcounter -= 1;
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items2.remove(notebook);
                    wpcounter -= 1;
                }
            }

            if(choice1.equalsIgnoreCase("Hikingpack")) {
                System.out.println("Would you like to remove a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items3.remove(pencil);
                    hpcounter -= 1;
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items3.remove(eraser);
                    hpcounter -= 1;
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items3.remove(notebook);
                    hpcounter -= 1;
                }
            }
            System.out.println("Would you like to remove another item?");
            input = scan.next();
        }

        System.out.println("Which backpack are you taking with you today?");
        String selection = scan.next();

        if(selection.equalsIgnoreCase("schoolpack")) {
            System.out.println("Ok you will be taking " + schoolpack.getBrand() + " backpack which has " + schoolpack.getItems() + ". Which = " + spcounter + " items.");
        } else if(selection.equalsIgnoreCase("workpack")) {
            System.out.println("Ok you will be taking " + workpack.getBrand() + " backpack which has " + workpack.getItems() + ". Which = " + wpcounter + " items.");
        } else if(selection.equalsIgnoreCase("hikingpack")) {
            System.out.println("Ok you will be taking " + hikingpack.getBrand() + " backpack which has " + hikingpack.getItems() + ". Which = " + hpcounter + " items.");
        }
    }
}

