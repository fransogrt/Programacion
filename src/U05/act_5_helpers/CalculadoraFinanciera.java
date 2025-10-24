package U05.act_5_helpers;

public class CalculadoraFinanciera {
    public static double calcularIVA(double base, double porcentaje) {
        return base * porcentaje;
    }
    public static double calcularTotal(double base, double porcentaje){
        return base + calcularIVA(base,porcentaje);
    }
}

