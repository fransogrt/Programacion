package U06;

import java.util.Scanner;

public class Ej3_Login_simple {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        String usuarioCorrecto="admin", passCorrecto="1234";

        System.out.println("Introduce el usuario: ");
        String usuario = sc.nextLine();
        System.out.println("Introduce la contraseña: ");
        String pass = sc.nextLine();

        if(usuario.equals(usuarioCorrecto)&&pass.equals(passCorrecto))
            System.out.println("Login correcto");
        else
            System.out.println("Login incorrecto");
        sc.close();
    }
}
