package co.edu.uniquindio.poo;

public class Quiz {

    /*
     * Escribe un método en Java que reciba un número
     * entero positivo y calcule la suma de todos los
     * números iniciado en 1 hasta el número ingresado
     * ej: numero ingresado 5, el resultado es: 15
     * 12345
     */

     public static int sumarNumeros(int num){
        int suma = 0;
        for(int i = 0; i <= num; i++){
            suma+=i;
        }
        return suma;
     }

     public static void main(String[] args) {
        int num = 100;
        System.out.println(sumarNumeros(num));
     }

}
