package Clases;

public class Carro {
    private int id;
    private String modelo;
    private int nLlantas;
    Motor motor;

    public  Carro(){}

    public Carro(int id, String modelo, int nLlantas, Motor motor) {
        this.id = id;
        this.modelo = modelo;
        this.nLlantas = nLlantas;
        this.motor = motor;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getnLlantas() {
        return nLlantas;
    }

    public void setnLlantas(int nLlantas) {
        this.nLlantas = nLlantas;
    }

    public Motor getMotor() {
        return motor;
    }

    public void setMotor(Motor motor) {
        this.motor = motor;
    }

    public void frenar(){
        System.out.println("frenaste");
    }
}
