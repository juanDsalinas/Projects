package Exercise;

public class SmartPhone extends SmartDevice{
    private int bateria;
    private String nombre;
    private String modelo;

    public SmartPhone(){}

    public SmartPhone(int bateria, String nombre, String modelo) {
        this.bateria = bateria;
        this.nombre = nombre;
        this.modelo = modelo;
    }

    public void encender(){
        System.out.println("Bienvenido a tu Smart Phone");
        System.out.println("tu atributos son "+ this.bateria+" "+this.modelo+" "+this.nombre);
    }


}
