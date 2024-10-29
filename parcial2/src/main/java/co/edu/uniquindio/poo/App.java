package co.edu.uniquindio.poo;

public class App {
    public static void main(String[] args) {
        // Crear personal médico
        MedicoGeneral medicoGeneral = new MedicoGeneral("Dr. Raul", "12345678", "Calle Salud", "555-1234");
        Cirujano cirujano = new Cirujano("Dr. Yulbraynner", "87654321", "Calle Cirugía", "555-5678", 5);
        Especialista especialista = new Especialista("Dr. Juliana", "23456789", "Calle Especial", "555-9101", "cardiología");

        // Crear paciente
        Paciente paciente = new Paciente("Carlos Ruiz", "98765432", "cr@gmail.com", "Calle Paciente", "555-1212");

        // Crear tratamientos
        Tratamiento tratamiento1 = new Tratamiento("Terapia física", "2024-10-01", 15000);
        Tratamiento tratamiento2 = new Tratamiento("Cirugía menor", "2024-10-05", 200000);
        Tratamiento tratamiento3 = new Tratamiento("Consulta especializada", "2024-10-10", 100000);

        // Crear consultas y asignar tratamientos
        Consulta consulta1 = new Consulta("C001", TipoConsulta.GENERAL, "2024-10-01");
        consulta1.agregarTratamiento(tratamiento1.getNombre());
        consulta1.calcularCosto(medicoGeneral);

        Consulta consulta2 = new Consulta("C002", TipoConsulta.QUIRURGICA, "2024-10-05");
        consulta2.agregarTratamiento(tratamiento2.getNombre());
        consulta2.calcularCosto(cirujano);

        Consulta consulta3 = new Consulta("C003", TipoConsulta.ESPECIALIDAD, "2024-10-10");
        consulta3.agregarTratamiento(tratamiento3.getNombre());
        consulta3.calcularCosto(especialista);

        // Agregar consultas al paciente
        paciente.agregarConsulta(consulta1);
        paciente.agregarConsulta(consulta2);
        paciente.agregarConsulta(consulta3);

        // Mostrar costos de consultas
        mostrarCostoConsultas(consulta1, consulta2, consulta3);

        // Mostrar detalles de las consultas
        mostrarDetallesConsultas(consulta1, consulta2, consulta3);
    }

    private static void mostrarCostoConsultas(Consulta... consultas) {
        for (Consulta consulta : consultas) {
            System.out.println("Costo " + consulta.getCodigo() + ": " + consulta.getCostoTotal());
        }
    }

    private static void mostrarDetallesConsultas(Consulta... consultas) {
        for (Consulta consulta : consultas) {
            System.out.println(consulta);
        }
    }
}
