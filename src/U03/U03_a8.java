package U03;
//8. Escribe un programa para calcular la edad de una persona solicitando la
//fecha actual y la fecha de su nacimiento
import java.util.Scanner;
public class U03_a8 {
    public static void main(String[] args){
        int da,ma,anya,dn,mn,anyn, edad;
        Scanner lec = new Scanner (System.in);
        System.out.print("Introduce la fecha actual en formato dd mm yyyy: ");
        da=lec.nextInt();
        ma=lec.nextInt();
        anya=lec.nextInt();
        System.out.print("Introduce tu fecha de nacimiento en formato dd mm yyyy: ");
        dn=lec.nextInt();
        mn=lec.nextInt();
        anyn=lec.nextInt();

        //23 11 2025
        //25 11 2005
        if(anya>anyn){
            anya=anya-anyn;
            if(ma<mn){
                anya--;
            } else if (ma==mn) {
                if(da<dn)
                    anya--;
            }
        }
        System.out.printf("Tu edad es: %d anyos", anya);
    }
}
