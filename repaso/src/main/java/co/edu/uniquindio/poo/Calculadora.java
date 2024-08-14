package co.edu.uniquindio.poo;

import java.util.Scanner;

/**
 * Hello world!
 *
 */
public class Calculadora {

    /**
     * Metodo que permite sumar dos valores
     * 
     * @param valor de referencia 1
     * @param valor de referencia 2
     * @return resultado de la suma
     */
    public static double sumar(int numA, int numB) {
        int resultado = numA + numB;
        return resultado;
    }

    public static double restar(int numA, int numB) {
        int resultado = numA - numB;
        return resultado;
    }

    public static double multiplicar(int numA, int numB) {
        int resultado = numA * numB;
        return resultado;
    }

    public static double dividir(int numA, int numB) {
        int resultado = numA / numB;
        return resultado;
    }

    public static void calcular(char operacion, int numA, int numB) {
        switch (operacion) {
            case '+':
                System.out.println(sumar(numA, numB));
                break;
            case '-':
                System.out.println(restar(numA, numB));
                break;
            case '*':
                System.out.println(multiplicar(numA, numB));
                break;
            case '/':
                System.out.println(dividir(numA, numB));
                break;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Por favor ingrese la operacion que desea realizar:");
        System.out.println("1. Suma");
        System.out.println("2. Resta");
        System.out.println("3. Multiplicación");
        System.out.println("4. División");
        System.out.println("5. Salir");
        char operacion = scanner.nextLine().charAt(0); 

        System.out.println("Ingrese el valor 1");
        int numA = scanner.nextInt();

        System.out.println("Ingrese el valor 2");
        int numB = scanner.nextInt();

        calcular(operacion, numA, numB);

    }

    /*public static void main(String[] args) {
        int operacion = 1;
        int a = 10;
        int b = 5;
        calcular(3, 5, 5);
    }*/
}
