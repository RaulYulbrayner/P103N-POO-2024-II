package co.edu.uniquindio.poo;

public class Miembro {
    private String nombre;
    private int edad;
    private String genero;
    private String cedula;
    private Tipo_membresia tipo_membresia;

    /**
     * Metodo constructor de la miembro
     * @param nombre del miembro
     * @param edad
     * @param genero
     * @param cedula
     * @param membresia
     */
    public Miembro(String nombre, int edad, String genero, String cedula, Tipo_membresia tipo_membresia) {
        this.nombre = nombre;
        this.edad = edad;
        this.genero = genero;
        this.cedula = cedula;
        this.tipo_membresia = tipo_membresia;
    }

    /**
     * Metodo toString de la clase miembro
     */
    @Override
    public String toString() {
        return "Miembro [nombre=" + nombre + ", edad=" + edad + ", genero=" + genero + ", cedula=" + cedula
                + ", membresia=" + tipo_membresia + "]";
    }

    /**
     * Metodo para obtener el nombre de un miembro
     * 
     * @return nombre
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public Tipo_membresia getMembresia() {
        return tipo_membresia;
    }

    public void setMembresia(Tipo_membresia membresia) {
        this.tipo_membresia = membresia;
    }

}