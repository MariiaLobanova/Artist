package Exeptions;

import ArtistInterface.Artist;

import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Inventory inventory = new Inventory();

        Inventory<ElectronicsItem> electronicItem = new Inventory<>();
        electronicItem.addItem(new ElectronicsItem("Laptop", 12, 1, "Mac"));
        electronicItem.addItem(new ElectronicsItem("cellphone", 13, 5, "Philips"));
        electronicItem.addItem(new ElectronicsItem("player", 14, 10, "Sony"));

        Inventory<FoodItem> foodItem= new Inventory<>();
        foodItem.addItem(new FoodItem("cheese", 123,12, 8.99));
        foodItem.addItem(new FoodItem("chocolate", 124,23, 10.99));
        foodItem.addItem(new FoodItem("coffee", 125,2, 23.99));


        try{
            foodItem.remove(123,10);
            electronicItem.remove(12,1);

        } catch (ItemNotFoundException e){
            System.out.println("Error"+e.getMessage());
        } catch (InsufficientStockException e){
            System.out.println("Error"+ e.getMessage());
        }
        System.out.println("it is done!");

        System.out.println("Electronics list:");
        Inventory.printInventoryContents(electronicItem);

        System.out.println("Food list: ");
        Inventory.printInventoryContents(foodItem);
    }
}

