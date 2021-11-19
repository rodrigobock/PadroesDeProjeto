/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package observer;

import subject.Subject;

/**
 *
 * @author Rodrigo
 */
public class StatisticDisplay implements Observer, DisplayElement {

    private Subject subject;
    private float temperaturaMax, temperaturaMed;
    private float umidadeMax, umidadeMed;
    private float pressaoMax, pressaoMed;
    
    float temperaturaMin = 100;
    float umidadeMin = 100;
    float pressaoMin = 100;
    
    public StatisticDisplay(Subject subject) {

        this.subject = subject;
        this.subject.addObserver(this);
    }

    public StatisticDisplay() {
        
    }

    @Override
    public void update(float temperatura, float umidade, float pressao) {

        if (this.pressaoMax < pressao) {
            this.pressaoMax = pressao;
        } else if (this.pressaoMin > pressao) {
            this.pressaoMin = pressao;
        }

        if (this.temperaturaMax < temperatura) {
            this.temperaturaMax = temperatura;
        } else if (this.temperaturaMin > temperatura) {
            this.temperaturaMin = temperatura;
        }

        if (this.umidadeMax < umidade) {
            this.umidadeMax = umidade;
        } else if (this.umidadeMin > umidade) {
            this.umidadeMin = umidade;
        }
        
        this.pressaoMed = (this.pressaoMax + this.pressaoMin) / 2;
        this.temperaturaMed = (this.temperaturaMax + this.temperaturaMin) / 2;
        this.umidadeMed = (this.umidadeMax + this.umidadeMin) / 2;

    }

    @Override
    public void display() {
        System.out.println("Temperatura:");
        System.out.println("    Temperatura Max: " + temperaturaMax);
        System.out.println("    Temperatura Min: " + temperaturaMin);
        System.out.println("    Temperatura Med: " + temperaturaMed);
        System.out.println("");
        System.out.println("Umidade:");
        System.out.println("    Umidade Max: " + umidadeMax);
        System.out.println("    Umidade Min: " + umidadeMin);
        System.out.println("    Umidade Med: " + umidadeMed);
        System.out.println("");
        System.out.println("Pressão:");
        System.out.println("    Pressão Max: " + pressaoMax);
        System.out.println("    Pressão Min: " + pressaoMin);
        System.out.println("    Pressão Med: " + pressaoMed);
        
    }

}
