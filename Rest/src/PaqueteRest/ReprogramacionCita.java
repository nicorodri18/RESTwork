package PaqueteRest;

import java.time.LocalDateTime;

public class ReprogramacionCita {

    private LocalDateTime nuevaFechaHora;

    // Constructor
    public ReprogramacionCita(LocalDateTime nuevaFechaHora) {
        this.nuevaFechaHora = nuevaFechaHora;
    }

    // Getters y Setters

    public LocalDateTime getNuevaFechaHora() {
        return nuevaFechaHora;
    }

    public void setNuevaFechaHora(LocalDateTime nuevaFechaHora) {
        this.nuevaFechaHora = nuevaFechaHora;
    }
}
