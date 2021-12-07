/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoadapter;

import player.Adapter;
import player.Mp3;
import player.Wav;
import player.WmaPlay;

/**
 *
 * @author Rodrigo
 */
public class AudioPlayer {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        Mp3 mp3 = new Mp3();
        Wav wav = new Wav();
        WmaPlay wma = new WmaPlay();
        Adapter adpt = new Adapter(wma);

        mp3.abrir("We are the champions");
        mp3.parar();

        System.out.println("------------");

        wav.abrir("48 horas de vaneirão");
        wav.parar();

        System.out.println("------------");

        adpt.abrir("Bily Jeam");
        adpt.parar();
    }

}
