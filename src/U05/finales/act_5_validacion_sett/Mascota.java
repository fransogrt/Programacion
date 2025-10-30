package U05.finales.act_5_validacion_sett;

public class Mascota {
    private String nombre, tipo;
    private int edad;

    Mascota(String nombre, String tipo, int edad){
        this.nombre=nombre;
        this.tipo=tipo;
        setEdad(edad);
    }

    public String getNombre() { return nombre; }
    public String getTipo() { return tipo; }
    public int getEdad() { return edad; }

    public void setEdad(int edad){
        if(edad<=0) {
            edad = 0;
            System.out.println("Edad negativa, inicializando en 0");
        }
        this.edad=edad;
    }
}
