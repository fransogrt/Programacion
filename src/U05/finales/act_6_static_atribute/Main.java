package U05.finales.act_6_static_atribute;

public class Main {
    public static void main(String[] args){
        Usuario u1 = new Usuario("Pedro");
        Usuario u2 = new Usuario("Pepe");
        Usuario u3 = new Usuario("Jose");

        System.out.println("Total de usuarios: "+Usuario.getTotalUsuarios());
        System.out.println("Id: "+u1.getId()+", Nombre: "+u1.getUsername());
        System.out.println("Id: "+u2.getId()+", Nombre: "+u2.getUsername());
        System.out.println("Id: "+u3.getId()+", Nombre: "+u3.getUsername());

    }
}
