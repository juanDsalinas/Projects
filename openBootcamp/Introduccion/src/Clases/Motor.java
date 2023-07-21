package Clases;

public class Motor {
    private int caballosF;

    public Motor(){}

    public Motor(int caballosF) {
        this.caballosF = caballosF;
    }

    public int getCaballosF() {
        return caballosF;
    }

    public void setCaballosF(int caballosF) {
        this.caballosF = caballosF;
    }

    public void encender(){
        System.out.println("el motor esta encendido");
    }
}
