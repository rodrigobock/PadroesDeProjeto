/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package barcos;

import barcos.movimento.Movimentacao;

/**
 *
 * @author Rodrigo
 */
public class Barco {
    
    Movimentacao mov;
    
    public Barco(){
        
    }
    
    public void ToMove(){
        mov.movimento();
    }
    
}
