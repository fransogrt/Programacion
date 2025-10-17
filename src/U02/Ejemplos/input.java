package U02.Ejemplos;
import java.util.Scanner;
public class input {
    //1.-Importamos el fichero donde están las clases


    public static void main (String[] args) {
        int primerNum;
        //2.-Se declara el objeto lector de la clase Scanner
        Scanner lector = new Scanner(System.in);
        System.out.print("Escribe un número y pulsa retorn: ");
        //se lee un valor entero
        primerNum = lector.nextInt();
        System.out.print("El numero introducido es: "+primerNum);
        }
    }
