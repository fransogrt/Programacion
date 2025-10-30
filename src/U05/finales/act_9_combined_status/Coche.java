package U05.finales.act_9_combined_status;

public class Coche {
    private String marca, modelo;
    private int velocidadActual;

    Coche(String marca, String modelo){
        this.marca=marca;
        this.modelo=modelo;
        this.velocidadActual=0;
    }

    public String getMarca() { return marca; }
    public String getModelo() { return modelo; }
    public int getVelocidadActual() { return velocidadActual; }

    public void acelerar(int cantidad){
        this.velocidadActual=velocidadActual+cantidad;
    }
    public void frenar(int cantidad){
        if(this.velocidadActual-cantidad<0) {
            this.velocidadActual = 0;
            System.out.println("No se puede frenar cantidades negativas");
        }else
            this.velocidadActual=velocidadActual-cantidad;
    }

}
