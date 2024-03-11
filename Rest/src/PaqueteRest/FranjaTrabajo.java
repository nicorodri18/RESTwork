package PaqueteRest;

import java.time.LocalTime;
import java.util.List;
import java.time.DayOfWeek;

public class FranjaTrabajo {

    private LocalTime horaApertura;
    private LocalTime horaCierre;
    private List<DayOfWeek> diasTrabajo;

    // Constructor
    public FranjaTrabajo(LocalTime horaApertura, LocalTime horaCierre, List<DayOfWeek> diasTrabajo) {
        this.horaApertura = horaApertura;
        this.horaCierre = horaCierre;
        this.diasTrabajo = diasTrabajo;
    }

    // Getters y Setters

    public LocalTime getHoraApertura() {
        return horaApertura;
    }

    public void setHoraApertura(LocalTime horaApertura) {
        this.horaApertura = horaApertura;
    }

    public LocalTime getHoraCierre() {
        return horaCierre;
    }

    public void setHoraCierre(LocalTime horaCierre) {
        this.horaCierre = horaCierre;
    }

    public List<DayOfWeek> getDiasTrabajo() {
        return diasTrabajo;
    }

    public void setDiasTrabajo(List<DayOfWeek> diasTrabajo) {
        this.diasTrabajo = diasTrabajo;
    }
}
