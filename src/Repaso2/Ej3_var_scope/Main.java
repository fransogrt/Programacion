package Repaso2.Ej3_var_scope;

public class Main {
    public static void main(String[] args){
    Inventario inv = new Inventario();
    inv.agregarStock(100);
    inv.ejemploVariableLocal();
    inv.mostrarStockAnual();

    }
}
