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
public class ThirdyPartyDisplay implements Observer, DisplayElement {

    float temperatura, umidade, pressao;

    public ThirdyPartyDisplay() {

    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {
        this.pressao = pressao;
        this.temperatura = temperatura;
        this.umidade = umidade;
    }

    @Override
    public void display() {

        if (temperatura > 30 && umidade > 50) {
            System.out.println("Dia quente com possibilidade de chuva à noite");
        }
        if(pressao > 40){
            System.out.println("Ar muito seco, tome agua");
        }
        if(temperatura <= 10){
            System.out.println("Vai nevar");
        }

    }

}
