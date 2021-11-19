/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import duck.DecoyDuck;
import duck.Duck;
import duck.MallardDuck;
import duck.RedheadDuck;
import duck.RubberDuck;

/**
 *
 * @author Rodrigo
 */
public class AtividadePato{

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.performQuack();
        mallard.performFly();
        
        System.out.println("--------------------");
        
        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.performQuack();
        decoy.performFly();

        System.out.println("--------------------");
        
        Duck readhead = new RedheadDuck();
        readhead.display();
        readhead.performQuack();
        readhead.performFly();
        
        System.out.println("--------------------");
        
        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.performQuack();
        rubber.performFly();
        
    }
    
}
