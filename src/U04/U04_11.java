package U04;
//11.	Escríbase un método que dados 4 números enteros pasados como parámetros,
// compruebe si dicha secuencia de números es capicúa.
import java.util.Scanner;

public class U04_11 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce 4 numeros para comprobar si son capicua: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();

        capicua(a,b,c,d);
    }
    static void capicua(int a,int b,int c,int d){
        System.out.print(a%11==0 ? "El numero "+a+" es capicua\n" : "El numero "+a+" no es capicua\n");
        System.out.print(b%11==0 ? "El numero "+b+" es capicua\n" : "El numero "+b+" no es capicua\n");
        System.out.print(c%11==0 ? "El numero "+c+" es capicua\n" : "El numero "+c+" no es capicua\n");
        System.out.print(d%11==0 ? "El numero "+d+" es capicua\n" : "El numero "+d+" no es capicua\n");
    }
}
