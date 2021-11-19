/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cafeteria.condiments;

import cafeteria.order.Beverage;

/**
 *
 * @author Rodrigo
 */
public class Whip extends CondimentDecorator {

    Beverage beverage;

    public Whip(Beverage beverage) {
        this.beverage = beverage;
    }


    @Override
    public double cost() {

        double total = 0;

        switch (beverage.getSize()) {
            case 'P':
                total = 0.10 + beverage.cost();
                break;
            case 'M':
                total = 0.15 + beverage.cost();
                break;
            case 'G':
                total = 0.20 + beverage.cost();
                break;
            default:
                break;
        }

        return total;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription() + ", Whip";
    }

}
