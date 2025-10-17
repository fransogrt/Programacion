package U03;
//6. Escribe un programa que solicite un valor real que indica una cantidad de
//dinero en euros. El programa debe mostrar por pantalla la mínima cantidad
//de monedas de cada tipo en que se debe devolver la cantidad de dinero
//indicada.
import java.util.Scanner;
public class U03_a6 {
    public static void main(String[] args){
        float dinero;
        int billete100,billete50,billete20,billete10,billete5,moneda2,moneda1,cent50=0,cent20,cent10,cent5,cent2,cent1;
        Scanner lec= new Scanner (System.in);
        System.out.print("Introduce tu cantidad de dinero: ");
        dinero = lec.nextFloat();
        if(dinero>=100){
            billete100=(int)dinero/100;
            dinero= dinero-100*billete100;
            System.out.printf("Billete de 100 euros: %d%n", billete100);
        }
        if(dinero>=50){
            billete50=(int)dinero/50;
            dinero= dinero-50*billete50;
            System.out.printf("Billete de 50 euros: %d%n", billete50);
        }
        if (dinero>=20){
            billete20=(int)dinero/20;
            dinero= dinero-20*billete20;
            System.out.printf("Billete de 20 euros: %d%n", billete20);
        }
        if (dinero>=10){
            billete10=(int)dinero/10;
            dinero= dinero-10*billete10;
            System.out.printf("Billete de 10 euros: %d%n", billete10);
        }
        if (dinero>=5){
            billete5=(int)dinero/5;
            dinero= dinero-5*billete5;
            System.out.printf("Billete de 5 euros: %d%n", billete5);
        }
        if (dinero>=2){
            moneda2=(int)dinero/2;
            dinero= dinero-2*moneda2;
            System.out.printf("Moneda de 2 euros: %d%n", moneda2);
        }
        if (dinero>=1) {
            moneda1 = (int) dinero;
            dinero = dinero - moneda1;
            System.out.printf("Moneda de 1 euro: %d%n", moneda1);
        }
        if(dinero>=0.5) {
            cent50++;
            dinero = dinero - 0.5f;
            System.out.printf("Moneda de 50 centimos: %d%n", cent50);
        }
        if(dinero>=0.2){
            dinero=dinero*100;
            cent20= (int) dinero/20;
            dinero=dinero-cent20*20;
            dinero=dinero/100;
            System.out.printf("Moneda de 20 centimos: %d%n", cent20);
        }
        if(dinero>=0.1){
            dinero=dinero*100;
            cent10= (int)dinero/10;
            dinero=dinero-cent10*10;
            dinero=dinero/100;
            System.out.printf("Moneda de 10 centimos: %d%n", cent10);
        }
        if(dinero>=0.05){
            dinero=dinero*100;
            cent5= (int)dinero/5;
            dinero=dinero-cent5*5;
            dinero=dinero/100;
            System.out.printf("Moneda de 5 centimos: %d%n", cent5);
        }
        if(dinero>=0.02){
            dinero=dinero*100;
            cent2= (int) dinero/2;
            dinero=dinero-cent2*2;
            dinero=dinero/100;
            System.out.printf("Moneda de 2 centimos: %d%n", cent2);
        }
        if(dinero>=0.01){
            dinero=dinero*100;
            cent1= (int)dinero;
            System.out.printf("Moneda de 1 centimos: %d%n", cent1);
        }
        }
    }
