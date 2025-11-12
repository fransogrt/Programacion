package Repaso1.Ej6_imc_calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        boolean exit=false;
        Scanner scan = new Scanner(System.in);
        do{
            try {
                System.out.print("Introduce tu altura: ");
                double altura = scan.nextDouble();
                System.out.print("Introduce tu peso: ");
                double peso = scan.nextDouble();

                System.out.println(calcularIMC(peso, altura));

                System.out.print("Si desea calcular otro IMC presione 1, si desea salir presione 2: ");
                int salida = scan.nextInt();
                exit = comprobarSalida(salida);

            } catch (InputMismatchException e) {
                System.out.println("Debes introducir un numero.");
                exit = true;
            }

        }while(!exit);
    }
    static String calcularIMC(double peso, double altura){
        double IMC = peso / (altura * altura);
        if(IMC<18.5)
            return IMC+" : Bajo peso";
        if(IMC>=18.5&&IMC<25)
            return IMC+" : Peso normal";
        if(IMC>=25&&IMC<30)
            return IMC+" : Sobrepeso";
        if(IMC>=30)
            return IMC+" : Obesidad";
        return "";
    }

    static boolean comprobarSalida(int salida){
        return salida==2;
    }
}
