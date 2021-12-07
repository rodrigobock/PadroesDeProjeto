/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package player;

/**
 *
 * @author Rodrigo
 */
public class WmaPlay {

    public void setFile(String file) {
        System.out.println("O arquivo " +file+ " foi selecionado no formato wma");
    }

    public void open() {
        System.out.println("Abrindo musica...");
        this.play();
    }

    public void setLocation(int position) {
        System.out.println("Esta musica começou a partir do momento " + position);
    }

    public void play() {
        System.out.println("Reproduzindo música.");
    }

    public void stop() {
        System.out.println("Musica parada.");
    }
}
