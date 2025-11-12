package Repaso1.Ej7_interactive_menu;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        boolean exit = false;
        do {
            try{
                menu();
                int opcion = scan.nextInt();
                exit = opciones(opcion);
            }catch (InputMismatchException e){
                System.out.println("Debes introducir un numero.");
            }
        }while(!exit);
    }
    static void menu(){
        System.out.println("--------------------------");
        System.out.println("|  1. Saludar            |");
        System.out.println("|  2. Despedirse         |");
        System.out.println("|  3. Salir              |");
        System.out.println("--------------------------");
    }
    static boolean opciones(int opcion){
        switch (opcion){
            case 1:
                System.out.println("¡Hola, usuario!");
                System.out.println();
                return false;
            case 2:
                System.out.println("¡Adiós, nos vemos!");
                System.out.println();
                return false;
            case 3:
                return true;
            default:
                System.out.println("No has introducido una opción valida.");
                System.out.println();
                return false;
        }
    }
}
