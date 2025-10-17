package U03.Ejemplos;
import java.util.Scanner;
public class U03_Cuadrado {
    public static void main(String[] args){
        int lado;
        Scanner scan=new Scanner(System.in);

        System.out.print("Introduce el lado: ");
        lado=scan.nextInt();
        for(int i=1; i<=lado;i++){
            for(int j=1; j<=lado;j++) {
                if (i == 1 || i == lado) {
                    System.out.print("*\t");

                } else if (j == 1 || j == lado){

                    System.out.print("*\t");
                }else
                    System.out.print("\t");
            }
            System.out.print("\n");
        }
    }
}
