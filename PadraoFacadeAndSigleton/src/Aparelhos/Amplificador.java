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
public class Amplificador{
    
    // Variaveis
    
    Radio radio = new Radio();
    DvdPlayer dvd = new DvdPlayer();
    CdPlayer cd = new CdPlayer();
    
    // Metodos
    
    public void On(){
        System.out.println("O amplificador está ligado");
    }
    
    public void Off(){
        System.out.println("O amplificador está desligado");
    }
    
    public void setCd(){
        System.out.println("O CD foi selecionado");
        cd.On();
    }
    
    public void setDvd(){
        System.out.println("O DVD foi selecionado");
        dvd.On();
    }
    
    public void setStereoAudio(){
        System.out.println("Audio stereo selecionado");
    }
    
    public void setSurroundSound(){
        System.out.println("Audio Surround selecionado");
    }
    
    public void setRadio(){
        System.out.println("Radio selecionado");
        radio.On();
    }
    
    public void volume(int vol){
        System.out.println("Volume ajustado para " + vol);
    }
    
}
