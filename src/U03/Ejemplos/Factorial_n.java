package U03.Ejemplos;


import java.util.Scanner;
public class Factorial_n {
    public static void main(String[] args){
        Scanner lec = new Scanner(System.in);
        int factorial=1,n;
        System.out.print("Introduce numero a sacar factorial: ");
        n = lec.nextInt();

        while(n>0){
            factorial*=n;
            n--;
        }
        System.out.printf("El factorial del numero introducido es: %d", factorial);
    }

}
