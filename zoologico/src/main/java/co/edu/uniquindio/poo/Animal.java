package co.edu.uniquindio.poo;

public abstract class Animal {

    private String nombre, color;
    private int edad;

    /**
     * Metodo constructor de la clase animal
     * 
     * @param nombre
     * @param color
     * @param edad
     */
    public Animal(String nombre, String color, int edad) {
        this.nombre = nombre;
        this.color = color;
        this.edad = edad;
    }

    /*
     * Metodo para dormir de la clase animal
     */
    public abstract void dormir();

    /*
     * Metodo para comer de la clase animal
     */
    public abstract void comer();

    /*
     * Metodo para hacerSonido de la clase animal
     */
    public abstract void hacerSonido();

    /*
     * Metodo para bailar
     */
    public void bailar(){

    }

    @Override
    public String toString() {
        return "[nombre=" + nombre + ", color=" + color + ", edad=" + edad + "]";
    }

}
