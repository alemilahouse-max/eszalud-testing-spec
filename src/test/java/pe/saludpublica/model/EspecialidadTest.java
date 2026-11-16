
package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EspecialidadTest {

    @Test
    @DisplayName("ESP-001: Crear especialidad con datos válidos")
    void shouldCreateSpecialtyWithValidData() {

        Especialidad especialidad = new Especialidad(
                "Cardiología",
                "Diagnóstico y tratamiento de enfermedades del corazón"
        );

        assertNotNull(especialidad);
        assertEquals("Cardiología", especialidad.getNombre());
        assertEquals(
                "Diagnóstico y tratamiento de enfermedades del corazón",
                especialidad.getDescripcion()
        );
    }

    @Test
    @DisplayName("ESP-002: Crear especialidad sin nombre")
    void shouldRejectSpecialtyWithoutName() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Especialidad(
                        null,
                        "Diagnóstico y tratamiento de enfermedades del corazón"
                )
        );
    }

}