package U04;
//4.	Escribe un método que devuelva el mayor de  tres números
import java.util.Scanner;
public class U04_4 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce tres numeros para averiguar el mayor: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        int c = scan.nextInt();
        Mayorque(a,b,c);
    }
    static void Mayorque(int a, int b, int c){
        if(a>b && a>c)
            System.out.printf("%d es mayor que %d y que %d",a,b,c);
        else if (b>a && b>c) {
            System.out.printf("%d es mayor que %d y que %d",b,a,c);
        }else if (c>a && c>b)
            System.out.printf("%d es mayor que %d y que %d",c,a,b);
    }
}
