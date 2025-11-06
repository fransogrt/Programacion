package U06;


//Enunciado: Crea dos métodos.
//metodoString(): Usa un String y un bucle for de 0 a 5000 para concatenar números
// (resultado = resultado + i;). Mide el tiempo que tarda.
//metodoBuilder(): Hace lo mismo pero usando StringBuilder y append(). Mide el tiempo que tarda.
//Imprime ambos tiempos para ver la diferencia.
//Pistas: System.nanoTime() (para medir el tiempo) y StringBuilder.


public class Ej10_gen_strings {
    public static void main(String[] args){
        metodoString();
        metodoBuilder();
    }
    static void metodoString(){

        String cadena="";
        for(int i = 0; i <=5000; i++){
            cadena = cadena + i;
        }
        System.out.println("Metodo String: "+ System.nanoTime());
    }
    static void metodoBuilder(){
        StringBuilder cadena = new StringBuilder();
        for(int i = 0; i <=5000; i++){
            cadena.append(i);
        }
        System.out.println("Metodo Builder: "+ System.nanoTime());
    }
}
