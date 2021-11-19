package ControleRemoto;

public class GarageUpCommand implements Command {

    GarageDoor portao;

    public GarageUpCommand(GarageDoor gDoor) {
        this.portao = gDoor;
    }

    @Override
    public void execute() {
        portao.up();
    }

}
