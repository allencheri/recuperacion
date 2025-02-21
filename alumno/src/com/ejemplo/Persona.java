package com.ejemplo;

import java.io.*;

/**
 * Clase Persona que representa a una persona.
 * 
 * Esta clase es la base para crear objetos persona con atributos básicos
 * como el nombre y la edad.
 * 
 * 
 * @author alina
 * @version 1.2
 * @since 2025-02-18
 * @deprecated Esta clase se usará solo como base para extenderla, no se
 *             recomienda su uso directo.
 */
public class Persona implements Serializable {
    private static final long serialVersionUID = 1L; // Serialización
    private String nombre;
    private int edad;

    /**
     * Constructor de la clase Persona.
     * 
     * @param nombre Nombre de la persona.
     * @param edad   Edad de la persona.
     * @throws IllegalArgumentException Si la edad es menor que 0.
     * @see Alumno
     *      {@link Alumno#getMatricula()} para obtener la matrícula del alumno en
     *      algunos casos.
     * @implSpec Este constructor valida que la edad no sea negativa antes de
     *           asignar los valores.
     */
    public Persona(String nombre, int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * Nombre de la clase.
     * 
     * @value "Persona"
     */
    public static final String CLASE = "Persona";

    /**
     * Obtiene el nombre de la persona.
     * 
     * @return El nombre de la persona.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Obtiene la edad de la persona.
     * 
     * @hidden
     * @return La edad de la persona.
     */
    public int getEdad() {
        return edad;
    }

    /**
     * Representa a la persona como una cadena de texto.
     * 
     * @return Una cadena con el nombre y la edad de la persona.
     * @implNote Este método utiliza el formato "Persona [nombre=nombre,
     *           edad=edad]".
     * @serialData Este método escribe los datos del objeto durante la
     *             serialización.
     * @see Object#toString()
     * @since 2025-02-18
     */
    @Override
    public String toString() {
        return "Persona [nombre=" + nombre + ", edad=" + edad + "]";
    }

    /**
     * Método para serializar la persona.
     * 
     * @serialData Este método se usa para serializar el objeto Persona, guardando
     *             el nombre y la edad.
     */
    private void writeObject(ObjectOutputStream out) throws IOException {
        out.defaultWriteObject();
        System.out.println("Serializando Persona...");
    }

    /**
     * Método para deserializar la persona.
     * 
     * @serialData Este método se usa para leer los datos serializados.
     */
    private void readObject(ObjectInputStream in) throws IOException, ClassNotFoundException {
        in.defaultReadObject();
        System.out.println("Deserializando Persona...");
    }
}
