/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localidades;

/**
 *
 * @author Usuario
 * Clase que representa una carretera entre dos localidades en Chiapas.
 */
public class Carretera {
    private double distancia; // Distancia de la carretera en kilómetros
    private Localidad origen; // Localidad de origen de la carretera
    private Localidad destino; // Localidad de destino de la carretera

    /**
     * Constructor por defecto de la clase Carretera.
     */
    public Carretera() {
    }

    /**
     * Constructor de la clase Carretera.
     * @param distancia La distancia de la carretera en kilómetros.
     * @param origen La localidad de origen de la carretera.
     * @param destino La localidad de destino de la carretera.
     */
    public Carretera(double distancia, Localidad origen, Localidad destino) {
        this.distancia = distancia;
        this.origen = origen;
        this.destino = destino;
    }

    /**
     * Método getter para obtener la distancia de la carretera.
     * @return La distancia de la carretera en kilómetros.
     */
    public double getDistancia() {
        return distancia;
    }

    /**
     * Método setter para establecer la distancia de la carretera.
     * @param distancia La nueva distancia de la carretera en kilómetros.
     */
    public void setDistancia(double distancia) {
        this.distancia = distancia;
    }

    /**
     * Método getter para obtener la localidad de origen de la carretera.
     * @return La localidad de origen de la carretera.
     */
    public Localidad getLugarOrigen() {
        return origen;
    }

    /**
     * Método setter para establecer la localidad de origen de la carretera.
     * @param origen La nueva localidad de origen de la carretera.
     */
    public void setLugarOrigen(Localidad origen) {
        this.origen = origen;
    }

    /**
     * Método getter para obtener la localidad de destino de la carretera.
     * @return La localidad de destino de la carretera.
     */
    public Localidad getLugarDestino() {
        return destino;
    }

    /**
     * Método setter para establecer la localidad de destino de la carretera.
     * @param destino La nueva localidad de destino de la carretera.
     */
    public void setLugarDestino(Localidad destino) {
        this.destino = destino;
    }

    /**
     * Método toString que devuelve una representación en cadena de la carretera.
     * @return Una cadena que representa la carretera.
     */
    @Override
    public String toString() {
        return "Distancia (" + distancia + "km), Origen (" + origen + "), Destino (" + destino + ")";
    }
}
