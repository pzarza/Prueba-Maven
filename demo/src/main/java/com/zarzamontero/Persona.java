package com.zarzamontero;

/**
 * La clase Persona
 */
public class Persona {
    String nombre;
    int edad;

    /**
     * Constructor con parámetros
     * @param nombre
     * @param edad
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    /**
     * getter de nombre
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
