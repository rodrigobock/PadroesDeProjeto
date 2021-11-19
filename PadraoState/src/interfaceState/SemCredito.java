/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfaceState;

/**
 *
 * @author Rodrigo
 */
public class SemCredito implements State {

    GumballMachine gumballMachine;

    public SemCredito(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InserirMoeda() {
        System.out.println("");
        System.out.println("Você inseriu uma moeda.");
        gumballMachine.setState(gumballMachine.getComCredito());
    }

    @Override
    public void EjetarMoeda() {
        System.out.println("Você não inseriu nenhuma moeda.");
    }

    @Override
    public void VirarManivela() {
        System.out.println("Você girou a manivela mas não inseriu nenhuma moeda.");
    }

    @Override
    public void Entregar() {
        System.out.println("Você girou a manivela mas não inseriu nenhuma moeda.");
    }

}
