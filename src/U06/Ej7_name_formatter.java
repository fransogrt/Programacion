package U06;
//Enunciado: Pide al usuario su nombre completo (ej: " juan pérez garcía ").
// El programa debe devolver el nombre formateado: "Juan Pérez García".

// Pistas: trim() (para limpiar), toLowerCase(), split(" ") (para separar por palabras),
// y luego recorrer el array de palabras usando substring(0, 1).toUpperCase() en cada una y StringBuilder para unirlas de nuevo.
import java.util.Scanner;
public class Ej7_name_formatter {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        StringBuilder nombreCorregido = new StringBuilder();
        String nombre = scan.nextLine();
        nombre = nombre.trim().toLowerCase();
        String[] nombrePartido = nombre.split(" ");
        for(int i = 0; i<nombrePartido.length; i++){
            nombrePartido[i] = nombrePartido[i].substring(0,1).toUpperCase() + nombrePartido[i].substring(1);
            nombreCorregido.append(nombrePartido[i]).append(" ");
        }
        System.out.println("El nombre formateado: "+ nombreCorregido.toString());
    }
}
