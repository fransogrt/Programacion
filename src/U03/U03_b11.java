package U03;
//11. Escribe un programa que juegue con el usuario a adivinar un número. El
//ordenador debe generar un número entre 1 y 100 y el usuario tiene que
//intentar adivinarlo. Para ello, cada vez que el usuario introduce un valor, el
//ordenador debe decirle al usuario si el número que tiene que adivinar es
//mayor o menor que el que ha introducido. Cuando consiga adivinarlo debe
//indicárselo y visualizar el número de veces que el usuario ha intentado
//adivinar el número. Si el usuario introduce algo que no es un número debe
//indicarlo de esta forma en pantalla.
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.Random;



public class U03_b11 {
    public static void main(String[] args){
        int num,cont=0;
        boolean flag=false;
        Random rnd = new Random( ); //creamos un objeto Random
        rnd.setSeed(new Date().getTime());  // random seed a partir de la hora del sistema
        int numero =rnd.nextInt(1,100); //solicitamos un número entero entre 0 y 100. Lo guardamos en la variable numero
        Scanner lec=new Scanner (System.in);

        do {
            try {
                System.out.print("Introduzca un numero al azar entre 1 y 100: ");
                num = lec.nextInt();


                if (num != numero) {
                    if (num < numero) {
                        System.out.println("El numero introducido es menor al generado, vuelve a intentarlo");
                        cont++;
                    } else {
                        System.out.println("El numero introducido es mayor al generado, vuelve a intentarlo");
                        cont++;
                    }

                } else {
                    System.out.println("El numero introducido es el correcto");
                    flag = true;
                }
            }catch(InputMismatchException e){
                System.out.println("Error: No has introducido un numero");
            }



        }while (!flag);
        System.out.printf("Se ha acertado el numero en un total de %d intentos", cont);
    }
}
