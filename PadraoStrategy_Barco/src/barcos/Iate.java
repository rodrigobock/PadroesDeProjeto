/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcos;

import barcos.movimento.MovMotor;

/**
 *
 * @author Rodrigo
 */
public class Iate extends Barco{
    
    public Iate(){
        mov = new MovMotor();
    }
    
}
