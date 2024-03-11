package PaqueteRest;

import java.time.LocalDateTime;

public class ReservaCita {

    private LocalDateTime fechaHora;
    private Servicio servicio;
    private Estilista estilista;

    // Constructor
    public ReservaCita(LocalDateTime fechaHora, Servicio servicio, Estilista estilista) {
        this.fechaHora = fechaHora;
        this.servicio = servicio;
        this.estilista = estilista;
    }

    // Getters y Setters

    public LocalDateTime getFechaHora() {
        return fechaHora;
    }

    public void setFechaHora(LocalDateTime fechaHora) {
        this.fechaHora = fechaHora;
    }

    public Servicio getServicio() {
        return servicio;
    }

    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

    public Estilista getEstilista() {
        return estilista;
    }

    public void setEstilista(Estilista estilista) {
        this.estilista = estilista;
    }
}
