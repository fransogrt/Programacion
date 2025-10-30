package U05.finales.act_8_static_constant;

public class Geometria {
    public static final double PI = 3.14159;

    public static double areaCirculo(double radio){
        return (Geometria.PI * radio * radio);
    }
    public static double perimetroCirculo(double radio){
        return (2*Geometria.PI*radio);
    }
}
