package ControleRemoto;

public class GarageDownCommand implements Command {

    GarageDoor portao;

    public GarageDownCommand(GarageDoor gDoor) {
        this.portao = gDoor;
    }

    @Override
    public void execute() {
        portao.off();
    }

}
