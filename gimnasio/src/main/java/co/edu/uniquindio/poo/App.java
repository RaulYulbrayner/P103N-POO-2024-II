package co.edu.uniquindio.poo;

import java.util.LinkedList;

/**
 * Hello world!
 *
 */
public class App {

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {
        // Se crea el gimnasio
        Gimnasio gimnasio = new Gimnasio("Bodytech");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Carlos", 20, "Masculino", Tipo_membresia.MENSUAL);

        Miembro miembro2 = new Miembro("Raul", 16, "Masculino", Tipo_membresia.ANUAL);

        Miembro miembro3 = new Miembro("Maria", 16, "Femenino", Tipo_membresia.TRIMESTRAL);


        // Se crean los entrenadores
        Entrenador entrenador = new Entrenador("Jorge", "Pesas", "1234", "jorge@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(entrenador);

        // Se vinculan los miembros al entrenador
        entrenador.agregarMiembroAEntrenador(miembro2);

        // Devolver lista con nombre invertidos
        mostrarMensaje("Lista Nombres Invertidos");
        gimnasio.listaNombresInverso();

        // Obtener los miembros menores de edad
        LinkedList<Miembro> menores = gimnasio.obtenerMenoresEdad();

        // Imprimir los miembros menores de edad
        System.out.println("Miembros menores de edad:");
        for (Miembro miembro : menores) {
            System.out.println(miembro);
        }

        // Promedio de edad
        mostrarMensaje("Promedio de edad " + gimnasio.calcularPromedio());


        // Edad comun
        mostrarMensaje("La edad comun es: " + gimnasio.obtenerEdadComun());

        System.out.println(gimnasio);

    }
}