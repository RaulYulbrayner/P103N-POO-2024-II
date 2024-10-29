package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Clinica {
    private String nombre;
    private LinkedList<Consulta> consultas;
    private LinkedList<PersonalApoyo> personas;

    public Clinica(String nombre) {
        this.nombre = nombre;
        this.consultas = new LinkedList<>();
        this.personas = new LinkedList<>();
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Consulta> getConsultas() {
        return consultas;
    }

    public LinkedList<PersonalApoyo> getPersonas() {
        return personas;
    }

    public void agregarConsulta(Consulta consulta) {
        consultas.add(consulta);
    }

    public void eliminarConsulta(Consulta consulta) {
        consultas.remove(consulta);
    }

    public void agregarPersona(PersonalApoyo persona) {
        personas.add(persona);
    }

    public void eliminarPersona(PersonalApoyo persona) {
        personas.remove(persona);
    }

    @Override
    public String toString() {
        return "Empresa [nombre=" + nombre + ", consultas=" + consultas + ", personas=" + personas + "]";
    }
}
