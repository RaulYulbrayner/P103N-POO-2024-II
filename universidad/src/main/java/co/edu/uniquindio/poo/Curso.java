package co.edu.uniquindio.poo;

import java.util.Collection;
import java.util.LinkedList;

public class Curso {
    
    private String nombre;
    private double notaDef;
    private Profesor profesor;
    public Collection<Estudiante> estudiantes;


    public Curso(String nombre, double notaDef, Profesor profesor) {
        this.nombre = nombre;
        this.notaDef = notaDef;
        this.profesor = profesor;
        estudiantes = new LinkedList<>();
    }

    /*calcularNotaDe(notas)
    - agregarEstudiante(Estudiante)
    - verificarEstudiante(double cedula)
    - eliminarEstudiante(double cedula)*/





    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }


    public double getNotaDef() {
        return notaDef;
    }


    public void setNotaDef(double notaDef) {
        this.notaDef = notaDef;
    }


    public Profesor getProfesor() {
        return profesor;
    }


    public void setProfesor(Profesor profesor) {
        this.profesor = profesor;
    }


    public Collection<Estudiante> getEstudiantes() {
        return estudiantes;
    }


    public void setEstudiantes(Collection<Estudiante> estudiantes) {
        this.estudiantes = estudiantes;
    }

    


    



}
