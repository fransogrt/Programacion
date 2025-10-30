package U05.finales.com.banco.modelo;

public class CuentaBancaria {
    private String titular, numeroCuenta;
    private double saldo;
    private static double INTERES_BASE = 0.01;

    public CuentaBancaria(String titular, String numeroCuenta){
        this.titular=titular;
        this.numeroCuenta=numeroCuenta;
        this.saldo=0.0;
    }

    public String getTitular() { return titular; }
    public String getNumeroCuenta() { return numeroCuenta; }
    public double getSaldo() { return saldo; }

    public void ingresar(double cantidad){
        if(cantidad>0)
            this.saldo=saldo+cantidad;
    }
    public boolean retirar(double cantidad) {
        if (this.saldo-cantidad>=0){
            this.saldo=this.saldo-cantidad;
            return true;
        }else {
            System.out.println("Cantidad a retirar mayor a saldo");
            return false;
        }
    }
    public void aplicarInteres(){
        this.saldo=this.saldo+(this.saldo * INTERES_BASE);
    }
    public static void setInteresBase(double nuevoInteres){
        INTERES_BASE=nuevoInteres;
    }
}
