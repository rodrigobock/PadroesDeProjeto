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
public class Vencedor implements State {

    GumballMachine gumballMachine;

    public Vencedor(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InserirMoeda() {
        System.out.println("");
        System.out.println("Aguarde enquanto a maquina oferece uma bolinha.");
    }

    @Override
    public void EjetarMoeda() {
        System.out.println("Você já acionou a alavanca.");
        gumballMachine.setState(gumballMachine.getSemCredito());
    }

    @Override
    public void VirarManivela() {
        System.out.println("Acionar a alavanca novamente não fornecerá outra bolinha.");
        gumballMachine.setState(gumballMachine.getVendido());
    }

    @Override
    public void Entregar() {
        System.out.println("Pegue seu chicletes");

        gumballMachine.releaseBall();

        if (gumballMachine.getCount() > 0) {
            gumballMachine.setState(gumballMachine.getSemCredito());
        } else {
            gumballMachine.setState(gumballMachine.getEsgotado());
        }
    }

}
