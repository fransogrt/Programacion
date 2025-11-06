package U06;
//Pide una frase. Recórrela carácter a carácter y cuenta cuántas vocales y cuántas consonantes tiene.
// (No cuentes espacios ni signos de puntuación).
import java.util.Scanner;

public class Ej4_contador_vocales_consonantes {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String frase = sc.nextLine();
        char[] letras = frase.toCharArray();
        int vocales=0, consonantes=0;

        for(int i=0;i<frase.length();i++){
            if(letras[i] == 'a' ||letras[i] == 'e' ||letras[i] == 'i' ||letras[i] == 'o' ||letras[i] == 'u')
                vocales++;
            if(Character.isLetter(letras[i]))
                consonantes++;
        }
        consonantes-=vocales;
        System.out.println("Vocales: "+vocales);
        System.out.println("Consonantes: "+consonantes);
        sc.close();
    }
}
