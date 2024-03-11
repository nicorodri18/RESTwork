package PaqueteRest;

public class Estilista {

    private Long id;
    private String nombre;

    // Constructor
    public Estilista(Long id, String nombre) {
        this.id = id;
        this.nombre = nombre;
    }

    // Getters y Setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
}
