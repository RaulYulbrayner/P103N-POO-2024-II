package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Gato gato = new Gato("Tom", "Gris", 2);
        System.out.println(gato.toString());
        gato.comer();
        gato.dormir();
        gato.hacerSonido();
        System.out.println("----------------------");
        Perro perro = new Perro("Nina", "Cafe", 3);
        System.out.println(perro.toString());
        perro.comer();
        perro.dormir();
        perro.hacerSonido();

    }
}
