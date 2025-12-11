package com.zarzamontero;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Test;

public class PersonaTest {
    @Test
    void testFactory() {
        String input = "Juan,25";
        Persona persona = Persona.factory(input);
        assertNotNull(persona);
        assertEquals("Juan", persona.getNombre());
        assertEquals(25, persona.getEdad());
    }

    @Test
    void fromString_ShouldThrowException_WhenInputIsNull() {
        String input = null;
        assertThrows(IllegalArgumentException.class, () -> Persona.factory(input));
    }
}
