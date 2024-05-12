package localidades;

import java.util.Comparator;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Set;

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

    public Map<Localidad, List<Carretera>> generarArbolExpansionMinima() {
        Map<Localidad, List<Carretera>> arbolExpansionMinima = new LinkedHashMap<>();
        Set<Localidad> visitados = new HashSet<>();
        PriorityQueue<Carretera> colaPrioridad = new PriorityQueue<>(Comparator.comparingDouble(Carretera::getDistancia));

        Localidad inicio = listaAdyacencia.keySet().iterator().next();
        visitados.add(inicio);

        colaPrioridad.addAll(listaAdyacencia.get(inicio));

        while (!colaPrioridad.isEmpty()) {
            Carretera carretera = colaPrioridad.poll();
            Localidad origen = carretera.getLugarOrigen();
            Localidad destino = carretera.getLugarDestino();

            if (!visitados.contains(destino)) {
                arbolExpansionMinima.computeIfAbsent(origen, k -> new LinkedList<>()).add(carretera);
                visitados.add(destino);
                colaPrioridad.addAll(listaAdyacencia.get(destino));
            }
        }

        return arbolExpansionMinima;
    }

    public double distanciaMasCorta(Localidad inicio, Localidad destino) {
        // Inicializar distancias a infinito
        Map<Localidad, Double> distancias = new HashMap<>();
        for (Localidad localidad : listaAdyacencia.keySet()) {
            distancias.put(localidad, Double.POSITIVE_INFINITY);
        }
        distancias.put(inicio, 0.0);

        // Inicializar cola de prioridad para nodos por visitar
        PriorityQueue<Localidad> colaPrioridad = new PriorityQueue<>(Comparator.comparingDouble(distancias::get));
        colaPrioridad.offer(inicio);

        // Algoritmo de Dijkstra
        while (!colaPrioridad.isEmpty()) {
            Localidad actual = colaPrioridad.poll();

            // Si llegamos al destino, retornar la distancia más corta
            if (actual.equals(destino)) {
                return distancias.get(actual);
            }

            // Actualizar distancias a vecinos no visitados
            for (Carretera carretera : listaAdyacencia.get(actual)) {
                Localidad vecino = carretera.getLugarDestino();
                double nuevaDistancia = distancias.get(actual) + carretera.getDistancia();
                if (nuevaDistancia < distancias.get(vecino)) {
                    distancias.put(vecino, nuevaDistancia);
                    colaPrioridad.offer(vecino);
                }
            }
        }

        // Si no se encontró ruta, retornar infinito
        return Double.POSITIVE_INFINITY;
    }

    public Localidad obtenerLocalidadPorNombre(String nombre) {
        for (Localidad localidad : listaAdyacencia.keySet()) {
            if (localidad.getNombre().equalsIgnoreCase(nombre)) {
                return localidad;
            }
        }
        return null;
    }

    public void imprimirLocalidades() {
        System.out.println("");
        System.out.println("       |------ Ciudades de Chiapas  ------|");
        System.out.println("--------------------------------------------------------------------------");
        int contador = 0;
        for (Localidad localidad : listaAdyacencia.keySet()) {
            System.out.print(localidad.getNombre() + "  "); // Imprimir el nombre de la localidad
            contador++;
            // Si se ha impreso la cuarta ciudad, imprimir un salto de línea y reiniciar el contador
            if (contador % 4 == 0) {
                System.out.println();
                System.out.println("--------------------------------------------------------------------------");
            }
        }
        // Si el contador no es múltiplo de 4 al terminar, imprimir un salto de línea final
        if (contador % 4 != 0) {
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
