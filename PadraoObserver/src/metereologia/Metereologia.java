/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package metereologia;

import observer.CurrentConditionsDisplay;
import observer.ForecastDisplay;
import observer.StatisticDisplay;
import observer.ThirdyPartyDisplay;
import subject.WheatherData;

/**
 *
 * @author Rodrigo
 */
public class Metereologia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        WheatherData wd = new WheatherData();
        
        ForecastDisplay fs = new ForecastDisplay();
        CurrentConditionsDisplay ccd = new CurrentConditionsDisplay();
        StatisticDisplay sd = new StatisticDisplay();
        ThirdyPartyDisplay tpd = new ThirdyPartyDisplay();
        
        wd.addObserver(fs);
        wd.addObserver(ccd);
        wd.addObserver(sd);
        wd.addObserver(tpd);
        
        wd.setMedicoes(87, 47, 14.4f);
        wd.setMedicoes(90, 20, 1.1f);
        wd.setMedicoes(14, 60, 94.8f);
        
        fs.display();
        ccd.display();
        sd.display();
        tpd.display();

    }

}
