package U03;
//7. Escribe un programa que calcule la cuota que se debe abonar en el club de
//golf. La cuota es de 500 €. Tendrán un 50% de descuento las personas
//mayores de 65 años y un 25% los menores de 18 años si los padres no son
//socios y 35% si los padres son socios.
import java.util.Scanner;
public class U03_a7 {
    public static void main(String[] args){
        double cuota=500, precio=0;
        int edad;
        boolean padres;
        Scanner lec = new Scanner (System.in);
        System.out.println("Introduce tu edad: ");
        edad=lec.nextInt();

        if(edad>=65){
            precio=cuota/((double) 100 /50);
            System.out.printf("El precio de la cuota es de %.2f", precio);
        }
        if(edad<18){
            System.out.print("Tus padres son socios (true/false): ");
            padres = lec.nextBoolean();
            if (padres){
                precio = cuota / ((double) 100 / 75);
                System.out.printf("El precio de la cuota es de %.2f", precio);
            }else{
                precio = cuota / ((double) 100 /65);
                System.out.printf("El precio de la cuota es de %.2f", precio);
            }

        }
        if(edad>=18 && edad<=65)
            System.out.printf("La cuota es de %.0f",cuota);

    }
}
