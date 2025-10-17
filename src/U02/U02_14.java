package U02;
//14.- Dadas las siguientes expresiones aritmético-lógicas calcula cuál es el resultado de
//evaluarlas.
//a) 25>20 && 13>5
//b) 10 + 4 < 15 -3 || 2 * 5 + 1 > 14 – 2 * 2
//c) 4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1
//d) 10 <= 2 * 5 && 3<4 || ! (8>7) && 3*2 <= 4*2-1
public class U02_14 {
    public static void main(String[] args){
        boolean a=25>20 && 13>5, b=10 + 4 < 15 -3 || 2 * 5 + 1 > 14 - 2 * 2, c=4 * 2 <= 8 || 2 * 2 < 5 && 4 > 3 + 1, d=10 <= 2 * 5 && 3<4 || ! (8>7) && 3*2 <= 4*2-1;
        System.out.printf("La expresion a es: %s%n",a);
        System.out.printf("La expresion b es: %s%n",b);
        System.out.printf("La expresion c es: %s%n",c);
        System.out.printf("La expresion d es: %s%n",d);
    }
}
