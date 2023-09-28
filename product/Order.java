package product;

import java.util.Arrays;

public class Order {
    private int orderId;
    private Product[] products;
    private double totalPrice;

    public Order(int orderId, Product[] products, double totalPrice) {
        this.orderId = orderId;
        this.products = products;
        this.totalPrice = totalPrice;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String[] getProducts() {
        String[] productList = new String[products.length];
        for (int i = 0; i < this.products.length; i++) {
            productList[i] = products[i].name;
        }
        return productList;
    }

    public void setProducts(Product[] products) {
        this.products = products;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    public String generateInvoice() {
        return "Your Order ID: " + orderId + "\n" + "Your products: " + Arrays.toString(getProducts()) + "\n" + "Your total: " + getTotalPrice() + "€";
    }
}
