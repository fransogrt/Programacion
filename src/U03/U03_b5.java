package U03;
//5. Visualizar los números de 1 a 100 e indicar al final: Cuantos hay pares y su
//suma. Cuantos hay impares y su suma. Cuantos hay que sean múltiplos de
//cuatro y de siete y su suma.
public class U03_b5 {
    public static void main(String[] args){
        int par=0,contpar=0,contimpar=0,impar=0,contmult4=0,mult4=0,mult7=0,contmult7=0;
        for(int i=1;i<=100;i++) {
            System.out.printf("%d\t",i);
            if(i%2==0){
                contpar+=i;
                par++;
            }else{
                contimpar+=i;
                impar++;
            }
            if(i%4==0){
                contmult4+=i;
                mult4++;
            }
            if (i%7==0){
                contmult7+=i;
                mult7++;
            }

        }
        System.out.printf("%nPares: %d | Suma: %d%n",par,contpar);
        System.out.printf("Impares: %d | Suma: %d%n",impar,contimpar);
        System.out.printf("Multiplo de 4: %d | Suma: %d%n",mult4,contmult4);
        System.out.printf("Multiplo de 7: %d | Suma: %d%n",mult7,contmult7);
    }
}
