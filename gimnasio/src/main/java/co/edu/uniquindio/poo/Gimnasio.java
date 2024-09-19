package co.edu.uniquindio.poo;

import java.time.LocalDate;
import java.util.LinkedList;

public class Gimnasio {
    private String nombre;
    private LinkedList<Miembro> miembros;
    private LinkedList<Entrenador> entrenadores;

    public Gimnasio(String nombre) {
        this.nombre = nombre;
        miembros = new LinkedList<>();
        entrenadores = new LinkedList<>();
    }

    public void agregarMiembro(Miembro miembro) {
        if (!verificarMiembro(miembro.getNombre())) {
            miembros.add(miembro);
        }
    }

    public boolean verificarMiembro(String nombre) {
        boolean centinela = false;
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void agregarEntrenador(Entrenador entrenador) {
        if (!verificarEntrenador(entrenador.getCorreo())) {
            entrenadores.add(entrenador);
        }
    }

    public boolean verificarEntrenador(String correo) {
        boolean centinela = false;
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                centinela = true;
            }
        }
        return centinela;
    }

    public void eliminarMiembro(String nombre) {
        for (Miembro miembro : miembros) {
            if (miembro.getNombre().equals(nombre)) {
                miembros.remove(miembro);
                break;
            }
        }
    }

    public void eliminarEntrenador(String correo) {
        for (Entrenador entrenador : entrenadores) {
            if (entrenador.getCorreo().equals(correo)) {
                entrenadores.remove(entrenador);
                break;
            }
        }
    }

    // --------------------------------------------------------------
    // Pilas metodos nuevos del taller

    /**
     * Metodo que muestra los nombres de los miembros de la lista en orden inverso
     */
    public void listaNombresInverso() {
        for (int i = miembros.size() - 1; i >= 0; i--) {
            Miembro miembro = miembros.get(i);
            miembro.getNombre();
        }
    }

    /**
     * Metodo que crea una lista de miembros que son menores de 18 años.
     * 
     * @return Una lista de objetos cuya edad es menor de 18 años.
     */
    public LinkedList<Miembro> obtenerMenoresEdad() {
        LinkedList<Miembro> menores = new LinkedList<>();
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                menores.add(miembro);
            }
        }
        return menores;
    }
    // --------------------------------------------------------------

    // --------------------Completar los metodos---------------------

    /*
     * - eliminarNombreVocal()
     * - determinarVocal()
     * - edadComun()
     */

    // --------------------Completar---------------------------------

    /**
     * Metodo que permitte calcular el promedio de las edades
     * 
     * @return
     */
    public double calcularPromedio() {
        double promedio = 0;
        int contador = 0;
        for (Miembro miembro : miembros) {
            promedio += miembro.getEdad();
            contador++;
        }
        promedio = promedio / contador;
        return promedio;
    }

    public double calcularPromedio2() {
        double promedio = 0;
        for (Miembro miembro : miembros) {
            promedio += miembro.getEdad();
        }
        promedio /= miembros.size();
        return promedio;
    }

    /*
     * Metodo que determina la edad comun
     * 
     * @param edad
     * 
     * @return edadAnalisis
     */
    /*
     * public int edadComun(String edad) {
     * int[] listaEdades = new int[miembros.size()];
     * for (Miembro miembro : miembros) {
     * listaEdades.add(miembro.getEdad());
     * }
     * int edadAnalisis = 0;
     * int maxRepite = 0;
     * for (int i = 0; i < listaEdades.length; i++) {
     * int tmpEdad = listaEdades[i];
     * int tmpRepite = 0;
     * for (int j = i + 1; j < listaEdades.length; j++) {
     * if (tmpEdad == listaEdades[j]) {
     * tmpRepite += 1;
     * }
     * 
     * }
     * 
     * if (tmpEdad == listaEdades[j]) {
     * maxRepite = tmpRepite;
     * edadAnalisis = tmpEdad;
     * }
     * 
     * return edadAnalisis;
     * }
     * }
     */

    /**
     * 
     * @return
     */
    // --- mI>20
    public int obtenerEdadComun() {
        // 20
        int edadComun = 0;
        int contadorEdadComun = 0;

        for (Miembro prueba : miembros) {

            int contador = 0;

            // 16
            int repetido = prueba.getEdad();

            for (Miembro pruebaDos : miembros) {
                // 16 == 16
                if (pruebaDos.getEdad() == repetido) {
                    // 2
                    contador++;
                }
            }
            // 2 > 1
            if (contador > contadorEdadComun) {
                // 16 = 16
                edadComun = repetido;
                // 1 = 2
                contadorEdadComun = contador;
            }
        }
        // 16
        return edadComun;
    }

    // --------------------Solución parcial 1------------------------

    /**
     * Método que permita contar la cantidad de miembros que tienen una membresía
     * anual y son mayores de edad.
     */
    public int contarMiembrosMembresiaAnualMayoresEdad() {
        int contadorAnual = 0;
        for (Miembro miembro : miembros) {
            if (miembro.getMembresia() == Tipo_membresia.ANUAL && miembro.getEdad() > 18) {
                contadorAnual++;
            }
        }
        return contadorAnual;
    }

    /**
     * Método que agregue a una lista los nombres de aquellos entrenadores cuyo
     * número de teléfono, al sumar los dígitos, sea igual a 30. Ejemplo: "Carlos"
     * tiene el número de teléfono 311434446, la suma de los dígitos
     * (3+1+1+4+3+4+4+4+6) es 30.
     * 
     * @return lista de miembros que los digitos suman 30
     */
    public LinkedList<Entrenador> agregarEntrenadorConSumaTelefono() {
        LinkedList<Entrenador> entrenadorConSuma = new LinkedList<>();
        for (Entrenador entrenador : entrenadores) {
            int telefono = entrenador.getTelefono();
            int sumaDigitos = 0;

            for (int i = telefono; i > 0; i /= 10) {
                sumaDigitos += i % 10;
            }

            if (sumaDigitos == 30) {
                entrenadorConSuma.add(entrenador);
            }
        }
        return entrenadorConSuma;
    }

    /**
     * Método que permita invertir el nombre de cada uno de los miembros de la lista
     * de miembros que son menores de edad. Ejemplo: raul -> luar
     */
    public void invertirNombresMenoresEdad() {
        for (Miembro miembro : miembros) {
            if (miembro.getEdad() < 18) {
                String nombre = miembro.getNombre();
                String nombreInvertido = "";

                for (int i = nombre.length() - 1; i >= 0; i--) {
                    nombreInvertido += nombre.charAt(i);
                }

                miembro.setNombre(nombreInvertido);
            }
        }
    }

    // --------------------Fin Solución parcial 1--------------------

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public LinkedList<Miembro> getMiembros() {
        return miembros;
    }

    public void setMiembros(LinkedList<Miembro> miembros) {
        this.miembros = miembros;
    }

    public LinkedList<Entrenador> getEntrenadores() {
        return entrenadores;
    }

    public void setEntrenadores(LinkedList<Entrenador> entrenadores) {
        this.entrenadores = entrenadores;
    }

    @Override
    public String toString() {
        return "Gimnasio [nombre=" + nombre + ", miembros=" + miembros + ", entrenadores=" + entrenadores + "]";
    }

}
