package Repaso2.Ej1_basic_methods;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();

        CalculadoraSimple.imprimirSuma(a,b);

        System.out.println("Metodo sumar: "+CalculadoraSimple.sumar(a,b));
    }
}
