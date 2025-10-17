package U03.Ejemplos;

import java.util.Scanner;

public class U03_Matriz {
    public static void main(String[] args){
        int lado;

        Scanner lec=new Scanner(System.in);
        System.out.print("Introduce el lado que quieres de la matriz: ");
        lado=lec.nextInt();

        for (int i=0;i<lado;i++) {
            for (int j = 0; j < lado; j++)
                System.out.print("*\t");

            System.out.print("\n");
        }
    }
}
