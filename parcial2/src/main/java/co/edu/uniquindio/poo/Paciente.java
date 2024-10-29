package co.edu.uniquindio.poo;

import java.util.LinkedList;
import java.util.List;

public class Paciente extends Persona {
    private List<Consulta> consultas;

    public Paciente(String nombre, String cedula, String email, String direccion, String fechaNacimiento) {
        super(nombre, cedula, direccion, email);
        this.consultas = new LinkedList<>();
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public List<Consulta> getConsultas() {
        return consultas;
    }

    @Override
    public String toString() {
        return "Paciente: " + super.toString();
    }
}
