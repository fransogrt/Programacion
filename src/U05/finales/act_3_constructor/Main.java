package U05.finales.act_3_constructor;

public class Main {
    public static void main(String[] args){
        Cancion c1 = new Cancion("la vida","pepe flores",123);
        Cancion c2 = new Cancion("nuevo","flowconejo",34);
        //Cancion c3 = new Cancion();
        c1.mostrarInfo();
        c2.mostrarInfo();
    }
}
//Pregunta: ¿Qué pasa si intentas crear una canción con new Cancion() (sin parámetros)? ¿Por qué?
// No deja crearlo debido a que no hay un constructor creado sin parametros