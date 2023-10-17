package Exeptions;

public class ElectronicsItem extends Item {

    private String brand;
    public ElectronicsItem(String name, int id, int quantity, String brand ) {
        super(name, id, quantity);


    }
    public String getBrand() {
        return brand;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }
}
