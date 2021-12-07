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
public class Wav implements FormatoAudio{

    @Override
    public void abrir(String filename) {
        System.out.println("Aberto arquivo wav: " + filename);
        this.reproduzir();
    }

    @Override
    public void reproduzir() {
        System.out.println("Tocando musica...");
    }

    @Override
    public void parar() {
        System.out.println("Reprodução interrompida.");
    }
    
}
