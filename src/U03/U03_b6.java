package U03;
//6. Visualizar la tabla de multiplicar del uno al diez.

public class U03_b6 {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){ //era para las tablas del 1 al 10, no del 10 solo :sob:
            int mult=10;
            mult*=i;
            System.out.printf("10 por %d es: %d%n",i,mult);
        }
    }
}
