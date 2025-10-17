package U02;
//16.- Escribe en Java los siguientes tipos enumerados:
//a) Los días de la semana
//b) Las calificaciones de un alumno
//c) los colores primarios (rojo, amarillo, azul)
//d) Las notas musicales
public class U02_16 {
    public enum Calificaciones {INSUFICIENTE,SUFICIENTE,NOTABLE,SOBRESALIENTE}
    public enum DiaSemana {LUNES, MARTES, MIERCOLES, JUEVES, VIERNES, SABADO, DOMINGO}
    public enum colores {ROJO,AMARILLO,AZUL}
    public enum notas {DO,RE,MI,FA,SOL,LA,SI}

    public static void main(String[] args){
        Calificaciones bajo=Calificaciones.INSUFICIENTE;
        Calificaciones alto=Calificaciones.SOBRESALIENTE;
        System.out.println("La peor nota es "+bajo+" y la mejor nota es"+alto);
        DiaSemana primero=DiaSemana.LUNES;
        DiaSemana ultimo=DiaSemana.DOMINGO;
        System.out.println("El primer dia es "+primero+" y el ultimo dia es "+ultimo);
        colores amarillo=colores.AMARILLO;
        colores azul=colores.AZUL;
        colores rojo=colores.ROJO;
        System.out.println("Los colores primarios son "+rojo+" "+amarillo+" y "+azul);
        notas primeranota=notas.DO;
        notas ultimanota=notas.SI;
        System.out.println("La primera nota musical es el "+primeranota+" y la ultima nota es el "+ultimanota);

    }
}
