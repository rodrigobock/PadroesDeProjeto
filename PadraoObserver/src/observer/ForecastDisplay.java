/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

/**
 *
 * @author Rodrigo
 */
public class ForecastDisplay implements Observer, DisplayElement {

    float temperatura, umidade, pressao;

    public ForecastDisplay() {

    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    @Override
    public void display() {
        System.out.println("Temperatura: " + temperatura);
        System.out.println("Umidade: " + umidade);
        System.out.println("Pressão: " + pressao);
    }

}
