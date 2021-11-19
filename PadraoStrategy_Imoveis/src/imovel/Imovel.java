/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package imovel;

import imovel.valores.DefinirValorComportamento;

/**
 *
 * @author Rodrigo
 */
public class Imovel {
    
    int comodos;
    float espaco;
    char localizacao;

    DefinirValorComportamento defineValor;
    
    public Imovel(int comodos, float espaco, char localizacao) {
        this.comodos = comodos;
        this.espaco = espaco;
        this.localizacao = localizacao;
    }
    
    public void defineValor(){
        defineValor.definirValor(comodos, espaco, localizacao);
    }
        
}
