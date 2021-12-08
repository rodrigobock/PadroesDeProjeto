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
public class Projetor {

    DvdPlayer dvd;

    public void On() {
        System.out.println("O projetor está ligado");
    }

    public void Off() {
        System.out.println("O projetor está desligado");
    }
    
    public void tvMode(){
        System.out.println("O projetor está no modo TV");
    }
    
    public void wideScreenMode(){
        System.out.println("O projetor está no modo WideScreen");
    }

    public DvdPlayer getDvd() {
        return dvd;
    }

    public void setDvd(DvdPlayer dvd) {
        this.dvd = dvd;
    }
    
}
