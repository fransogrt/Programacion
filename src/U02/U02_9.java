package U02;
//9.- Dadas las siguientes expresiones aritméticas, calcula cuál es el resultado de evaluarlas:
//a) 25 + 20 -15
//b) 20 * 10 +15 * 10
//c) 20 * 10 / 2 -20 /5 * 3
//d) 15/10*2 + 3 / 4 * 8
public class U02_9 {
    public static void main(String[] args) {
        int a = 25 + 20 - 15;
        int b = 20 * 10 + 15 * 10;
        int c = 20 * 10 / 2 - 20 / 5 * 3;
        float d = 15 / 10f * 2 + 3 / 4f * 8;

        System.out.printf("La primera exprension da: %d\n", a);
        System.out.printf("La segunda exprension da: %d\n", b);
        System.out.printf("La tercera exprension da: %d\n", c);
        System.out.printf("La cuarta exprension da: %.1f", d);

    }
}