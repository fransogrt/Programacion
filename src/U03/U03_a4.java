package U03;
//4. Escribe un programa que solicite dos números reales y los escriba
//ordenados de menor a mayor
import java.util.Scanner;

public class U03_a4 {
    public static void main(String[] args){
        float a,b;
        Scanner lect = new Scanner (System.in);
        System.out.print("Introduce tus dos numeros reales: ");
        a = lect.nextFloat();
        b =  lect.nextFloat();

        if(a>b)
            System.out.printf("%.2f %.2f",b,a);
        else
            System.out.printf("%.2f %.2f",a,b);

    }
}
