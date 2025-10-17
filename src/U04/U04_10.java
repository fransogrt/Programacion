package U04;
//10.	Escribe un método que acepte un entero y calcule su factorial n!

import java.util.Scanner;
import java.lang.Object;
public class U04_10 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce un entero: ");
        int a= scan.nextInt();

        int factorial = factorial(a);
        System.out.printf("El factorial de %d es %d", a ,factorial);
    }
    static int factorial(int n){
        int num=1;
        for (int i=2;i<=n;i++)
            num=num*i;
        return num;
    }
}
