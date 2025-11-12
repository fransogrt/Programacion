package Repaso1.Ej3_tabla_multiplicar;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int numero = scan.nextInt();

        for(int i = 1; i <=10; i++)
            System.out.printf("%d x %d = %d%n", numero, i, numero*i);

    }
}
