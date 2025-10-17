package U04;
//12.	Escribe un programa en Java que, dado el nombre de una persona
// y el idioma de preferencia de esa persona, escriba en pantalla un saludo
// a esa persona en el idioma elegido, con el estilo: ”Buenos días Pepe Sánchez”.
// Los idiomas disponibles serán
//(a) Valenciano
//(b) Castellano
//(c) Inglés
//El saludo se mostrará desde un procedimiento al que se le pasan el nombre y el código del idioma.
// Para el ejemplo anterior, la llamada sería: saludo (”Pepe Sánchez ”, ’b’)
import java.util.Scanner;
import java.lang.String;
public class U04_12 {
    public static void main(String[] args){
        Scanner scan= new Scanner(System.in);
        System.out.print("Introduce el nombre de la persona a saludar: ");
        String nombre = scan.nextLine();
        System.out.print("Introduce (a) para Valenciano, (b) para Castellano y (c) Ingles : ");
        char opcion = scan.next().charAt(0);

        saludo(nombre,opcion);

    }
    static void saludo(String nombre, char opcion){
        switch(opcion){
            case 'a': // Valenciano
                System.out.printf("Bon dia %s.",nombre);
                break;
            case 'b': // Castellano
                System.out.printf("Buenos dias %s",nombre);
                break;
            case 'c': // Ingles
                System.out.printf("Good morning %s",nombre);
                break;
            default:
                System.out.print("No has introducido una opcion correcta.");
        }
    }
}
