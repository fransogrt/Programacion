package Repaso2.Ej3_var_scope;

public class Inventario {
    private int stock = 0;

    public void agregarStock(int cantidad){ this.stock += cantidad;}
    public void mostrarStockAnual(){ System.out.println("Stock: "+stock);}
    public void ejemploVariableLocal(){
        int stock = 50;
        System.out.println("Stock ejemplo: "+stock);
    }

}
