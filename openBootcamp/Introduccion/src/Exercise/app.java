package Exercise;
public class app {
    public static void main(String[] args) {
        SmartPhone s=new SmartPhone(80, "Xiaomi", "RT-500");
        SmartWatch w=new SmartWatch(100, "apple RT-X");
        w.encender();
        s.encender();
    }
}
