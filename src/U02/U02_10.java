package U02;
//10.- Dadas las siguientes expresiones aritméticas, calcula cuál es el resultado de evaluarlas.
//Supón que las variables a y b que aparecen son del tipo int y a tiene el valor de 2 y b tiene el
//valor de 4.
//a) –a + 5 % b – a * a
//b) 5 + 3 % 7 * b * a – b % a
//c) (a+1) * (b + 1) – b / a
public class U02_10 {
    public static void main(String[] args){
        int a = 2, b = 4;
        int ap=-a + 5 % b - a * a, bp=5 + 3 % 7 * b * a - b % a, cp=(a+1) * (b + 1) - b / a;

        System.out.printf("La primera expresion da: %d\n", ap);
        System.out.printf("La segunda expresion da: %d\n", bp);
        System.out.printf("La tercera expresion da: %d", cp);
    }

}


