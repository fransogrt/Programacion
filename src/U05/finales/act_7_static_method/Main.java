package U05.finales.act_7_static_method;

public class Main {
    public static void main(String[] args){
        boolean check = Validaciones.esEmailValido("user@host.com");
        System.out.print(check);
    }
}
