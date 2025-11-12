package Repaso2.Ej5_mixed;

public class Coche {
    private String marca;
    private int anio;

    public Coche(String marca, int anio){
        this.marca = marca;
        this.anio = anio;
    }
    public Coche(String marca){
        this.marca = marca;
        this.anio = 2024;
    }
    public void describir(){
        System.out.println("Coche: "+ marca);
        System.out.println("Año: "+ anio);
    }
}

