package U04;
//9.	Se llama media armónica de dos números el resultado obtenido
// al calcular los inversos de los números, calcular la media y
// calcular el inverso del resultado. Escribe un método que acepte  dos
//  argumentos double i devuelva la media armónica de los números
import java.util.Scanner;
import java.lang.Math;
public class U04_9 {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("Introduce dos numeros a sacar media armonica: ");
        double a= scan.nextDouble();
        double b= scan.nextDouble();

        double media = mediaarmonica(a,b);

        System.out.printf("La media armonica es de: %f", media);
    }
    static double mediaarmonica(double a, double b){
        a= 1/a;
        b= 1/b;
        return 1/((a+b)/2);
    }
}
