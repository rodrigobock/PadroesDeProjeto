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
public class Esgotado implements State {

    GumballMachine gumballMachine;

    public Esgotado(GumballMachine gumballMachine) {
        this.gumballMachine = gumballMachine;
    }

    @Override
    public void InserirMoeda() {
        System.out.println("");
        System.out.println("A maquina está sem estoque.");
    }

    @Override
    public void EjetarMoeda() {
        System.out.println("Você não inseriu moeda.");
    }

    @Override
    public void VirarManivela() {
        System.out.println("A maquina está vazia.");
    }

    @Override
    public void Entregar() {
        System.out.println("Nenhuma bolinha foi fornecida.");
    }

}
