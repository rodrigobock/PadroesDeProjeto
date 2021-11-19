/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

import duck.Fly.FlyWithWings;
import duck.Quack.Squeak;

/**
 *
 * @author Rodrigo
 */
public class DecoyDuck extends Duck{   
    
    public DecoyDuck(){
        quackBehavior = new Squeak();
        flyBehavior = new FlyWithWings();
    }
    
    public void display(){
        System.out.println("Eu sou o pato Decoy");      
    }

}
