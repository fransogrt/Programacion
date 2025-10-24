package U05.act_4_contador;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno("Pepe", 123);
        Alumno alu2 = new Alumno("Jose", 321);
        Alumno alu3 = new Alumno("Mario", 331);

        System.out.println("El alumno "+alu1.getNombre()+" con el nia: "+alu1.getNia());
        System.out.println("El alumno "+alu2.getNombre()+" con el nia: "+alu2.getNia());
        System.out.println("El alumno "+alu3.getNombre()+" con el nia: "+alu3.getNia());

        System.out.println("Alumnos creados: " + Alumno.getTotalAlumnos());
    }
}