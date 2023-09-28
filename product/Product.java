package product;

public class Product {
    String name;
    int price;
    String stock;

    public String getDetails() {
        return "Stock";
    }
    public void updateStock(String stock) {
this.stock = stock;
    }

}
