package U05.finales.act_4_encapsulado;

public class Main {
    public static void main(String[] args){
        Libro l1 = new Libro("1234S");

        l1.setAutor("Federico");
        l1.setTitulo("Tirando lo blanco");

        System.out.println("Titulo: "+ l1.getTitulo());
        System.out.println("ISBN: "+ l1.getIsbn());
        System.out.println("Autor: "+ l1.getAutor());
    }
}