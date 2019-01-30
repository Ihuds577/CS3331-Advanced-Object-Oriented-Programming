package pricewatcher.pricewatcherUI;
import pricewatcher.pricewatcherModel.*;
import java.util.Scanner;
public class Main{
    public static void main(String [] args){
        run();
    }
    public static void run(){
        Item testitem = new Item("Gameboy", 75.5, "wwww.Google.com");
        int selectionChoice = 1;
        Scanner scanner = new Scanner(System.in);
        while(selectionChoice == 1){
            System.out.println("Welcome to PriceWatcher: Penis\n");
            System.out.println("Name:\t"+testitem.title);
            System.out.println("URL:\t"+testitem.url);
            System.out.println("Price:\t"+testitem.currentPrice);
            double change = (testitem.startPrice / testitem.currentPrice) * 100;
            System.out.printf("Change:\t%.2f percent\n", change);
            System.out.println("Added:\t"+testitem.dateAdded.toString()+"\n");
            System.out.println("Enter 1 to check price or anything else to quit.");
            String selectionChoicetemp = scanner.nextLine();
            if(selectionChoicetemp.compareTo("1") == 0){
                selectionChoice = 1;
            } 
            else{
                selectionChoice = -1;
            }
            if(selectionChoice == 1){
                updateItemPrice(testitem);
            }
        }
        scanner.close();
    }

    public static void updateItemPrice(Item item){
        double currentPrice = item.getcurrentPrice();
        double newPrice = Math.floor(((Math.random() * currentPrice) + currentPrice) * 100) / 100;
        item.updatePrice(newPrice);
    }
}