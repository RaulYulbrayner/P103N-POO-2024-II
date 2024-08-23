package co.edu.uniquindio.poo;

import java.util.Scanner;

public class SumaArreglo {

    // Escribe un programa que reciba un arreglo de números enteros y calcule la
    // suma de todos sus elementos

    /**
     * Metodo que permite ingresar datos a un arreglo
     * 
     * @param tamanio del arreglo
     * @return arreglo con los datos ingresados por el usuario
     */
    public static int[] ingresarDatos(int tamanio) {
        int[] arreglo = new int[tamanio];
        for (int i = 0; i < tamanio; i++) {
            arreglo[i] = ingresarTamanio();
        }
        return arreglo;
    }

    /**
     * Metodo que permite imprimir el resultado de la suma del arreglo
     * 
     * @param suma
     */
    public static void imprimirSuma(int suma) {
        System.out.println("La suma de los elementos del arreglo es: " + suma);
    }

    /**
     * Metodo que permite sumar todos los elementos de un arreglo
     * 
     * @param arreglo de numeros enteros que se va a sumar
     * @return la suma de todos los elementos del arreglo
     */
    public static int sumarElementos(int[] arreglo) {
        int suma = 0;
        for (int i = 0; i < arreglo.length; i++) {
            suma += arreglo[i];
        }
        return suma;
    }

    /**
     * Metodo que permite al usuario ingresar el tamaño del arreglo
     * 
     * @return tamaño del arreglo ingresado por el usuario
     */
    public static int ingresarTamanio() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese un dato: ");
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int tamanio = ingresarTamanio();
        int[] arreglo = ingresarDatos(tamanio);
        int suma = sumarElementos(arreglo);
        imprimirSuma(suma);
    }

}
