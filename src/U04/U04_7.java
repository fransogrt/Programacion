package U04;
//7.	Escribe un método que acepte tres argumentos: un carácter y dos enteros.
// El carácter se debe imprimir. El primer entero indica el número de veces que se imprimirá el carácter
// en la línea y el segundo entero indica el número de líneas que deben imprimir-se.
import java.util.Scanner;
public class U04_7 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce un caracter, la cantidad por linea y el numero de lineas: ");
        char c = scan.next().charAt(0);
        int a = scan.nextInt();
        int b = scan.nextInt();

        imprimirlineas(c, a, b);

    }
    static void imprimirlineas(char c,int a,int b){
        for(int i=0;i<b;i++){
            for(int j=0;j<a;j++)
                System.out.print(c);
            System.out.println();
        }
    }
}
