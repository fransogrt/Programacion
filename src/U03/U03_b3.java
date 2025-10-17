package U03;
//3. Mostrar los impares de 1 a 99 indicando al final cuantos son. Repetir para
//los pares y para los múltiplos de cinco.
public class U03_b3 {
    public static void main(String[] args){
        int cont=0;
        for(int i=1;i<=99;i++) {
          /*  if (i % 2 != 0) {
                System.out.printf("%d es impar%n", i);
                cont++;
            } */
        /*    if (i % 2 == 0) {
                System.out.printf("%d es par%n", i);
                cont++;
            } */

            if(i%5==0){
                System.out.printf("%d multiplo de 5%n", i);
                cont++;
            }




        }
        System.out.printf("Un total de %d numeros son impares", cont);
        //System.out.printf("Un total de %d numeros son pares", cont);
        //System.out.printf("Un total de %d numeros son multiplos de 5", cont);
    }
}
