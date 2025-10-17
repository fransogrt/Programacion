package U02.Ejemplos;
import java.util.Scanner;
public class Ejemploscaner {
    public static void main(String[] args){
        int entero;
        double real;
        boolean siOno;
        char caracter;
        String texto;

        Scanner lector = new Scanner(System.in);

        System.out.print("Introduce un entero: ");
        entero= lector.nextInt();
        System.out.println("El entero introducido es: "+ entero);

        System.out.print("Introduce un real: ");
        real= lector.nextDouble();
        System.out.println("El real introducido es: "+ real);

        System.out.print("Introduce si o no: ");
        siOno = lector.nextBoolean();
        System.out.println("El Boolean introducido es: "+ siOno);

        System.out.print("Introduce un caracter: ");
        caracter= lector.nextLine().charAt(0);
        System.out.println("El caracter introducido es: "+ caracter);

        System.out.print("Introduce un string: ");
        texto = lector.nextLine();
        System.out.println("El string introducido es: "+ texto);

    }
}
