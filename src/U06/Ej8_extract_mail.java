package U06;
// Enunciado: Pide un correo electrónico (ej: "usuario@dominio.com").
// El programa debe extraer y mostrar solo el dominio ("dominio.com").

//Pistas: indexOf('@') (para encontrar la posición de la arroba) y substring()
// (para coger el trozo desde esa posición + 1 hasta el final).

import java.util.Scanner;
public class Ej8_extract_mail {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        String mail = scan.nextLine();

        mail = mail.substring(mail.indexOf('@')+1);

        System.out.println("El dominio es: "+mail);
    }
}
