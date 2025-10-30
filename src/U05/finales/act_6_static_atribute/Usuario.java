package U05.finales.act_6_static_atribute;

public class Usuario{

    private static int contadorUsuarios = 0;
    private int id;
    private String username;

    public Usuario(String username){
        this.username=username;
        contadorUsuarios++;
        this.id=contadorUsuarios;
    }
    public static int getTotalUsuarios(){ return contadorUsuarios; }

    public int getId() { return id; }
    public String getUsername() { return username; }
}
