package ControleRemoto;

public class StereoOnWithDVDCommand implements Command {

    Stereo stereo;

    public StereoOnWithDVDCommand(Stereo stereo) {
        this.stereo = stereo;
    }

    @Override
    public void execute() {
        stereo.setDVD();
    }

}
