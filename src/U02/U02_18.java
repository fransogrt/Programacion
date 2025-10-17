package U02;

import java.util.Scanner;
import java.lang.Math;

//18.- Escribe un programa que solicite al usuario el tamaño del lado de un triángulo equilátero y
//calcule su perímetro y su área.
public class U02_18 {
    public static void main(String[] args) {
        double lado,per,area;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce el tamanyo del lado: ");
        lado = sc.nextFloat();
        per=3*lado;
        area=(Math.sqrt(3)*(lado*lado))/4f;
        System.out.printf("\nEl perimetro es: %.2fcm\nEl area es: %.2fcm^2", per, area);
    }
}
