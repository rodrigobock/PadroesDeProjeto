/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import subject.WheatherData;

/**
 *
 * @author Rodrigo
 */
public class CurrentConditionsDisplay implements Observer, DisplayElement {

    float temperatura, umidade, pressao;

    public CurrentConditionsDisplay() {

    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.temperatura = temperatura;
        this.pressao = pressao;
        this.umidade = umidade;
    }

    @Override
    public void display() {
        System.out.println("Agora fazem " + temperatura + " graus, com pressao atmosferica igual a " + pressao + " e umidade igual a " + umidade);
    }

}
