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
public class Expresso extends Beverage{

    public Expresso(){
        description = "Café Espresso";
    }
    
    @Override
    public double cost() {
        double total = 0;
        
        total = 1.99;
        
        return total;
    }
    
}
