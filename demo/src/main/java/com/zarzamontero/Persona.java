package com.zarzamontero;

/**
 * La clase Persona
 */
public class Persona {
    String nombre;
    int edad;

    /**
     * Constructor con parámetros
     * 
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public static Persona factory(String cadena) {
        if (cadena == null) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }
        String partes[] = cadena.split(",");
        if (partes.length != 2) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }
        try {
            int e = Integer.parseInt(partes[1]);
            return new Persona(partes[0], e);
        } catch (Exception e) {
            throw new IllegalArgumentException("Argumentos inválidos");
        }
    }

    /**
     * getter de nombre
     * 
     * @return el nombre de la persona
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

}
