package co.edu.uniquindio.poo;

public class Cirujano extends PersonalApoyo {
    private int intervencionesRealizadas;

    public Cirujano(String nombre, String cedula, String direccion, String telefono, int intervencionesRealizadas) {
        super(nombre, cedula, direccion, telefono);
        this.intervencionesRealizadas = intervencionesRealizadas;
    }

    @Override
    public double calcularCostoConsulta() {
        return 100000 + (intervencionesRealizadas * 50000);
    }

    @Override
    public String toString() {
        return "Cirujano: " + super.toString() + ", Intervenciones Realizadas: " + intervencionesRealizadas;
    }
}
