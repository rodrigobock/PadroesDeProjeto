/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imovel;

import imovel.valores.DefinirValorSemEdificacao;

/**
 *
 * @author Rodrigo
 */
public class Terreno extends Imovel{
    
    public Terreno(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        
        defineValor = new DefinirValorSemEdificacao();
        
    }
    
}
