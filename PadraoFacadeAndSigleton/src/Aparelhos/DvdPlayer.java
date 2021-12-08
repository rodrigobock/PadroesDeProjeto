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
public class DvdPlayer{

    Amplificador amplificador;

    public void On() {
        System.out.println("O DVD está ligado");
    }

    public void Off() {
        System.out.println("O DVD está desligado");
    }
    
    public void Eject(){
        System.out.println("O aparelho está ejetando o DVD");
    }

    public void Pause(){
        System.out.println("O DVD está pausado");
    }
    
    public void Play(){
        System.out.println("O filme do DVD está sendo reproduzido");
    }
    
    public void setSurroundAudio(){
        System.out.println("Definido SurrondAudio");
    }
    
    public void setTwoChannelAudio(){
        System.out.println("Definido 2 canais de audio");
    }
    
    public void Stop(){
        System.out.println("A reprodução foi finalizada.");
    }
    
}
