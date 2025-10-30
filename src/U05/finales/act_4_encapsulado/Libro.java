package U05.finales.act_4_encapsulado;

public class Libro {
    private String titulo, autor, isbn;

    Libro(String isbn){
        this.isbn=isbn;
    }
    public String getTitulo() {return titulo;}
    public String getAutor() {return autor;}
    public String getIsbn() {return isbn;}

    public void setTitulo(String titulo) {this.titulo = titulo;}
    public void setAutor(String autor) {this.autor = autor;}
}
