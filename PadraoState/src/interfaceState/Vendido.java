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
public class Vendido implements State {

    GumballMachine gumballMachine;

    public Vendido(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InserirMoeda() {
        System.out.println("");
        System.out.println("Aguarde a maquina oferecer a bolinha.");
    }

    @Override
    public void EjetarMoeda() {
        System.out.println("A manivela já foi girada.");
    }

    @Override
    public void VirarManivela() {
        System.out.println("Girar novamente não dará outra bolinha.");
    }

    @Override
    public void Entregar() {
        gumballMachine.releaseBall();

        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getSemCredito());
        } else {
            gumballMachine.setState(gumballMachine.getEsgotado());
        }
    }

}
