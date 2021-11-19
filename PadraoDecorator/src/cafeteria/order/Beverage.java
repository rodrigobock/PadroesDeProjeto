/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.order;

/**
 *
 * @author Rodrigo
 */
public abstract class Beverage {

    String description = "Bebida desconhecida";
    char size;
 
    public String getDescription(){
        return description;
    }

    public char getSize() {
        return size;
    }

    public void setSize(char size) {
        this.size = size;
    }
       
    public abstract double cost();
    
}
