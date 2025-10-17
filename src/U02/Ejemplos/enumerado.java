package U02.Ejemplos;

public class enumerado {
    public enum DiaSemana {
        LUNES, MARTES, MIERCOLES, JUEVES,
        VIERNES, SABADO, DOMINGO
    }

    public static void main(String[] args) {
        DiaSemana hoy = DiaSemana.JUEVES;
        DiaSemana ultimo = DiaSemana.DOMINGO;
        System.out.println("Hoy es " + hoy + "\n Y el ultimo dia es " + ultimo);

    }
}