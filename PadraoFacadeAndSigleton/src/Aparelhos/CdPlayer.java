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
public class CdPlayer {

    Amplificador amplificador;

    public void On() {
        System.out.println("O CD está ligado");
    }

    public void Off() {
        System.out.println("O CD está desligado");
    }

    public void Eject() {
        System.out.println("O aparelho está ejetando o CD");
    }

    public void Pause() {
        System.out.println("O CD está pausado");
    }

    public void Play() {
        System.out.println("O CD está sendo reproduzido");
    }

    public void Stop() {
        System.out.println("A reprodução foi finalizada.");
    }

}
