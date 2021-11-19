/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package atividadeimoveis;

import imovel.Apartamento;
import imovel.Casa;
import imovel.Imovel;
import imovel.Terreno;

/**
 *
 * @author Rodrigo
 */
public class AtividadeImoveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Apartamentos: ");
        
        Imovel apto = new Apartamento(5, 50, 'A');
        apto.defineValor();
        
        Imovel apto1 = new Apartamento(5, 50, 'B');
        apto1.defineValor();
        
        Imovel apto2 = new Apartamento(5, 50, 'C');
        apto2.defineValor();    
        
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Casas:");
        
        Imovel casa = new Casa(6, 45, 'A');
        casa.defineValor();
        
        Imovel casa1 = new Casa(6, 45, 'B');
        casa1.defineValor();
        
        Imovel casa2 = new Casa(6, 45, 'C');
        casa2.defineValor();
        
        System.out.println("-----------------------------");
        System.out.println("");
        System.out.println("Terrenos:");
        
        Imovel terreno = new Terreno(0, 300, 'A');
        terreno.defineValor();
        
        Imovel terreno1 = new Terreno(0, 300, 'B');
        terreno1.defineValor();
        
        Imovel terreno2 = new Terreno(0, 300, 'C');
        terreno2.defineValor();
        
    }
    
}
