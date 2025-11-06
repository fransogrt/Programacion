package U06;

import java.util.Scanner;

public class Ej2_Analizador_frase {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();

        System.out.println("Longitud de la frase: "+ frase.length());
        System.out.println("Primer caracter: "+ frase.charAt(0));
        System.out.println("Ultimo caracter: "+ frase.charAt(frase.length()-1));
        System.out.println("Frase en mayusculas: "+ frase.toUpperCase());
        System.out.println("Frase en minusculas: "+ frase.toLowerCase());

        sc.close();
    }
}
