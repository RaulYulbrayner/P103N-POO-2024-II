package co.edu.uniquindio.poo;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        // Se crea el gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Carlos", 20, "Masculino", "12345", Tipo_membresia.MENSUAL);
        Miembro miembro2 = new Miembro("Mario", 17, "Masculino", "1235", Tipo_membresia.ANUAL);

        // Se crean los entrenadores
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", "1234", "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        // Devolver lista con nombre invertidos
        gimnasio.mostrarMensaje("Lista Nombres Invertidos");
        gimnasio.listaNombresInverso();

        // Obtener los miembros menores de edad
        LinkedList<Miembro> menores = gimnasio.obtenerMenoresEdad();

        // Imprimir los miembros menores de edad
        System.out.println("Miembros menores de edad:");
        for (Miembro miembro : menores) {
            System.out.println(miembro);
        }

        System.out.println(gimnasio);

    }
}