package U02;
//19.- Escribe un programa que:
//Muestre al usuario la pregunta ¿Estás seguro de salir de la aplicación?
//Recoja la respuesta a la pregunta del usuario
//Muestre en pantalla la pregunta con la contestación del usuario

import java.util.Scanner;
public class U02_19 {
    public static void main(String[] args){
        String salir;
        Scanner scan= new Scanner (System.in);
        System.out.print("¿Estas seguro de salir de la aplicacion? (si/no)");
        salir = scan.nextLine();

        System.out.print("\n¿Estas seguro de salir de la aplicacion? (si/no)"+salir);


    }
}
