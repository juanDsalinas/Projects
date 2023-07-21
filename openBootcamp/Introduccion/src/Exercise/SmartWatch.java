package Exercise;

public class SmartWatch extends SmartDevice {
    private int bateria;
    private String modelo;

    public SmartWatch(){}

    public SmartWatch(int bateria, String modelo) {
        this.bateria = bateria;
        this.modelo = modelo;
    }

    public void encender() {
        System.out.println("Bienvenido a tu Smart Watch ");
        System.out.println("tus atributos son "+this.bateria+" "+this.modelo);
    }
    
}
