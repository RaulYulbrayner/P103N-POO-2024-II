package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Estudiante estudiante = new Estudiante("Raul", "Rivera", "1222", "r@", "3111", 30);

        Estudiante estudiante2 = new Estudiante("Yulbraynner", "Rivera", "1222", "r@", "3111", 30);

        Estudiante estudiant3 = new Estudiante("Juliana", "Rivera", "1222", "r@", "3111", 30);

        System.out.println(estudiante.toString());
        System.out.println(estudiante2.toString());
        System.out.println(estudiant3.toString());
    }
}
