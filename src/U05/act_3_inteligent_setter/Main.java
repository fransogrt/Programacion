package U05.act_3_inteligent_setter;

public class Main {

    public static void main(String[] args){
        Producto p1 = new Producto("Jabon",4,50);
        System.out.println(p1.getPrecio()+" dolare");

        p1.setPrecio(-50.0);

        System.out.println(p1.getPrecio()+" dolare");
        p1.Stock();
        System.out.println(p1.getStock()+" de stock");

        p1.setStock(-1);
        p1.Stock();
        System.out.println(p1.getStock()+" de stock");



    }

}
