package Repaso1.Ej4_numero_primo;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el primer número del rango: ");
        int primero = scan.nextInt();
        System.out.print("Introduce el segundo número del rango: ");
        int segundo = scan.nextInt();


        System.out.print("Los números primos en el rango 10-50 son: ");
        comprobarPrimo(primero, segundo);

        scan.close();
    }
    static void comprobarPrimo(int primero, int segundo){
        int primo=0;
        StringBuilder cadena = new StringBuilder();
        for(int i = primero; i<=segundo;i++){
            for(int j = 1; j<=segundo;j++){
                if(i%j==0)
                    primo++;

            }

            if(primo==2)
                cadena.append(i).append(", ");
            primo=0;
        }
        cadena = new StringBuilder(cadena.substring(0, cadena.length() - 2) + cadena.substring(cadena.length() - 2).replace(",", ""));
        System.out.print(cadena.toString());
    }
}
