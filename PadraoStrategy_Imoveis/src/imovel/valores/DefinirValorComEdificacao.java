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
public class DefinirValorComEdificacao implements DefinirValorComportamento{
    
    public void definirValor(int comodos, float espaco, char localizacao){
     
        float total = 0;
        
        switch (localizacao) {
            case 'A':
                    total = (3000 * espaco) + (1000 * comodos);
                break;
            case 'B':
                    total = (1000 * espaco) + (1000 * comodos);
                break;
            case 'C':
                    total = (500 * espaco) + (1000 * comodos);
                break;
            default:
                break;
        }
       
        System.out.println("O custo total do IPTU na localização " + localizacao + " é de R$: " + total);
        
        
    }
    
}
