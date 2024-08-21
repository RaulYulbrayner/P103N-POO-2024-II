package co.edu.uniquindio.poo;

import java.util.Scanner;

public class Matriz {

    /**
     * Metodo que permite captuar el valor ingresado por el usuario
     * @return
     */
    public static int ingresarNumero(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese el numero");
        int num = scanner.nextInt();
        return num;
    }

    /**
     * Metodo que permite marcar con 1 la diagonal principal de cualquier matriz
     * @param matriz
     * @return 
     */
    public static void matrizDiagonal(int[][] matriz){
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz.length; j++){
                if(i == j){
                    matriz[i][j]=1;
                }
            }
        }
    }
    
    // imprimir matriz
    public static void imprimirMatriz(int[][] matriz){
        for(int i = 0; i<matriz.length; i++){
            for(int j = 0; j<matriz[i].length; j++){
                    System.out.print(matriz[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int valor = ingresarNumero();
        int[][] matriz = new int[valor][valor];
        matrizDiagonal(matriz);
        imprimirMatriz(matriz);
    }
    
}
