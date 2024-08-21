package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Numero {

    // imprimir resultdo
    public static void impimirResultado(String valor){
        System.out.println(valor);
    }

    // determinar que dado un numero indicar si es positivo, negativo, cero
    public static String determinarNumero(int num){
        String resultado = "";
        if(num > 0){
            resultado = "El numero es positivo";
        }else if(num < 0){
            resultado = "El numero es negativo";
        }else if(num == 0){
            resultado = "El numero es CERO";
        }
        return resultado;
    }

    // ingresar numero
    public static int ingresarNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = scanner.nextInt();
        return num;
    }

    // main
    public static void main(String[] args) {
        int valor = ingresarNumero();
        impimirResultado(determinarNumero(valor));
    }


    
}
