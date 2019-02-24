/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_version_3;

/**
 *
 * @author trido
 */
public class Information {
    private String name;
    private String phoneNumber;
    private String address;
    private String billingAddress;
    private double total;
    
    public Information(String name, String phoneNumber, double total){
        this(name, phoneNumber, total, null, null);
    }
    
    public Information(String name, String phoneNumber, double total, String address){
        this(name, phoneNumber, total, address, null);
    }
    
    public Information(String name, String phoneNumber, double total, String address, String billingAddress){
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.total = total;
        this.address = address;
        this.billingAddress = billingAddress;
    }
    
    public String getName(){
        return name;
    }
    
    public String getPhoneNumber(){
        return phoneNumber;
    }
    
    public String getAddress(){
        return address;
    }
    
    public String getBillingAddress(){
        return billingAddress;
    }
    
    public double getTotal(){
        return total;
    }
}
