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
    private float distancia;
    private Localidad origen;
    private Localidad destino;

    public Carretera() {
    }

    
    public Carretera(float distancia, Localidad origen, Localidad destino) {
        this.distancia = distancia;
        this.origen = origen;
        this.destino = destino;
    }

    public float getDistancia() {
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
    
    
            
}
