package ControleRemoto;

public class Main {

    public static void main(String[] args) {

        RemoteControl controle = new RemoteControl();

        Light LuzSala = new Light("Luz da sala");
        
        Stereo stereo = new Stereo("Som da area de festa");

        CeillingFan teto = new CeillingFan("Ventilador");
        GarageDoor pGaragem = new GarageDoor();

        LightOnCommand luzSalaLiga = new LightOnCommand(LuzSala);
        LightOffCommand luzSalaDesliga = new LightOffCommand(LuzSala);

        CeillingFanHighCommand TetoMax = new CeillingFanHighCommand(teto);
        CeillingFanMediumCommand TetoMed = new CeillingFanMediumCommand(teto);
        
        CeillingFanLowCommand TetoMin = new CeillingFanLowCommand(teto);
        CeillingFanOffCommand TetoDesliga = new CeillingFanOffCommand(teto);

        GarageUpCommand garagemSobe = new GarageUpCommand(pGaragem);
        GarageDownCommand garagemDesce = new GarageDownCommand(pGaragem);

        StereoOnWithCDCommand stereoLigaComCD = new StereoOnWithCDCommand(stereo);
        StereoOnWithDVDCommand stereoLigaComDVD = new StereoOnWithDVDCommand(stereo);
        StereoOnWithRadioCommand stereoLigaComRadio = new StereoOnWithRadioCommand(stereo);
        StereoOffCommand stereoDesliga = new StereoOffCommand(stereo);
        
        controle.setCommand(0, luzSalaLiga, luzSalaDesliga);
        controle.setCommand(1, TetoMax, TetoDesliga);
        controle.setCommand(2, TetoMed, TetoDesliga);
        controle.setCommand(3, TetoMin, TetoDesliga);
        controle.setCommand(4, stereoLigaComCD, stereoDesliga);
        controle.setCommand(5, stereoLigaComDVD, stereoDesliga);
        controle.setCommand(6, stereoLigaComRadio, stereoDesliga);

        System.out.println(controle);

        controle.onButtonWasPushed(0);
        controle.offButtonWasPushed(0);
        controle.onButtonWasPushed(3);
        controle.onButtonWasPushed(2);
        controle.onButtonWasPushed(1);
        controle.offButtonWasPushed(3);
        controle.onButtonWasPushed(4);

    }

}
