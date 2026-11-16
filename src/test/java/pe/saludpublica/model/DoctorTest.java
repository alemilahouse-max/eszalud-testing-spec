
package pe.saludpublica.model;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DoctorTest {

    @Test
    @DisplayName("DOC-001: Crear doctor con datos válidos")
    void shouldCreateDoctorWithValidData() {

        Doctor doctor = new Doctor(
                "12345678",
                "Carlos",
                "Ramírez",
                "CMP12345",
                "ESP001"
        );

        assertNotNull(doctor);
        assertEquals("12345678", doctor.getDocumento());
        assertEquals("Carlos", doctor.getNombres());
        assertEquals("Ramírez", doctor.getApellidos());
        assertEquals("CMP12345", doctor.getColegiatura());
        assertEquals("ESP001", doctor.getEspecialidad());
    }

    @Test
    @DisplayName("DOC-002: Crear doctor sin documento")
    void shouldRejectDoctorWithoutDocument() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Doctor(
                        null,
                        "Carlos",
                        "Ramírez",
                        "CMP12345",
                        "ESP001"
                )
        );
    }

    @Test
    @DisplayName("DOC-003: Crear doctor sin nombres")
    void shouldRejectDoctorWithoutNames() {

        assertThrows(
                IllegalArgumentException.class,
                () -> new Doctor(
                        "12345678",
                        null,
                        "Ramírez",
                        "CMP12345",
                        "ESP001"
                )
        );
    }

}