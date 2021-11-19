package ControleRemoto;

public class Light {

    String Luz_Local;

    public Light(String string) {
        this.Luz_Local = string;
    }

    public void on() {
        System.out.println(Luz_Local + " acessa");
    }

    public void off() {
        System.out.println(Luz_Local + " desligada");
    }
}
