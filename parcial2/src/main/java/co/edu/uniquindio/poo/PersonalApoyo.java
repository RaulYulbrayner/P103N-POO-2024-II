package co.edu.uniquindio.poo;

public abstract class PersonalApoyo extends Persona {
    
    public PersonalApoyo(String nombre, String cedula, String direccion, String telefono) {
        super(nombre, cedula, direccion, telefono);
    }

    @Override
    public String toString() {
        return "PersonalApoyo: " + super.toString();
    }

    public abstract double calcularCostoConsulta();
}
