package U02;
//15.- Escribe un programa que defina un enumerado para los días de la semana. En el
//programa define una variable del enumerado y asígnale el valor del día que corresponda al
//martes. A continuación, escribe por pantalla dicha variable y escribe el valor del enumerado
//correspondiente al domingo.
public class U02_15 {
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES,
        VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.MARTES;
        DiaSemana ultimo = DiaSemana.DOMINGO;
        System.out.println("Hoy es " + hoy + "\nY el ultimo dia es " + ultimo);

    }
}