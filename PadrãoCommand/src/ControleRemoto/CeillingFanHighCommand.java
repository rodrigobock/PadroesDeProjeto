package ControleRemoto;

public class CeillingFanHighCommand implements Command {

    CeillingFan ventilador;

    public CeillingFanHighCommand(CeillingFan cFan) {
        this.ventilador = cFan;
    }

    @Override
    public void execute() {
        ventilador.highSpeed();
    }

}
