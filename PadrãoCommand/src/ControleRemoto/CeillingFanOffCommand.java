package ControleRemoto;

public class CeillingFanOffCommand implements Command {

    CeillingFan ventilador;

    public CeillingFanOffCommand(CeillingFan cFan) {
        this.ventilador = cFan;
    }

    @Override
    public void execute() {
        ventilador.off();
    }

}
