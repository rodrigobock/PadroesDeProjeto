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
public class DarkRoast extends Beverage{

    public DarkRoast(){
        description = "Café Extra Forte";
    }
    
    @Override
    public double cost() {        
        double total = 0;
        
        total = 0.99;
        
        return total;
    }
  
}
