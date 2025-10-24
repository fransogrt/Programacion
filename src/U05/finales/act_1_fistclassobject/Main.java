package U05.finales.act_1_fistclassobject;

public class Main {
    public static void main(String[] args) {
        Libro l1 = new Libro();
        Libro l2 = new Libro();

        l1.titulo = "El Quijote";
        l1.autor = "JDK";
        l1.isbn = "123";

        l2.titulo = "Libro 2";
        l2.autor = "Autor 2";
        l2.isbn = "321";

        System.out.println("Libro: " + l1.titulo + " Autor: " + l1.autor +" ISBN: " + l1.isbn);
        System.out.println("Libro: " + l2.titulo + " Autor: " + l2.autor +" ISBN: " + l2.isbn);
    }
}
