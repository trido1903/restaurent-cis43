/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package final_version_3;

import java.util.ArrayList;

/**
 *
 * @author trido
 */
public class ContainInformation {
    private ArrayList<Information> information;
    
    public ContainInformation(){
        information = new ArrayList<Information>();
    }
    
    
    public boolean addInformation(Information information){
        this.information.add(information);
        return true;

    }
    
    // Clear information when the user finish the transaction
    public void clearInformation(){
        information.clear();
    }
    
    
    public Information printInformation(){ 
        for(int i = 0; i < this.information.size(); i++){
            Information informationObj = this.information.get(i);
            return informationObj;
        }
        return null;
    }
}
