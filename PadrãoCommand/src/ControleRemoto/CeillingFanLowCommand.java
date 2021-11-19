package ControleRemoto;

public class CeillingFanLowCommand implements Command {

    CeillingFan ventilador;

    public CeillingFanLowCommand(CeillingFan cFan) {
        this.ventilador = cFan;
    }

    @Override
    public void execute() {
        ventilador.lowSpeed();
    }

}
