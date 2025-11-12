package Repaso1.Ej5_triangle_numbers;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int numero = scan.nextInt();

        imprimirFilas(numero);
    }
    static void imprimirFilas(int numero){
        int valor=1;
        for (int i = 1; i<=numero;i++){
            for (int j = 1;j<=i; j++){
                System.out.print(valor);
                System.out.print(" ");
                valor++;
            }
            System.out.println();
        }
    }
}
