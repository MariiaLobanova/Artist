package Exeptions;

import java.util.ArrayList;
import java.util.List;

public class Inventory<T extends Item> {

    private List<Item>items;
    public Inventory(){
        items= new ArrayList<>();
    }

    public void addItem(Item item){
        items.add(item);
    }
    public void removeItem(Item item){
      items.remove(item);
    }
    public void remove(int id, int quantity)  throws ItemNotFoundException, InsufficientStockException{
        Item foundItem = null;
        for(Item item : items){
            if(id == item.getId()){
                foundItem = item;
                break;
            }
        }
        if (foundItem==null){
            throw  new ItemNotFoundException("Item not found");
        }
        if (foundItem.getQuantity()<quantity){
            throw new InsufficientStockException("Not enough items in stock"+ foundItem.getName());
        }
    }
    public List<T> getallItems() {
        return (List<T>) items;
    }
    public static <T extends Item> void printInventoryContents(Inventory<T>inventory){
        List <T> items = inventory.getallItems();
        for (T item: items){
            System.out.println("Name: "+ item.getName()+"; id: "+item.getId()+"; Quantity:  "+item.getQuantity());
        }
    }
}


