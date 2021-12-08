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
public class Radio {

    Amplificador amplificador;
        
    public void On() {
        System.out.println("O rádio está ligado");
    }

    public void Off() {
        System.out.println("O rádio está desligado");
    }

    public void setAM() {
        System.out.println("O rádio está na estação AM");
    }

    public void setFM() {
        System.out.println("O rádio está na estação FM");
    }
    
    public void setFrequency(double frequency){
       System.out.println("O rádio está na frequencia " + frequency); 
    }

}
