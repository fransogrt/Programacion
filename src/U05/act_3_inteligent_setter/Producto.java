package U05.act_3_inteligent_setter;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    public Producto(String nombre, double precio, int stock){
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
    }
    public String getNombre() {return nombre;}
    public double getPrecio() {return precio;}
    public int getStock() {return stock;}

    public void setPrecio(double precio){
        if(precio<0) {
            this.precio = 0;
            System.out.println("El precio no puede ser negativo");
        }else
            this.precio=precio;
    }
    public void setStock(int stock) {
        if (stock < 0) {
            this.stock = 0;
            System.out.println("El stock no puede ser negativo");
        } else
            this.stock = stock;
    }
    public boolean hayStock(){
        return stock >= 1;
    }
    public void Stock() {
        if (hayStock())
            System.out.println("Hay stock");
        else
            System.out.println("No hay stock");
    }
}

