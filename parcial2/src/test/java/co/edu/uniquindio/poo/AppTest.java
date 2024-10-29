/**
 * Clase para probar el funcionamiento del código
 * @author Área de programación UQ
 * @since 2023-08
 * 
 * Licencia GNU/GPL V3.0 (https://raw.githubusercontent.com/grid-uq/poo/main/LICENSE) 
 */
package co.edu.uniquindio.poo;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertIterableEquals;

import java.util.logging.Logger;
import org.junit.jupiter.api.Test;
import java.util.LinkedList;
import java.util.List;

/**
 * Unit test for simple App.
 */
public class AppTest {
    private static final Logger LOG = Logger.getLogger(AppTest.class.getName());

    /**
     * Rigorous Test :-)
     */
    @Test
    public void testCalcularCostoConsulta() {
        MedicoGeneral medico = new MedicoGeneral("Dr. Juan", "12345678", "Calle Salud", "555-1234");
        Tratamiento tratamiento1 = new Tratamiento("Toma de presión", "10/10/2024", 5000);
        Tratamiento tratamiento2 = new Tratamiento("Chequeo de peso", "10/10/2024", 5000);

        medico.agregarTratamiento(tratamiento1);
        medico.agregarTratamiento(tratamiento2);

        int tratamientos = 2;
        double costoEsperado = 30000 + (5000 * tratamientos);
        double costoReal = medico.calcularCostoConsulta();

        assertEquals(costoEsperado, costoReal, "El costo de la consulta no es el esperado.");
    }

    public void testObtenerCirugiasMayor3() {
        Cirujano cirujano1 = new Cirujano("Dr. Yulbraynner", "87654321", "Calle Cirugía", "555-5678", 4);
        Cirujano cirujano2 = new Cirujano("Dr. Raul", "23456789", "Calle Salud", "555-6789", 2);

        List<Cirujano> cirujanos = new LinkedList<>();
        cirujanos.add(cirujano1);
        cirujanos.add(cirujano2);

        List<Cirujano> cirugiasConMasDe3Intervenciones = new LinkedList<>();
        for (Cirujano cirujano : cirujanos) {
            if (cirujano.getIntervencionesRealizadas() > 3) {
                cirugiasConMasDe3Intervenciones.add(cirujano);
            }
        }

        List<Cirujano> expectedCirujanos = List.of(cirujano1);

        assertIterableEquals(expectedCirujanos, cirugiasConMasDe3Intervenciones,
                "Se esperaba que solo el Dr. Yulbraynner tuviera más de 3 intervenciones.");
    }

}