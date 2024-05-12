package localidades;

import java.util.Objects;

/**
 *
 * @author Roberto García
 * Clase que representa una localidad en Chiapas.
 */
public class Localidad {
    private String nombre; // Atributo que almacena el nombre de la localidad

    /**
     * Constructor de la clase Localidad.
     * @param nombre El nombre de la localidad.
     */
    public Localidad(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método getter para obtener el nombre de la localidad.
     * @return El nombre de la localidad.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Método setter para establecer el nombre de la localidad.
     * @param nombre El nuevo nombre de la localidad.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Método hashCode que genera un código hash basado en el nombre de la localidad.
     * @return El código hash de la localidad.
     */
    @Override
    public int hashCode() {
        int hash = 7;
        hash = 59 * hash + Objects.hashCode(this.nombre);
        return hash;
    }

    /**
     * Método equals que compara dos objetos Localidad basándose en su nombre.
     * @param obj El objeto a comparar.
     * @return true si los objetos son iguales, false en caso contrario.
     */
    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Localidad other = (Localidad) obj;
        return Objects.equals(this.nombre, other.nombre);
    }

    /**
     * Método toString que devuelve una representación en cadena de la localidad.
     * @return Una cadena que representa la localidad.
     */
    @Override
    public String toString() {
        return nombre;
    }
}

