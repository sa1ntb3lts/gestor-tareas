package mx.unison;

public class Tarea {

	// Atributos
    private String descripcion;
    private boolean completada;

	// Constructor
    public Tarea(String descripcion) {
        this.descripcion = descripcion;
        this.completada = false; // Pendiente por defecto
    }

    // Getters y Setters
    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    // Imprimir tarea
    @Override
    public String toString() {
        String estado = completada ? "[X]" : "[ ]";
        return estado + " " + descripcion;
    }
}