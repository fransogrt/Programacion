package U03;
//8. Escribe un programa que solicite un número estero e indique si se trata de
//un número primo o no.
import java.util.Scanner;
public class U03_b8 {
    public static void main(String[] args) {
        int primo;
        Scanner lec = new Scanner(System.in);
        primo=lec.nextInt();
        if(primo%2==0 || primo%3==0 || primo%5==0 || primo%7==0 || primo%11==0 || primo%13==0 || primo%17==0 || primo%19==0 ){
            System.out.print("Este numero no es primo");
        }else
            System.out.print("Este numero es primo");
    }
}
