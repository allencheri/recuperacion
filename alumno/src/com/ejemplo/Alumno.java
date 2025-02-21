package com.ejemplo;
/**
 * Clase Alumno que hereda de Persona y representa a un alumno en particular.
 * <p>
 * Esta clase extiende a Persona para añadir atributos relacionados con los alumnos, como su matrícula.
 * </p>
 * 
 * Para más información sobre la clase Persona, vea  {@docRoot}/com/ejemplo/Persona.html.
 *
 * @author alina
 * @version 1.0
 * @since 2025-02-18
 * @see Persona
 * @see {@link Alumno#getMatricula()}
 * @implSpec Este método sobrescribe el método toString de la clase Persona.
 */
public class Alumno extends Persona {
    private String matricula;

    /**
     * Constructor de la clase Alumno.
     * 
     * @param nombre Nombre del alumno.
     * @param edad Edad del alumno.
     * @param matricula Matrícula del alumno.
     * @throws IllegalArgumentException Si la matrícula es nula o vacía.
     * @throws IllegalArgumentException Si la edad es menor que 0.
     * @see Persona#Persona(String, int)
     */
    public Alumno(String nombre, int edad, String matricula) {
        super(nombre, edad);
        if (matricula == null || matricula.trim().isEmpty()) {
            throw new IllegalArgumentException("La matrícula no puede estar vacía.");
        }
        this.matricula = matricula;
    }

    /**
     * Obtiene la matrícula del alumno.
     * 
     * @return La matrícula del alumno.
     */
    public String getMatricula() {
        return matricula;
    }

    /**
     * Representa al alumno como una cadena de texto.
     * <p>
     * Ejemplo de uso de la etiqueta {@literal @literal +*<>}
     * </p>
     * 
     * {@inheritDoc}
     * @deprecated El formato será cambiado en futuras versiones.
     */
    @Override
    @Deprecated
    public String toString() {
        return "Alumno [nombre=" + getNombre() + ", edad=" + getEdad() + ", matricula=" + matricula + "]";
    }
}
