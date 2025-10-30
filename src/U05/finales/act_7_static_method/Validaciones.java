package U05.finales.act_7_static_method;

public class Validaciones {
    public static boolean esEmailValido(String email){
        return email.contains("@") && email.contains(".");
    }
    public static boolean esPasswordSegura(String password){
        return password.length()>=8;
    }
}
