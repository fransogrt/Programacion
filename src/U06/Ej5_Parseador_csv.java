package U06;
import java.util.Scanner;
public class Ej5_Parseador_csv {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Introduce tu nombre apellido ciudad edad en formato nombre;apellido;edad;ciudad: ");
        String input = scan.nextLine();

        String[] campos = input.split(";");
        System.out.println("Nombre: "+campos[0]);
        System.out.println("Apellido: "+campos[1]);
        System.out.println("Edad: "+campos[2]);
        System.out.println("Ciudad: "+campos[3]);
    }
}
