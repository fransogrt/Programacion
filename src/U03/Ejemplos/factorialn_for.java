package U03.Ejemplos;
import java.util.Scanner;
public class factorialn_for {
    public static void main(String[] args){
        Scanner l=new Scanner (System.in);
        int m,fac=1;
        m=l.nextInt();
        for(int n=m;n>0;n--)
            fac*=n;
        System.out.printf("Factorial: %d", fac);
    }

}
