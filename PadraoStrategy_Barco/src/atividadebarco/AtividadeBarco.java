/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadebarco;

import barcos.Barco;
import barcos.BarcoVela;
import barcos.Bateira;
import barcos.Canoa;
import barcos.Iate;
import barcos.Jangada;

/**
 *
 * @author Rodrigo
 */
public class AtividadeBarco {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Possuem motor: ");
        
        Barco iate = new Iate();
        iate.ToMove();
        
        Barco bateira = new Bateira();
        bateira.ToMove();
        
        System.out.println("");
        System.out.println("Possuem remos: ");
        
        Barco canoa = new Canoa();
        canoa.ToMove();
        
        Barco jangada = new Jangada();
        jangada.ToMove();
        
        System.out.println("");
        System.out.println("Possuem vela: ");
        
        Barco vela = new BarcoVela();
        vela.ToMove();
        

        
        
        
    }
    
}
