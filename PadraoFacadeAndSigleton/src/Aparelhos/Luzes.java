/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aparelhos;

/**
 *
 * @author Rodrigo
 */
public class Luzes {

    public void On() {
        System.out.println("As luzes estão ligadas");
    }

    public void Off() {
        System.out.println("As luzes estão desligadas");
    }
    
    public void dim(int value){
        System.out.println("A iluminação está em " +value+ "%");
    }

}
