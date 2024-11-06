package co.edu.uniquindio.poo;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        Dispositivo televisor = new Televisor("Samsung", 100);
        Dispositivo radio = new Radio("LG", 100);

        Televisor televisor1 = new Televisor("Samsung", 100);
        Radio radio1 = new Radio("LG", 100);

        televisor.importar();
        radio.importar();

        radio1.prender();
        radio1.apagar();
        
        televisor1.prender();
        televisor1.apagar();

    }
}
