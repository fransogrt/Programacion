package U04;
//2.	Escribe un programa que calcule el área y la longitud de una circunferencia
// en función del radio (leído desde teclado). Se ha de escribir un metodo para calcular
//  el área y otro para la longitud. Las fórmulas del área y la longitud de una circunferencia:
//  A=pi * r2 y L=2*pi * r
import java.util.Scanner;
import java.lang.Math;
public class U04_2 {
    static final double pi=3.1415;
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce el radio: ");
        int r= scan.nextInt();
        Longitud(r);
        Area(r);

    }
    static void Longitud(int r){
        double longitud;
        longitud=2*pi*r;
        System.out.printf("La longitud es: %.2fcm%n", longitud);
    }
    static void Area(int r){
        double area;
        area=pi*Math.pow(r,2);
        System.out.printf("El area es: %.2fcm^2%n", area);
    }
}
