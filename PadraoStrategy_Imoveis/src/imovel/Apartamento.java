/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imovel;

import imovel.valores.DefinirValorComEdificacao;

/**
 *
 * @author Rodrigo
 */
public class Apartamento extends Imovel{
    
    public Apartamento(int comodos, float espaco, char localizacao) {
        super(comodos, espaco, localizacao);
        
        defineValor = new DefinirValorComEdificacao();
    }
    
}
