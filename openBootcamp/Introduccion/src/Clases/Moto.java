package Clases;

public class Moto extends Carro {
    private int cilindraje;

    public Moto(int id, String modelo, int nLlantas, Motor motor, int cilindraje) {
        super(id, modelo, nLlantas, motor);
        this.cilindraje = cilindraje;
    }

    public int getCilindraje() {
        return cilindraje;
    }

    public void setCilindraje(int cilindraje) {
        this.cilindraje = cilindraje;
    }

    public void drift(){
        System.out.println("ufff que drift");
    }
    
}
