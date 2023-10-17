package Exeptions;
// Create a class Item with fields like id, name, and quantity.
//Create a class Inventory which holds a list of items.
//Implement methods for adding and removing items.
//Use custom exceptions to handle cases like "Item not found" or "Not enough items in stock."
public class Item {
    String name;
    int id;
    int quantity;

    public Item(String name, int id, int quantity) {
        this.name = name;
        this.id = id;
        this.quantity = quantity;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
