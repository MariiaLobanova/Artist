package Exeptions;

public class FoodItem extends Item {

    private double price;

    public FoodItem(String name, int id, int quantity, double price) {
        super(name, id, quantity);
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
