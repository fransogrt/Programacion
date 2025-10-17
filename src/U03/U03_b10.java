package U03;
//10.Escribe un programa que permita determinar si utilizar los números
//aleatorios de la clase Math son apropiados. Para ello el programa debe
//simular que se lanza una moneda un número elevado de veces, por
//ejemplo, 1.000.000. A continuación debe imprimir por pantalla el porcentaje
//de caras y el porcentaje de cruces que han salido.
import java.util.Scanner;
import java.lang.Math;

public class U03_b10 {
    public static void main(String[] args){
        final int max=1000000;
        int cara=0,cruz=0, total;
        float a,b;
        for(int i=0; i<=max;i++){
            if((int) (Math.random( )*2) + 1 == 1.0) // 1 cara 2 cruz
                cara++;
            else
                cruz++;
        }
        System.out.printf("Han salido %d veces cara ", cara);
        a= (float) (cara * 100) /(cara+cruz);
        System.out.printf("siendo un %.2f de veces%n", a);
        System.out.printf("Han salido %d veces cruz ", cruz);
        b= (float) (cruz * 100) /(cara+cruz);
        System.out.printf("siendo un %.2f de veces", b);



    }
}

