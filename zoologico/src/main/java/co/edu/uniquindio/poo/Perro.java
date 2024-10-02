package co.edu.uniquindio.poo;

public class Perro extends Animal {

    public Perro(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }

    @Override
    public void dormir() {
        System.out.println("Perro zZzZzZz");
    }

    @Override
    public void comer() {
        System.out.println("Perro comiendo...");
    }

    @Override
    public void hacerSonido() {
        System.out.println("Guau Guau Guauuuuuu");
    }

    @Override
    public String toString() {
        return "Perro:" + super.toString();
    }
    
}
