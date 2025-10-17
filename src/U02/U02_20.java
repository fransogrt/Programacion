package U02;
//20.- Realiza un programa para solicitar al usuario dos números y muestra en pantalla las
//operaciones básicas de estos dos numero (suma, resta , multiplicación , division y resto de la
//división entera.

import java.util.Scanner;
public class U02_20 {
    public static void main(String[] args){
        double a,b,suma,resta,mult,div,resto;
        Scanner scan = new Scanner (System.in);
        System.out.print("Introduce el primer numero: ");
        a = scan.nextDouble();
        System.out.print("Introduce el segundo numero: ");
        b = scan.nextDouble();

        suma=a+b;
        resta=a-b;
        mult=a*b;
        div=a/b;
        resto=a%b;
        System.out.println("La suma de "+a+" + "+b+" es: "+suma);
        System.out.println("La resta de "+a+" - "+b+" es: "+resta);
        System.out.println("La producto de "+a+" * "+b+" es: "+mult);
        System.out.println("La division de "+a+" entre "+b+" es: "+div);
        System.out.println("El resto entero de "+a+" y "+b+" es: "+resto);

    }
}
