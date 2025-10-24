package U05.act_4_contador;
public class Alumno {
    private String nombre;
    private int  nia;
    private static int totalAlumnos = 0;

    public String getNombre() { return nombre; }
    public int getNia() { return nia; }
    public static int getTotalAlumnos(){ return totalAlumnos; }
    public Alumno(String nombre, int nia){
        this.nombre=nombre;
        this.nia=nia;
        totalAlumnos++;
    }

}

