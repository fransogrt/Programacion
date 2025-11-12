package Repaso1.Ej2_calificacion;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.print("Introduce la calificación: ");
        //double nota = scan.nextDouble();
        int nota = scan.nextInt();

        String calificacion = calcularCal(nota);


        System.out.printf("La calificación es %s.", calificacion);
        scan.close();
    }
    static String calcularCal(int nota){
        switch(nota) {
            case 0 : case 1 : case 2 : case 3 : case 4 :
                return "Suspenso";
            case 5 : case 6 :
                return "Aprobado";
            case 7 : case 8:
                return "Notable";
            case 9: case 10:
                return "Sobresaliente";
            default:
                return "Invalido";
        }
    }
    static String calcularCal(double nota){
        if(nota>0&&nota<5)
            return "Suspenso";
        if(nota>=5&&nota<7)
            return "Aprobado";
        if(nota>=7&&nota<9)
            return "Notable";
        if(nota>=9&&nota<=10)
            return "Sobresaliente";

        return "Invalido";
    }
}
