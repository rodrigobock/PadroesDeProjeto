/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraofacadeandsigleton;

import Aparelhos.Amplificador;
import Aparelhos.CdPlayer;
import Aparelhos.DvdPlayer;
import Aparelhos.Luzes;
import Aparelhos.Pipoqueira;
import Aparelhos.Projetor;
import Aparelhos.Radio;
import Aparelhos.Tela;

/**
 *
 * @author Rodrigo
 */
public class HomeTheaterFacade {
    
    // Variaveis
    
    Pipoqueira pipoqueira = new Pipoqueira();
    Luzes luzes = new Luzes();
    Tela tela = new Tela();
    Projetor projetor = new Projetor();
    DvdPlayer dvd = new DvdPlayer();
    CdPlayer cd = new CdPlayer();
    Amplificador amplificador = new Amplificador();
    Radio radio = new Radio();
    
    // Singleton
    
    private static HomeTheaterFacade uniqueInstance;
    
    HomeTheaterFacade(){
        
    }
    
    public static HomeTheaterFacade getInstance(){
        if(uniqueInstance == null)
            uniqueInstance = new HomeTheaterFacade();
        return uniqueInstance;
    }
    
    // Metodos
    
    public void watchMovie(){
        System.out.println("O filme já vai começar.");
        pipoqueira.On();
        pipoqueira.Pop();
        luzes.dim(10);
        tela.down();
        projetor.On();
        projetor.wideScreenMode();
        amplificador.On();
        amplificador.setSurroundSound();
        amplificador.volume(5);
        dvd.On();
        dvd.Play();
    }
    
    public void endMovie(){
        pipoqueira.Off();
        luzes.On();
        tela.up();
        projetor.Off();
        amplificador.Off();
        dvd.Stop();
        dvd.Eject();
        dvd.Off();
    }
    
    public void listenToCD(){
        luzes.dim(50);
        cd.On();
        cd.Play();
        amplificador.On();
        amplificador.setStereoAudio();
        amplificador.volume(10);
    }
    
    public void endCD(){
        luzes.On();
        cd.Stop();
        cd.Eject();
        cd.Off();
        amplificador.Off();
    }
    
    public void listenToRadio(){
        radio.On();
        radio.setFM();
        radio.setFrequency(97.5);
        amplificador.On();
        amplificador.setStereoAudio();
        amplificador.volume(6);
    }
    
    public void endRadio(){
        radio.Off();
        amplificador.Off();
    }
    
}
