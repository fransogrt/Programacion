package U05.finales.com.banco.app;

import U05.finales.com.banco.modelo.CuentaBancaria;

public class Main {
    public static void main(String[] args){
        CuentaBancaria c1 = new CuentaBancaria("Francisco", "ES123");
        CuentaBancaria c2 = new CuentaBancaria("Jose", "ES1234");

        c1.ingresar(1000);
        c2.ingresar(500);

        c1.retirar(100);
        c2.retirar(2000);

        System.out.println("Saldo de "+c1.getTitular()+" es: "+c1.getSaldo());
        System.out.println("Saldo de "+c2.getTitular()+" es: "+c2.getSaldo());

        CuentaBancaria.setInteresBase(0.02);
        c1.aplicarInteres();
        c2.aplicarInteres();

        System.out.println("Saldo de "+c1.getTitular()+" es: "+c1.getSaldo());
        System.out.println("Saldo de "+c2.getTitular()+" es: "+c2.getSaldo());
    }
}
