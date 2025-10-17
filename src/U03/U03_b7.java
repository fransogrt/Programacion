package U03;
//7. Escribe un programa que calcule la potencia de un número real (a) elevado
//a un número entero (b). Tenga en cuenta que tanto a como b pueden valer 0
//o pueden ser números negativos.
import java.util.Scanner;

import java.lang.Math;


public class U03_b7 {
    public static void main(String[] args){
        double a,b;
        Scanner lec=new Scanner (System.in);
        a=lec.nextDouble();
        b=lec.nextDouble();
        a= Math.pow(a,b);

        System.out.printf("%f",a);

    }
}
