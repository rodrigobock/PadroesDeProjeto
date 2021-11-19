/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imovel.valores;

/**
 *
 * @author Rodrigo
 */
public class DefinirValorSemEdificacao implements DefinirValorComportamento{
    
    
    public void definirValor(int comodos, float espaco, char localizacao){
     
        float total = 0;
        
        switch (localizacao) {
            case 'A':
                    total = 1500 * espaco;
                break;
            case 'B':
                    total = 750 * espaco;
                break;
            case 'C':
                    total = 200 * espaco;
                break;
            default:
                break;
        }
       
               System.out.println("O custo total do IPTU na localização " + localizacao + " é de R$ " + total);
        
        
    }
    
    
}
