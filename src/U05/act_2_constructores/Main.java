package U05.act_2_constructores;

public class Main {
    public static void main(String[] args) {
        Alumno alu1 = new Alumno("Pepe", 123);
        Alumno alu2 = new Alumno("Jose", 321);

        System.out.println("El alumno "+alu1.getNombre()+" con el nia: "+alu1.getNia());
        System.out.println("El alumno "+alu2.getNombre()+" con el nia: "+alu2.getNia());
    }
}
