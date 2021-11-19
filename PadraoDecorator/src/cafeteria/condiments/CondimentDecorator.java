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
public abstract class CondimentDecorator extends Beverage{
    
    public abstract String getDescription();
    
}
