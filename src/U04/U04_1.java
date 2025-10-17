package U04;
//1.	Escribe un metodo que devuelva la suma de dos enteros

import java.util.Scanner;
public class U04_1 {

    public static void main(String[] args){
        int a,b;
        Scanner scan= new Scanner(System.in);
        System.out.print("Introduce dos numeros: ");
        a = scan.nextInt();
        b = scan.nextInt();

        Suma(a,b);
    }
    static void Suma(int a, int b){
        int total;
        total=a+b;
        System.out.printf("La suma de los dos numeros es: %d", total);
    }
}
