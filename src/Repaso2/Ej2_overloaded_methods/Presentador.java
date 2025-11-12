package Repaso2.Ej2_overloaded_methods;

public class Presentador {
    public static void saludar(String nombre){ System.out.println("Hola, "+ nombre); }
    public static void saludar(){ System.out.println("Hola, mundo");}
    public static void saludar(String nombre, int edad){ System.out.printf("Hola, %s, tienes %d años", nombre,edad); }

}
