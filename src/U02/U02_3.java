package U02;
//Escribe un programa que escriba en pantalla las notas de la asignatura de “Programación”.
//En la primera línea se escribirá el nombre de la asignatura. En las siguientes líneas se
//escribirán las notas de los dos parciales realizados poniendo la nota de cada uno en líneas
//distintas. En la última línea escribirá la nota final de la asignatura.
//Escribe lo que sea texto como un texto entre comillas dobles y lo que sea número como un
//número
public class U02_3 {
    public static void main(String[] args){
        int nota=6;
        System.out.printf("Programacion\nParcial 1: %d \nParcial 2: %d\nNota final: %d", nota, nota+1, nota-1);
    }
}
