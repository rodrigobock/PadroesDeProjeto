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
public class ComCredito implements State {

    GumballMachine gumballMachine;

    public ComCredito(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InserirMoeda() {
        System.out.println("");
        System.out.println("Você já inseriu uma moeda.");
    }

    @Override
    public void EjetarMoeda() {
        System.out.println("Moeda ejetada.");
        gumballMachine.setState(gumballMachine.getSemCredito());
    }

    @Override
    public void VirarManivela() {
        System.out.println("Girando...");

        if (gumballMachine.getCountTimes() == 10) {
            gumballMachine.setState(gumballMachine.getVencedor());
        } else {
            gumballMachine.setState(gumballMachine.getVendido());
        }

    }

    @Override
    public void Entregar() {
        System.out.println("Nenhuma bolinha foi entregue");
    }

}
