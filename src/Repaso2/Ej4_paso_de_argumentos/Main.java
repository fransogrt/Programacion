package Repaso2.Ej4_paso_de_argumentos;

import com.sun.jdi.event.MonitorContendedEnteredEvent;

public class Main {
    public static void main(String[] args){
        ArgValor met = new ArgValor();
        int miNumero = 10;

        met.modificarPrimitivo(miNumero);
        System.out.println(miNumero);

        Contenedor cont = new Contenedor();
        cont.valor = 10;
        met.modificarObjeto(cont);
        System.out.println(cont.valor);
    }
}
