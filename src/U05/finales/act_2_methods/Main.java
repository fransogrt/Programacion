package U05.finales.act_2_methods;

public class Main {
    public static void main(String[] args){
        Rectangulo r1 = new Rectangulo();
        r1.ancho=10;
        r1.alto=5;

        System.out.print("Perimetro: " + r1.calcularPerimetro() + " Area: " + r1.calcularArea());

    }
}
