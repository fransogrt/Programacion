package U03;
//1. Escribe un programa que solicite la edad de una persona y muestre un
//mensaje por pantalla indicando si es mayor de edad o no

import java.util.Scanner;
public class U03_a1 {
    public static void main(String[] args){
        int edad;
        Scanner lect = new Scanner (System.in);
        System.out.print("Introduce tu edad: ");
        edad = lect.nextInt();

        if(edad>=18)
            System.out.print("Eres mayor de edad");
        else
            System.out.print("Eres menor de edad");

    }
}
