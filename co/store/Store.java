package co.store;

import product.Order;
import product.Product;

import java.util.ArrayList;
import java.util.List;

public class Store {
    List<Product> products = new ArrayList<>();
    List<Order> orders = new ArrayList<>();

    void addProduct(Product product) {
        products.add(product);
    }

    void processOrder(Order order){
        orders.add(order);
    }


}
