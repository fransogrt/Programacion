package U04;

import java.util.Scanner;
public class U04_5 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce tres numeros para averiguar el mayor: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        int d = scan.nextInt();
        Mayorque(a,b,c,d);
    }

    static void Mayorque(int a, int b, int c, int d){
        if(a>b && a>c && a>d)
            System.out.printf("%d es mayor que %d, %d y %d",a, c, d, b);
        else if (b>a && b>c && b>d) {
            System.out.printf("%d es mayor que %d, %d y %d",b, c, a, d);
        }else if (c>a && c>b && c>d) {
            System.out.printf("%d es mayor que %d, %d y %d",c, d, a, b);
        } else if (d>a && d>b && d>c) {
            System.out.printf("%d es mayor que %d, %d y %d",d, c, a, b);
        }
    }
}

