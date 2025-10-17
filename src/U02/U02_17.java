package U02;
//17.- Escribe un programa que solicite al usuario una cantidad en segundos y la convierta a
//días, horas, minutos y segundos.
import java.util.Scanner;
public class U02_17 {
    public static void main(String[] args){
        int dias,horas,mins,secs;
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce los segundos a convertir: ");
        secs = sc.nextInt();
        mins=secs/60;
        secs=secs%60;
        horas=mins/60;
        mins=mins%60;
        dias=horas/24;
        horas=horas%24;


        System.out.print("\nDias: "+dias+"\nHoras: "+horas+"\nMinutos: "+mins+"\nSegundos: "+secs);
    }
}
