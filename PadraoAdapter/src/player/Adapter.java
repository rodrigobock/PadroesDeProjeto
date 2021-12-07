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
public class Adapter implements FormatoAudio{
    
    WmaPlay wma;

    public Adapter(WmaPlay wmaPlay){
        this.wma = wmaPlay;
    }
    
    @Override
    public void abrir(String filename) {
        wma.setFile(filename);
        this.reproduzir();
    }

    @Override
    public void reproduzir() {
        this.position(0);
        wma.open();
    }

    @Override
    public void parar() {
        wma.stop();
    }
    
    public void position(int position){
        wma.setLocation(position);
    }
    
}
