package ControleRemoto;

public class Stereo {

    String aparelho;
    int vol;

    public Stereo(String string) {
        this.aparelho = string;
    }

    public void on() {
        System.out.println(aparelho + " ligado");
    }

    public void off() {
        System.out.println(aparelho + " desligado");
    }

    public void setCD() {
        System.out.println(aparelho + " reproduzindo CD");
    }

    public void setDVD() {
        System.out.println(aparelho + " reproduzindo DVD");
    }

    public void setRadio() {
        System.out.println(aparelho + " na Radio");
    }

    public void setVolume(int vol) {
        if (this.vol < vol) {
            System.out.println("Aumentando volume de " + aparelho + "a " + vol);
        } else if (this.vol > vol) {
            System.out.println("Diminuindo volume de " + aparelho + "a " + vol);
        }
    }

}
