package U02;
//11.- Escribe un programa que defina dos variables enteras para describir las longitudes de los
//lados de un rectángulo. El programa debe calcular y escribir en la pantalla las longitudes de
//los lados, el perímetro y el área del rectángulo. (Supón que el rectángulo mide 15 cm de alto y
//25 cm de ancho.)
public class U02_11 {
    public static void main(String[] args){
        int alto=15, ancho=25;
        int perimetro, area;
        perimetro = 2*alto+2*ancho;
        area = alto*ancho;

        System.out.printf("Alto: %d%n", alto);
        System.out.printf("Ancho: %d%n", ancho);
        System.out.printf("Perimetro: %d%n", perimetro);
        System.out.printf("Area: %d%n", area);
    }
}
