package localidades;

/**
 *
 * @author Roberto García
 */
public class Localidad {
    private String nombre;

    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public String toString() {
        return "Localidad{" + "nombre=" + nombre + '}';
    }
    
    
}
