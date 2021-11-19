/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package subject;

import java.util.ArrayList;
import java.util.List;
import observer.CurrentConditionsDisplay;
import observer.ForecastDisplay;
import observer.Observer;
import observer.StatisticDisplay;

/**
 *
 * @author Rodrigo
 */
public class WheatherData extends CurrentConditionsDisplay implements Subject {

    List<Observer> observers;

    float temperatura;
    float umidade;
    float pressao;

    public WheatherData() {

        observers = new ArrayList<>();
  /*      
        ForecastDisplay f = new ForecastDisplay();
        StatisticDisplay s = new StatisticDisplay();
        CurrentConditionsDisplay c = new CurrentConditionsDisplay();
        
        //observers.add(1, f);
        //observers.add(2, s);
        //observers.add(3, c);
  */      
    }

    public void setMedicoes(float temperatura, float umidade, float pressao) {

        this.temperatura = temperatura;
        this.umidade = umidade;
        this.pressao = pressao;

        notifyObservers();
    }

    @Override
    public void addObserver(Observer observer) {
        observers.add(observer);
    }

    @Override
    public void removeObserver(Observer observer) {

        int index = observers.indexOf(observer);

        if (index > -1) {

            observers.remove(observer);
        }
    }

    @Override
    public void notifyObservers() {

        for (Observer o : observers) {

            o.update(temperatura, umidade, pressao);
        }
    }

    public float getTemperature() {
        return this.temperatura;
    }

    ;
    public float getHumidity() {
        return this.umidade;
    }

    ;
    public float getPreassure() {
        return this.pressao;
    }

    ;
    
    public boolean measurementsChanged() {
        
        return false;
        
    }
;
}
