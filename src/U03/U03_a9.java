package U03;
//9. Escribe un programa que solicite tres valores enteros con el día, mes y año
//de una fecha e indique si se trata de valores válidos para una fecha.
import java.util.Scanner;
public class U03_a9 {
    public static void main(String[] args){
        int dia,mes,anyo;
        Scanner lec = new Scanner (System.in);
        System.out.print("Introduce la fecha actual en formato dd mm yyyy: ");
        dia=lec.nextInt();
        mes=lec.nextInt();
        anyo=lec.nextInt();

        if(anyo>2025){
            System.out.println("Fecha invalida, anyo no valido");
        } else if (mes>12) {
            System.out.println("Fecha invalida, mes no valido");
        }else if (dia>31)
            System.out.println("Fecha invalida, dia no valido");
    }
}
