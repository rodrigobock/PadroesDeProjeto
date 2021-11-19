/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package duck;

import duck.Fly.FlyBehavior;
import duck.Quack.QuackBehavior;

/**
 *
 * @author Rodrigo
 */
public abstract class Duck {
    
   FlyBehavior flyBehavior;
   QuackBehavior quackBehavior;
   
   public Duck(){
       
   }
   
   public void swin(){
        System.out.println("Estou nadando");
   }
   
   public abstract void display();
   
   
   public void performQuack(){
       quackBehavior.quack();
   }
       
   public void performFly(){
       flyBehavior.fly();
   }   
    
}
