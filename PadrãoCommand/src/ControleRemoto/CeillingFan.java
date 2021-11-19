package ControleRemoto;

public class CeillingFan {

    String tipo;
    int velocidade;

    public CeillingFan(String string) {
        this.tipo = string;
    }

    public void highSpeed() {
        System.out.println(tipo + " na velocidade Maxima");
        velocidade = 3;
    }

    public void mediumSpeed() {
        System.out.println(tipo + " na velocidade Media");
        velocidade = 2;
    }

    public void lowSpeed() {
        System.out.println(tipo + " na Velocidade Baixa");
        velocidade = 1;
    }

    public void getSpeed() {
        switch (velocidade) {
            case '3':
                System.out.println(tipo + " na velocidade Maxima");
                break;
            case '2':
                System.out.println(tipo + " na velocidade Media");
                break;
            case '1':
                System.out.println(tipo + " na velocidade Baixa");
                break;
            default:
                System.out.println(tipo + " desligado");
        }
    }

    public void off() {
        System.out.println(tipo + " Desligado");
    }

}
