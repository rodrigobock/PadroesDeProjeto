package ControleRemoto;

public class CeillingFanMediumCommand implements Command {

    CeillingFan ventilador;

    public CeillingFanMediumCommand(CeillingFan cFan) {
        this.ventilador = cFan;
    }

    @Override
    public void execute() {
        ventilador.mediumSpeed();
    }

}
