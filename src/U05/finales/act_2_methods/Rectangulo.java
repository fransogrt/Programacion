package U05.finales.act_2_methods;

public class Rectangulo {
    public double ancho, alto;
    public double calcularArea(){
        return ancho*alto;
    }
    public double calcularPerimetro(){
        return 2*(ancho+alto);
    }

}
