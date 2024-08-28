package co.edu.uniquindio.poo;

public class Estudiante {

    public String nombre;
    public String apellido;
    public String numeroIdentificacion;
    public String correo;
    public String telefono;
    public int edad;

    public Estudiante(String nombre, String apellido, String numeroIdentificacion, String correo, String telefono, int edad){
        this.nombre=nombre;
        this.apellido=apellido;
        this.numeroIdentificacion=numeroIdentificacion;
        this.correo=correo;
        this.telefono=telefono;
        this.edad=edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getNumeroIdentificacion() {
        return numeroIdentificacion;
    }

    public void setNumeroIdentificacion(String numeroIdentificacion) {
        this.numeroIdentificacion = numeroIdentificacion;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante [nombre=" + nombre + ", apellido=" + apellido + ", numeroIdentificacion="
                + numeroIdentificacion + ", correo=" + correo + ", telefono=" + telefono + ", edad=" + edad + "]";
    }


    
    
    

    
}
