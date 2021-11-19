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
public class GumballMachine {

    State esgotado;
    State semCredito;
    State comCredito;
    State vendido;
    State vencedor;

    State state;
    int count = 0;
    int countTimes = 0;

    public GumballMachine(int numberGumballs) {

        esgotado = new Esgotado(this);
        semCredito = new SemCredito(this);
        comCredito = new ComCredito(this);
        vendido = new Vendido(this);
        vencedor = new Vencedor(this);

        this.count = numberGumballs;

        if (numberGumballs > 0) {
            state = semCredito;
        } else {
            state = esgotado;
        }

    }

    public void insertQuarter() {

        if (countTimes > 10) {
            countTimes = 0;
        }

        state.InserirMoeda();
        countTimes++;
    }

    public void ejectQuarter() {
        state.EjetarMoeda();
    }

    public void turnCrank() {
        state.VirarManivela();
        state.Entregar();
    }

    void releaseBall() {
        if (getCountTimes() == 10) {
            System.out.println("Você foi premiado e recebeu 2 bolinhas!!!");
            if (count != 0) {
                count = count - 2;
            }
        } else {
            System.out.println("Pegue seu chicletes");
            if (count != 0) {
                count = count - 1;
            }
        }

        System.out.println("Bolinhas restantes: " + getCount());

    }

    public State getEsgotado() {
        return esgotado;
    }

    public void setEsgotado(State esgotado) {
        this.esgotado = esgotado;
    }

    public State getSemCredito() {
        return semCredito;
    }

    public void setSemCredito(State semCredito) {
        this.semCredito = semCredito;
    }

    public State getComCredito() {
        return comCredito;
    }

    public void setComCredito(State comCredito) {
        this.comCredito = comCredito;
    }

    public State getVendido() {
        return vendido;
    }

    public void setVendido(State vendido) {
        this.vendido = vendido;
    }

    public State getVencedor() {
        return vencedor;
    }

    public void setVencedor(State vencedor) {
        this.vencedor = vencedor;
    }

    public State getState() {
        return state;
    }

    public void setState(State state) {
        this.state = state;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCountTimes() {
        return countTimes;
    }

    public void setCountTimes(int countTimes) {
        this.countTimes = countTimes;
    }

}
