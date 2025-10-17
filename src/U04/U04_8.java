package U04;
//8.	Escribe una método que acepte dos argumentos: el carácter que se desea imprimir
// y el número de líneas que se imprimen en forma triangular
import java.util.Scanner;
import java.lang.String;
public class U04_8 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un caracter y el numero de lineas a imprimir en triangular: ");
        char c = scan.next().charAt(0);
        int a = scan.nextInt();
        Imprimirtriangulo(c, a);
    }

    static void Imprimirtriangulo(char c, int a) {
        int b = 1, d=a;
        for (int i = 0; i < a; i++) {
            U04_6.imprimir(' ',d);
            U04_6.imprimir(c,b);
            b += 2;
            d--;
            System.out.println();
        }
    }
}