import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        int num=1;
        String cadenas="",user;
        List<String> gente=new ArrayList<>();
        // instanciamos la clase Scanner - nombre de la clase - metodo constructor 
        Scanner leer=new Scanner(System.in);
        while(num==1){
            System.out.println("Digite un nombre");
            user = leer.nextLine();
            gente.add(user);
            gente.add(" ");
            System.out.println("Deseas seguir jugando 1 - Si - 2 - No");
            num = leer.nextInt();
        }
        System.out.println("tus datos son");
        for(int i=0; i<gente.size();i++){
            cadenas += gente.get(i);
        }
        System.out.println(cadenas);
        // limpiar la lista
        gente.clear();
        // limpiamos el buffer
        leer.close();
    }
}
