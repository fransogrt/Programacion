package U06;

public class Ej1 {
    public static void main(String[] args) {
        // Caso 1: Dos literales (usan el String Pool)
        String s1 = "Hola";
        String s2 = "Hola";
    // s1 == s2      -> true (Java reutiliza el objeto del String Pool)
    // s1.equals(s2) -> true (El contenido es idéntico)

        // Caso 2: Un literal y un objeto 'new'
        String s3 = "Hola";
        String s4 = new String("Hola");
    // s3 == s4      -> false (s3 está en el Pool, s4 está en el Heap. Son objetos distintos)
    // s3.equals(s4) -> true (El contenido es idéntico)

        // Caso 3: Dos objetos 'new'
        String s5 = new String("Hola");
        String s6 = new String("Hola");
    // s5 == s6      -> false (Son dos objetos distintos en el Heap)
    // s5.equals(s6) -> true (El contenido es idéntico)

        if (s1 == s2)
            System.out.println("True string pool s1,s2");
        if (s1.equals(s2))
            System.out.println("True equals s1,s2");

        if (s3 == s4)
            System.out.println("True string pool s3,s4");
        if (s3.equals(s4))
            System.out.println("True equals s3,s4");

        if (s5 == s6)
            System.out.println("True string pool s5,s6");
        if (s5.equals(s6))
            System.out.println("True equals s5,s6");
    }
}