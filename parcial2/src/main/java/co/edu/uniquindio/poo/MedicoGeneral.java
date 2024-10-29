package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class MedicoGeneral extends PersonalApoyo {
    private LinkedList<Tratamiento> tratamientos;

    public MedicoGeneral(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
        tratamientos = new LinkedList<>();
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costoTotal = 30000;
        for (Tratamiento tratamiento : tratamientos) {
            costoTotal += tratamiento.getCosto();
        }
        return costoTotal;
    }

    public String toString() {
        return "MedicoGeneral: " + super.toString() + ", Tratamientos: " + tratamientos;
    }
}
