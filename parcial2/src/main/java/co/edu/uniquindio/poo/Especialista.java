package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Especialista extends PersonalApoyo {
    private String area;
    private LinkedList<Tratamiento> tratamientos;

    public Especialista(String nombre, String cedula, String direccion, String telefono, String area) {
        super(nombre, cedula, direccion, telefono);
        this.area = area;
        tratamientos = new LinkedList<>();
    }

    public void agregarTratamiento(Tratamiento tratamiento) {
        tratamientos.add(tratamiento);
    }

    @Override
    public double calcularCostoConsulta() {
        double costoBase;

        // Determinar el costo base según el área
        if (area.equalsIgnoreCase("cardiología")) {
            costoBase = 80000;
        } else {
            costoBase = 160000; // Costo base para otras especialidades
        }

        double costoTotal = costoBase; // Iniciar con el costo base

        // Sumar el costo de cada tratamiento
        for (Tratamiento tratamiento : tratamientos) {
            costoTotal += tratamiento.getCosto(); // Sumar el costo de cada tratamiento
        }
        return costoTotal;
    }

    @Override
    public String toString() {
        return "Especialista: " + super.toString() + ", Área: " + area + ", Tratamientos: " + tratamientos;
    }
}
