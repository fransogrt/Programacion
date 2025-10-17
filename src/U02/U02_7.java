package U02;
//7.- Escribe un programa que visualice en pantalla cuánto le dará su banco después de seis
//meses si pone 2000€ en una cuenta a plazo fijo al 2,75% anual. Recuerda que al pagarte los
//intereses el banco le retendrá el 18% para hacienda.
public class U02_7 {
    public static void main(String[] args){
        int dinero = 2000;
        float interes = 2.75f;
        int reten = 18;
        float ganancia,total,retencion;

        ganancia = ((dinero * interes)/100/2);
        retencion = ((ganancia * reten)/100);
        total = dinero+ganancia-retencion;


        System.out.println("Cantidad inicial:" + dinero);
        System.out.println("Cantidad final:" + total);
    }
}
