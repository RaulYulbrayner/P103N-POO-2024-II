package co.edu.uniquindio.poo;

import java.util.LinkedList;

public class Parcial1 {

    public static void mostrarMensaje(String mensaje) {
        System.out.println(mensaje);
    }

    public static void main(String[] args) {

        Gimnasio gimnasio = new Gimnasio("Bodytech");

        // Se crean los miembros
        Miembro miembro1 = new Miembro("Carlos", 16, "Masculino", Tipo_membresia.MENSUAL);

        Miembro miembro2 = new Miembro("Raul", 20, "Masculino", Tipo_membresia.ANUAL);

        Miembro miembro3 = new Miembro("Maria", 19, "Femenino", Tipo_membresia.ANUAL);

        // Se crean los entrenadores
        Entrenador jorge = new Entrenador("Jorge", "Pesas", 34346, "jorge@gmail.com");
        Entrenador camilo = new Entrenador("Camilo", "barras", 311434446, "camilo@gmail.com");
        Entrenador oscar = new Entrenador("Oscar", "barras", 3114846, "oscar@gmail.com");

        // Se agregan los miembros al gimnasio
        gimnasio.agregarMiembro(miembro1);
        gimnasio.agregarMiembro(miembro2);
        gimnasio.agregarMiembro(miembro3);

        // Se agregan los entrenadores al gimnasio
        gimnasio.agregarEntrenador(jorge);
        gimnasio.agregarEntrenador(camilo);
        gimnasio.agregarEntrenador(oscar);

        // Se vinculan los miembros al entrenador
        camilo.agregarMiembroAEntrenador(miembro2);

        // --------------------Solución parcial 1------------------------

        // Punto A
        mostrarMensaje("La cantidad de miembros con membresía anual que son mayores de edad es: "
                + gimnasio.contarMiembrosMembresiaAnualMayoresEdad());

        // Punto B
        LinkedList<Entrenador> entrenadorTelefono = gimnasio.agregarEntrenadorConSumaTelefono();
        System.out.println("Los entrenadores con la suma de 30 en su telefono son:");
        for (Entrenador entrenador : entrenadorTelefono) {
            System.out.println(entrenador);
        }

        // Punto C
        gimnasio.invertirNombresMenoresEdad();
        System.out.println("Nombres invertidos (para menores de edad) son: ");
        for (Miembro miembro : gimnasio.getMiembros()) {
            System.out.println(miembro.getNombre());
        }

        // --------------------Fin Solución parcial 1--------------------

    }

}
