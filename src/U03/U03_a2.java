package U03;
//2. Escribe un programa que solicite la edad de una persona y muestre un
//mensaje por pantalla que indique si es mayor o menor que 25
import java.util.Scanner;
public class U03_a2 {
    public static void main(String[] args){
        int edad;
        Scanner lect = new Scanner (System.in);
        System.out.print("Introduce tu edad: ");
        edad = lect.nextInt();

        if(edad>25)
            System.out.print("Eres mayor de 25");
        else if(edad==25)
            System.out.print("Tienes 25 anyos");
        else
            System.out.print("Eres menor de 25");

    }
}
