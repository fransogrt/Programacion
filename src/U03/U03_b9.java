
package U03;
//9. Escribe un programa que solicite al usuario un número entero positivo. El
//programa debe presentar en pantalla la descomposición en factores primos
//de dicho número
import java.util.Scanner;

public class U03_b9 {
    public static void main(String[] args){
        int numero, cont1=0,cont2=0,cont3=0,cont4=0;
            Scanner lec = new Scanner(System.in);
            System.out.print("Introduce un numero entero para factorizar: ");
            numero=lec.nextInt();

            System.out.printf("El numero a factorizar es: %d=", numero);
            do {
                if(numero % 2 == 0) {
                    System.out.print("2");
                    numero /= 2;
                    if(numero!=1)
                        System.out.print("*");
                }

                if (numero % 3 == 0 && numero % 2 != 0){
                    System.out.print("3");
                    numero /= 3;
                    if(numero!=1)
                        System.out.print("*");
                }

                if (numero % 5 == 0 && numero % 2 != 0 && numero % 3 != 0) {
                    System.out.print("5");
                    numero /= 5;
                    if(numero!=1)
                        System.out.print("*");
                }

                if (numero % 7 == 0 && numero % 2 != 0 && numero % 3 != 0 && numero % 5 != 0) {
                    System.out.print("7");
                    numero /= 7;
                    if(numero!=1)
                        System.out.print("*");
                }



                }while(numero!=1);
    }
}
