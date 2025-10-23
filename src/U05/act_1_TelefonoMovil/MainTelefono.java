package U05.act_1_TelefonoMovil;

public class MainTelefono {
    public static void main(String[] args) {
        TelefonoMovil Samsung = new TelefonoMovil();

        Samsung.setMarca("Samsung");
        Samsung.setModelo("Samsung S23");
        Samsung.setEncendido(false);

        TelefonoMovil iPhone = new TelefonoMovil();

        iPhone.setMarca("Apple");
        iPhone.setModelo("Iphone 17");
        iPhone.setEncendido(true);

        System.out.println(iPhone.getModelo());
        System.out.println(Samsung.getEncendido());
    }
}
