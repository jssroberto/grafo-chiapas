/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package localidades;

/**
 *
 * @author Usuario
 */
public class Carretera {
    private double distancia;
    private Localidad origen;
    private Localidad destino;

    public Carretera() {
    }

    
    public Carretera(double distancia, Localidad origen, Localidad destino) {
        this.distancia = distancia;
        this.origen = origen;
        this.destino = destino;
    }

    public double getDistancia() {
        return distancia;
    }

    public void setDistancia(float distancia) {
        this.distancia = distancia;
    }

    public Localidad getLugarOrigen() {
        return origen;
    }

    public void setLugarOrigen(Localidad origen) {
        this.origen = origen;
    }

    public Localidad getLugarDestino() {
        return destino;
    }

    public void setLugarDestino(Localidad destino) {
        this.destino = destino;
    }

    @Override
    public String toString() {
        return "Distancia (" + distancia+"km)" + ", Origen (" + origen+")" + ", Destino (" + destino+")" ;
    }
    
    
            
}
