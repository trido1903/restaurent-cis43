package final_version_3;

/**
 *
 * @author trido
 */
public class Item {
    private int quantity;
    private String name;
    private double price;
    
    
    public Item(String name, double price, int quantity){
        this.name = name;
        this.price = price;
        this.quantity = quantity;
    }
    
    
    public void setName(String name){
        this.name = name;
    }
    
    public void setPrice(double price){
        this.price = price;
    }
    
    public void setQuantity(int quantity){
        this.quantity = quantity;
    }
    
    public int getQuantity(){
        return quantity;
    }
    
    public String getName(){
        return name;
    }
    
    public double getPrice(){
        return price;
    }
    public static Item createItem(String name, double price, int quantity){
        return new Item(name, price, quantity);
    }
    
}
