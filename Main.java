import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String answer;

        List<Backpack> backpacks = new ArrayList<>();

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
            System.out.println("Which bag would you like to add too?");
            String choice = scan.next();

            if(choice.equalsIgnoreCase("Schoolpack")) {
                System.out.println("Would you like to add a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items1.add(pencil);
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items1.add(eraser);
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items1.add(notebook);
                }
                schoolpack.setItems(items1);
            }

            if(choice.equalsIgnoreCase("Workpack")) {
                System.out.println("Would you like to add a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items2.add(pencil);
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items2.add(eraser);
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items2.add(notebook);
                }
                workpack.setItems(items2);
            }

            if(choice.equalsIgnoreCase("Hikingpack")) {
                System.out.println("Would you like to add a pencil, eraser, or a notebook");
                String itemChoice = scan.next();
                if(itemChoice.equalsIgnoreCase("pencil")) {
                    items3.add(pencil);
                } else if(itemChoice.equalsIgnoreCase("eraser")){
                    items3.add(eraser);
                } else if(itemChoice.equalsIgnoreCase("notebook")) {
                    items3.add(notebook);
                }
                hikingpack.setItems(items3);
            }
            System.out.println("Would you like to add another item?");
            answer = scan.next();
        }

        System.out.println("Which backpack are you taking with you today?");
        String selection = scan.next();

        if(selection.equalsIgnoreCase("schoolpack")) {
            System.out.println("Ok you will be taking " + schoolpack.getBrand() + " backpack which has " + schoolpack.getItems());
        }
        if(selection.equalsIgnoreCase("workpack")) {
            System.out.println("Ok you will be taking " + workpack.getBrand() + " backpack which has " + workpack.getItems());
        }
        if(selection.equalsIgnoreCase("hikingpack")) {
            System.out.println("Ok you will be taking " + hikingpack.getBrand() + " backpack which has " + hikingpack.getItems());
        }

    }
}
