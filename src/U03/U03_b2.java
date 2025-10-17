package U03;
//2. Calcular la suma de los números comprendidos entre uno y mil.
public class U03_b2 {
    public static void main(String[] args) {
        int total = 0;
        for (int i = 0; i <= 1000; i++) {
            total+=i;
        }

        System.out.printf("La suma da %d", total);
    }
}
