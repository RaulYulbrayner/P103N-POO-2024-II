package co.edu.uniquindio.poo;

public class Tabla {

    public static void tablas(){
        for(int i = 1; i<=10; i++){
            System.out.println("Las tablas de multiplicar de: " + i);
            for(int j = 1; j<=10; j++){
                System.out.println(i + " X " + j + " = " + (i*j));
            }
        }
    }

    public static void main(String[] args) {
        tablas();
    }
    
}
