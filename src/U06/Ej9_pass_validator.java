package U06;

//Enunciado: Pide una contraseña. El programa debe verificar si cumple estas reglas:
//Mínimo 8 caracteres de longitud.
//Contiene al menos una letra mayúscula.
//Contiene al menos un número.
//Pistas: length() y un bucle for con charAt() para comprobar cada carácter usando Character.isUpperCase()
// y Character.isDigit(). Usa variables booleanas para rastrear si has encontrado cada requisito
import java.util.Scanner;
public class Ej9_pass_validator {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        String pass = scan.nextLine();

        System.out.println(UpperCase(pass) ? "La contraseña contiene por lo menos una mayuscula" : "La contraseña no contiene mayusculas");
        System.out.println(Number(pass) ? "La contraseña contiene por lo menos un numero" : "La contraseña no contiene numeros");
        System.out.println(UpperCase(pass) ? "La contraseña cumple con la longitud minima" : "La contraseña es demasiado corta");
    }
    static boolean UpperCase(String pass){
        char[] letra = pass.toCharArray();
        for(int i = 0; i<pass.length(); i++)
            if(Character.isUpperCase(letra[i]))
                return true;
        return false;
    }
    static boolean Number(String pass){
        char[] letra = pass.toCharArray();
        for(int i = 0; i<pass.length(); i++)
            if(Character.isDigit(letra[i]))
                return true;
        return false;
    }
    static boolean LenghtMore8(String pass){
        return pass.length() >= 8;
    }
}
