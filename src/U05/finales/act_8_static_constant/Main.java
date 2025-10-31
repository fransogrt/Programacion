package U05.finales.act_8_static_constant;
import java.util.Scanner;
public class Main {
    public static void main(String[] args){
        //int radio=5;
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce el radio del circulo: ");
        int radio=scan.nextInt();

        System.out.println("Area: "+Geometria.areaCirculo(radio));
        System.out.println("Perimetro: "+Geometria.perimetroCirculo(radio));

    }
}
