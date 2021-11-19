/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetopadraostate;

import interfaceState.GumballMachine;

/**
 *
 * @author Rodrigo
 */
public class TesteMaquina {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here

        GumballMachine MaqChiclete = new GumballMachine(1);

        MaqChiclete.insertQuarter();
        MaqChiclete.ejectQuarter();
        MaqChiclete.turnCrank();

//        int times = 10;
//
//        for (int i = 0; i < times; i++) {
//            MaqChiclete.insertQuarter();
//            MaqChiclete.turnCrank();
//        }
    }

}
