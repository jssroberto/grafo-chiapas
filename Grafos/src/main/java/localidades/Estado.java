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

    public void imprimirLista(Map<Localidad, List<Carretera>> map) {
        for (Map.Entry<Localidad, List<Carretera>> entrada : map.entrySet()) {
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("Vertice: " + entrada.getKey());
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println("Aristas:");
            for (Carretera valor : entrada.getValue()) {
                System.out.println("-" + valor);
            }
            System.out.println("---------------------------------------------------------------------------------------------------------");
            System.out.println();
            System.out.println();
        }
    }

    public void setListaAdyacencia(Map<Localidad, List<Carretera>> listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }

    public void agregarLocalidad(Localidad localidad) {
        listaAdyacencia.putIfAbsent(localidad, new LinkedList<>());
    }

    public void agregarCarretera(Carretera carretera) {
        listaAdyacencia.get(carretera.getLugarOrigen()).add(carretera);
        listaAdyacencia.get(carretera.getLugarDestino()).add(new Carretera(carretera.getDistancia(), carretera.getLugarDestino(), carretera.getLugarOrigen()));
    }

    public List<Carretera> obtenerCarretera(Localidad localidad) {
        return listaAdyacencia.get(localidad);
    }

}
