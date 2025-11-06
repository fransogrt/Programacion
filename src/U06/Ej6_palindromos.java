package U06;
import java.util.Scanner;
public class Ej6_palindromos {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String frase = scan.nextLine();
        frase= frase.toLowerCase().replace(" ", "");
        StringBuilder fraseReversa = new StringBuilder(frase);

        if(frase.equals(String.valueOf(fraseReversa.reverse())))
            System.out.println("La frase reversa: "+fraseReversa.reverse()+" es palindromo");
        else
            System.out.println("La frase reversa: "+fraseReversa.reverse()+" no es palindromo");

    }
}
