package com.ejemplo;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Clase Main que contiene el método principal para ejecutar la aplicación.
 * 
 * @author alina
 * @version 1.0
 * @since 2025-02-18
 * @see Alumno
 * @see Persona
 * @apiNote Esta clase sirve solo para probar las clases Persona, Alumno y Profesor.
 * @implNote Este método sirve para ejecutar un programa de prueba con las clases Persona, Alumno y Profesor.
 * @implSpec Se espera que las clases Persona, Alumno y Profesor estén disponibles en el mismo proyecto.
 */


public class Main {
    /**
     * Método principal que ejecuta la aplicación.
     * 
     * @param args Argumentos de la línea de comandos (no utilizados en este caso).
     * @throws IllegalArgumentException Si se proporcionan argumentos no válidos.
     * @throws NullPointerException Si ocurre un error de puntero nulo.
     * @see Persona
     * @see Alumno
     * @see Profesor
     * @implNote Este método crea instancias de Persona, Alumno y Profesor, y las serializa/deserializa.
     */

     
    public static void main(String[] args) {
        try {
            // Crear instancias
            Persona persona = new Persona("Carlos", 30);
            Alumno alumno = new Alumno("Ana", 20, "A12345");
            Profesor profesor = new Profesor("Luis", 45, "Matemáticas");

            // Imprimir la información
            System.out.println(persona.toString());
            System.out.println(alumno.toString());
            System.out.println(profesor.toString());

            // Serializar objetos
            try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("persona.dat"))) {
                out.writeObject(persona);
                out.writeObject(alumno);
                out.writeObject(profesor);
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Deserializar objetos
            try (ObjectInputStream in = new ObjectInputStream(new FileInputStream("persona.dat"))) {
                Persona deserializedPersona = (Persona) in.readObject();
                Alumno deserializedAlumno = (Alumno) in.readObject();
                Profesor deserializedProfesor = (Profesor) in.readObject();
                System.out.println("Deserializados: " + deserializedPersona);
                System.out.println("Deserializados: " + deserializedAlumno);
                System.out.println("Deserializados: " + deserializedProfesor);
            } catch (IOException | ClassNotFoundException e) {
                e.printStackTrace();
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}