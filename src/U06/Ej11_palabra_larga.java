package U06;
// Enunciado: Pide una frase al usuario (ej.: "Hoy es un día fantástico en 1DAW").
// El programa debe encontrar e imprimir cuál es la palabra más larga de la frase.
//Pistas: split(" ") (para obtener un array de palabras) y un bucle for que recorra el array,
// guardando la palabra más larga encontrada hasta el momento en una variable.
import java.util.Scanner;
public class Ej11_palabra_larga {
    public static void main(String[] args){
        String comodin="";
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();

        String[] palabras = frase.split(" ");
        for(int i = 0; i< palabras.length; i++){
            if(palabras[i].length()>comodin.length())
                comodin = palabras[i];
        }

        System.out.println("La palabra mas larga es: "+ comodin);
    }
}
