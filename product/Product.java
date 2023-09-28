package product;

public class Product {
    String name;
    int price;
    int stock;

    public Product(String name, int price, int stock) {
        this.name = name;
        this.price = price;
        this.stock = stock;
    }

    public String getDetails() {
        String result = String.format("Name: %s\nPrice: %s\nStock: %s\n", name, price, stock);
        return result;
    }
    public void updateStock(int count) {
        if (count < 0) {
            if (stock + count < 0) {
                System.out.println("Sorry. We don't have this amount in our stock");
            }
        }
        else {
            this.stock += count;
            System.out.println("Stock" + stock);

        }
    }
}
