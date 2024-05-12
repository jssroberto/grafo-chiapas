package localidades;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/**
 *
 * @author Roberto García
 */
public class Estado {
    private Map<Localidad, List<Localidad>> listaAdyacencia;

    public Estado() {
        listaAdyacencia = new LinkedHashMap<>();
    }

    public Map<Localidad, List<Localidad>> getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void setListaAdyacencia(Map<Localidad, List<Localidad>> listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }
    
    public void agregarLocalidad(String localidad){
        listaAdyacencia.putIfAbsent(new Localidad(localidad), new LinkedList<>());
    }
    
    public void agregarCarretera(String localidadOrigen, String localidadDestino){
        Localidad localidad1 = new Localidad(localidadOrigen);
        Localidad localidad2 = new Localidad(localidadDestino);
        listaAdyacencia.get(localidad1).add(localidad2);
    }
    
    
}
