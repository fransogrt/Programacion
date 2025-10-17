package U03;
//5. Escribe un programa que permita introducir una calificación (entre cero y
//diez) e imprima su equivalente alfabético, según la siguiente tabla.
// De 3 -------> M.D.
// Desde 3 y menor que 5 -------> INS.
// Desde 5 y menor que 6 -------> SUF.
// Desde 6 y menor que 7 -------> BIEN
// Desde 7 y menor que 9 -------> NOT.
// Desde 9 hasta 10 -------> SOB.

import java.util.Scanner;

public class U03_a5 {
    public static void main(String[] args){
        int numero;
        Scanner lec= new Scanner (System.in);
        System.out.print("Introduce tu nota: ");
        numero= lec.nextInt();
      /*  if(numero>=0 && numero<=10) {
            if (numero < 3)
                System.out.printf("La calificacion %d es M.D.", numero);
            else if (numero < 5) {
                System.out.printf("La calificacion %d es INS.", numero);
            } else if (numero < 6) {
                System.out.printf("La calificacion %d es SUF.", numero);
            } else if (numero < 7) {
                System.out.printf("La calificacion %d es BIEN", numero);
            } else if (numero < 9) {
                System.out.printf("La calificacion %d es NOT.", numero);
            } else if (numero <= 10) {
                System.out.printf("La calificacion %d es SOB.", numero);
            }
        }else
            System.out.print("Nota incorrecta"); */

        switch(numero){
            case 1:case 2:
                System.out.printf("La calificacion %d es M.D.", numero);
                break;
            case 3:case 4:
                System.out.printf("La calificacion %d es INS.", numero);
                break;
            case 5:
                System.out.printf("La calificacion %d es SUF.", numero);
                break;
            case 6:
                System.out.printf("La calificacion %d es BIEN", numero);
                break;
            case 7:case 8:
                System.out.printf("La calificacion %d es NOT.", numero);
                break;
            case 9:case 10:
                System.out.printf("La calificacion %d es SOB.", numero);
                break;
            default:
                System.out.printf("Intentalo de nuevo");
                break;
        }

    }
}
