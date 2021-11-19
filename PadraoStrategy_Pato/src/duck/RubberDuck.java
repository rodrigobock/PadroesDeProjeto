/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

import duck.Fly.FlyNoWay;
import duck.Fly.FlyWithWings;
import duck.Quack.MuteQuack;
import duck.Quack.Quack;

/**
 *
 * @author Rodrigo
 */
public class RubberDuck extends Duck{

    public RubberDuck(){
        quackBehavior = new MuteQuack();
        flyBehavior = new FlyNoWay();
    }
    
    public void display(){
        System.out.println("Eu sou o pato Rubber");      
    }
    
}
