package U03;
//. Escriba un programa en el que se solicite un número entero al usuario y el
//programa escribirá un mensaje por pantalla que indique si se trata de un
//número par o de un número impar
import java.util.Scanner;
public class U03_a3 {
    public static void main(String[] args){
        int numero;
        Scanner lect = new Scanner (System.in);
        System.out.print("Introduce tu numero: ");
        numero = lect.nextInt();

        if(numero%2==0)
            System.out.print("Tu numero es par");
        else
            System.out.print("Tu numero es impar");

    }
}
