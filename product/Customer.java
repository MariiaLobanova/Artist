package product;

public class Customer {

    private String nameProduct;

    public Customer(String nameProduct) {
        this.nameProduct = nameProduct;
    }

    public void addToCart(String customer) {
        System.out.println("Added " + nameProduct + " to" +customer+ " cart.");
    }

    public static void main(String[] args) {


        Customer customer1 = new Customer("Elena");
        customer1.addToCart("Item1");
        System.out.println("Hello from Elena!");
    }
}