package co.edu.uniquindio.poo;

public class Tratamiento {
    private String nombre;
    private String fecha;
    private double costo;

    public Tratamiento(String nombre, String fecha, double costo) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Tratamiento [nombre=" + nombre + ", fecha=" + fecha + ", costo=" + costo + "]";
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

}
