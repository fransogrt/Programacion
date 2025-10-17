package U02;
//12.- Escribe un programa para calcular el área y el volumen de un cilindro. Para ello declara
//una constante que guarda el valor de PI. Declara, también, variables para el diámetro y la
//altura del cilindro. Supón para el ejemplo que el cilindro tiene un diámetro de 15,5cm y una
//altura de 42,4cm.
public class U02_12 {
    public static void main(String[] args) {
        final float pi = 3.1415f, diametro = 15.5f, altura = 42.4f, radio= diametro/2f;
        float area,volumen;
        area = 2*pi*radio*(radio+altura);
        volumen = pi*(radio*radio)*altura;
        System.out.printf("El area del cilindro es: %.2f cm^2%nEl volumen del cilindro es: %.2f cm^3", area, volumen);

    }
}
