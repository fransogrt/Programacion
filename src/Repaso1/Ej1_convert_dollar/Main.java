package Repaso1.Ej1_convert_dollar;

import java.util.Scanner;

public class Main {
    public static final double DOLAR=1.153;
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el tipo de cambio (1 euro = cuantos dólares?): ");

        double euro = scan.nextInt();

       System.out.printf("%.2f euros son %.2f dólares.", euro, conversion(euro));



    }
    static double conversion(double euro){ return euro * DOLAR; }
}
