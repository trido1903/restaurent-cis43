/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_version_3;

import java.text.DecimalFormat;
import java.util.ArrayList;

/**
 *
 * @author trido
 */
public class Order extends Item{
    private ArrayList<Item> itemArr;
    
    public Order(String name, double price, int quantity){
        super(name, price, quantity);
        itemArr = new ArrayList<Item>();
    }

    
    public double calTotal(){
        return super.getPrice() * super.getQuantity();
    }
    
    public void addItem(Item item){
        itemArr.add(item);
    }
    
    
    
    public String printAllItems(){
        DecimalFormat df = new DecimalFormat("0.00##");
        String string = "";
        for(int i = 0; i < itemArr.size(); i++){
            string += String.format("  %-10s%17s%18s\n",itemArr.get(i).getName(),itemArr.get(i).getQuantity(),itemArr.get(i).getPrice());
            
        }
        return string;
    }
    
    public double subTotal(){
        double subTotal = 0;
        for(int i = 0; i < itemArr.size(); i++){
            subTotal += itemArr.get(i).getPrice();
            
        }
        return subTotal;
    }
    
    // clear all the data
    public void clearData(){
        this.itemArr.clear();
    }
    
    // Cannot pass back the data 
    public ArrayList getAllItems(){
        return this.itemArr;
    }
    
    
}
