/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcos;

import barcos.movimento.MovRemo;

/**
 *
 * @author Rodrigo
 */
public class Canoa extends Barco{
    
    public Canoa(){
        mov = new MovRemo();
    }
    
}
