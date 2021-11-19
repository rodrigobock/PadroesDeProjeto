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
public interface Observer {

    public void update(float temperatura, float umidade, float pressao);

    
}
