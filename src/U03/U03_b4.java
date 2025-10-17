package U03;
//4. Introducir A y B que sea mayor que A. Visualizar los números de A hasta B e
//indicar cuantos hay que sean pares.
import java.util.Scanner;
public class U03_b4 {
    public static void main(String[] args){
        int A,B,cont=0;
        Scanner lec= new Scanner(System.in);
        A=lec.nextInt();
        B=lec.nextInt();

        if(B>A)
            for(int i=A;i<=B;i++) {
                if (i%2==0)
                    cont++;
                System.out.print(i);

                System.out.print(i%2==0 ? " es par\n"  : "\n");
            }
        System.out.printf("Hay %d numeros pares", cont);
    }
}
