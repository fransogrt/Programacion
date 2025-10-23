package U05.act_2_constructores;

public class Alumno {
    private String nombre;
    private int  nia;

    public String getNombre() { return nombre; }
    public int getNia() { return nia; }
    public Alumno(String nombre, int nia){
        this.nombre=nombre;
        this.nia=nia;
    }
}
