package U04;
//13.	Escribe un programa que solicite  un número  y visualizar en pantalla si es o no un número perfecto.
//Un número se considera perfecto cuando la suma de sus divisores, excepto el mismo, es igual al propio número
import java.util.Scanner;
public class U04_13 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Introduce un numero para comprobar si es perfecto: ");
        int a = scan.nextInt();

        System.out.print(numperfecto(a) ? "EL numero es perfecto" : "El numero no es perfecto");

    }
    static boolean numperfecto(int a){
        int suma=0;
        for(int i=1;i<a;i++)
            if(a%i==0)
                suma=suma+i;
        return a == suma;
    }
}
