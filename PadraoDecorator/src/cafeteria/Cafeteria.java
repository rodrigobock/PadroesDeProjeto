/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria;

import cafeteria.condiments.Milk;
import cafeteria.condiments.Mocha;
import cafeteria.condiments.Soy;
import cafeteria.condiments.Whip;
import cafeteria.order.Beverage;
import cafeteria.order.DarkRoast;
import cafeteria.order.Decaf;
import cafeteria.order.Expresso;
import cafeteria.order.HouseBlend;

/**
 *
 * @author Rodrigo
 */
public class Cafeteria {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Beverage b1 = new Expresso();
        b1.setSize('G');
        b1 = new Milk(b1);
        System.out.println(b1.getDescription() + " $" + b1.cost());
        
        Beverage b2 = new DarkRoast();
        b2.setSize('M');
        b2 = new Mocha(b2);
        b2.setSize('P');
        b2 = new Mocha(b2);
        b2.setSize('G');
        b2 = new Whip(b2);
        System.out.println(b2.getDescription() + " $" + b2.cost());
        
        Beverage b3 = new HouseBlend();
        b3.setSize('G');
        b3 = new Soy(b3);
        b3.setSize('G');
        b3 = new Mocha(b3);
        b3.setSize('G');
        b3 = new Whip(b3);
        System.out.println(b3.getDescription() + " $" + b3.cost());
        
        Beverage b4 = new Decaf();
        b4.setSize('P');
        b4 = new Mocha(b4);
        b4.setSize('G');
        b4 = new Milk(b4);
        System.out.println(b4.getDescription() + " $" + b4.cost());
        
    }
    
    
}
