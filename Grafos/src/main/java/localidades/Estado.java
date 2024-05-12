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

    private Map<Localidad, List<Carretera>> listaAdyacencia;

    public Estado() {
        listaAdyacencia = new LinkedHashMap<>();
    }

    public Map<Localidad, List<Carretera>> getListaAdyacencia() {
        return listaAdyacencia;
    }

    public void setListaAdyacencia(Map<Localidad, List<Carretera>> listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }

    public void agregarLocalidad(String localidad) {
        listaAdyacencia.putIfAbsent(new Localidad(localidad), new LinkedList<>());
    }

    public void agregarCarretera(double distancia, Localidad lugarDestino, Localidad lugarOrigen) {
        Carretera carretera =new Carretera();
        listaAdyacencia.get(carretera.origen).add(carretera);
        listaAdyacencia.get(carretera.destino).add(new Carretera(carretera.destino, carretera.origen, carretera.distancia));
    }

}
