package U03.Ejemplos;
import java.util.InputMismatchException;
import java.util.Scanner;
public class U03_trycatch {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Introduce el dividendo: ");
            int dividendo = sc.nextInt();
            System.out.print("Introduce el divisor: ");
            int divisor = sc.nextInt();
            int resultado = dividendo / divisor;
            System.out.println("El resultado es: " + resultado);
        } catch (ArithmeticException e) {
// Esta excepción salta si intentamos dividir por cero
            System.out.println("Error: No se puede dividir por cero.");
        } catch (InputMismatchException e) {
// Esta excepción salta si el usuario introduce texto en lugar de un número
            System.out.println("Error: Debes introducir un número entero.");
        }
    }
}
