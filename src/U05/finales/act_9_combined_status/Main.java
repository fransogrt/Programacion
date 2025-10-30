package U05.finales.act_9_combined_status;

public class Main {
    public static void main(String[] args){
        Coche c1 = new Coche("Nissan","Almera");

        c1.acelerar(50);
        c1.frenar(20);
        System.out.println("Velocidad actual: "+ c1.getVelocidadActual());

        c1.frenar(100);
        System.out.println("Velocidad actual: "+ c1.getVelocidadActual());
    }
}
