package U04;
//6.	Escribe un método que acepte dos argumentos: el carácter que se desea imprimir
// y el número de veces que se imprime
import java.util.Scanner;
public class U04_6 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce un caracter y un numero de veces que quieres que se imprima: ");
        char c = scan.next().charAt(0);
        int a = scan.nextInt();
        imprimir(c,a);
    }
    static void imprimir(char c, int a){
        for(int i=0; i<a;i++)
            System.out.print(c);
    }
}
