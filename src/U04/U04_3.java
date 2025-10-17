package U04;
//3.	Escribe un metodo que devuelva el mayor de dos números
import java.util.Scanner;
public class U04_3 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce dos numeros para averiguar el mayor: ");
        int a = scan.nextInt();
        int b = scan.nextInt();
        Mayorque(a,b);
    }
    static void Mayorque(int a, int b){
        if(a>b)
            System.out.printf("%d es mayor que %d",a,b);
        else if (a<b) {
            System.out.printf("%d es mayor que %d",b,a);
        }else
            System.out.printf("%d y %d son iguales",a,b);
    }
}
