package Clases;

public class inicio {
    public static void main(String[] args) {
        Motor m=new Motor(2000);
        Carro c=new Carro(1, "gt990-x1", 4, m);   
        System.out.println(c);

        Moto m1=new Moto(1, "Suzuki", 2, m, 1200);
        m1.drift();
        m1.frenar();
        
    }

}
