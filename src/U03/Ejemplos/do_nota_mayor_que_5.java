package U03.Ejemplos;
import java.util.Scanner;

public class do_nota_mayor_que_5 {
    public static void main(String[] args){
        //Pedir una nota hasta que sea mayor que 5
        double nota;
        Scanner lector =new Scanner(System.in);
        do {
            System.out.print("Introduce una nota mayor que 5: ");
            nota = lector.nextDouble();
        } while (nota < 5.0);
    }
}
