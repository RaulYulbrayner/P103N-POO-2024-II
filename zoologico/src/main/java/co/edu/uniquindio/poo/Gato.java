package co.edu.uniquindio.poo;

public class Gato extends Animal {

    /**
     * 
     * @param nombre
     * @param color
     * @param edad
     */
    public Gato(String nombre, String color, int edad) {
        super(nombre, color, edad);
    }

    /**
     * 
     */
    @Override
    public void dormir() {
        System.out.println("Gato zZzZzZz");
    }

    /**
     * 
     */
    @Override
    public void comer() {
        System.out.println("Gato comiendo...");
    }

    /**
     * 
     */
    @Override
    public void hacerSonido() {
        System.out.println("Miau Miau Miauuuuuu");
    }

    @Override
    public String toString() {
        return "Gato:" + super.toString();
    }

}
