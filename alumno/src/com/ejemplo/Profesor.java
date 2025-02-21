package com.ejemplo;
/**
 * Clase Profesor que hereda de Persona y representa a un profesor en particular.
 * <p>
 * Esta clase extiende a Persona para incluir un campo de asignatura que enseña el profesor.
 * </p>
 * 
 * @author alina
 * @version 1.0
 * @since 2025-02-18
 * @see Persona
 *
 * 
 */
public class Profesor extends Persona {
    private String asignatura;

    /**
     * Constructor de la clase Profesor.
     * 
     * {inheritDoc}
     * @param nombre Nombre del profesor.
     * @param edad Edad del profesor.
     * @param asignatura Asignatura que enseña el profesor.
     * @throws IllegalArgumentException Si la asignatura es nula o vacía.
     * @see Persona#Persona(String, int)
     */
    public Profesor(String nombre, int edad, String asignatura) {
        super(nombre, edad);
        if (asignatura == null || asignatura.trim().isEmpty()) {
            throw new IllegalArgumentException("La asignatura no puede estar vacía.");
        }
        this.asignatura = asignatura;
    }

    /**
     * Obtiene la asignatura que enseña el profesor.
     * 
     * @return La asignatura que enseña el profesor.
     */
    public String getAsignatura() {
        return asignatura;
    }

    /**
     * Representa al profesor como una cadena de texto.
     * 
     * {@inheritDoc}
     * @see Persona#toString()
     */
    @Override
    public String toString() {
        return "Profesor [nombre=" + getNombre() + ", edad=" + getEdad() + ", asignatura=" + asignatura + "]";
    }
}
