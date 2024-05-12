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
 * Clase que representa el estado de Chiapas.
 */
public class Estado {

    private Map<Localidad, List<Carretera>> listaAdyacencia;

    /**
     * Constructor de la clase Estado.
     */
    public Estado() {
        listaAdyacencia = new LinkedHashMap<>();
    }

    /**
     * Método para obtener la lista de adyacencia del estado.
     *
     * @return La lista de adyacencia.
     */
    public Map<Localidad, List<Carretera>> getListaAdyacencia() {
        return listaAdyacencia;
    }

    /**
     * Método para imprimir la lista de adyacencia del estado.
     *
     * @param map La lista de adyacencia a imprimir.
     */
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

    /**
     * Método para establecer la lista de adyacencia del estado.
     *
     * @param listaAdyacencia La lista de adyacencia a establecer.
     */
    public void setListaAdyacencia(Map<Localidad, List<Carretera>> listaAdyacencia) {
        this.listaAdyacencia = listaAdyacencia;
    }

    /**
     * Método para agregar una localidad a la lista de adyacencia.
     *
     * @param localidad La localidad a agregar.
     */
    public void agregarLocalidad(Localidad localidad) {
        listaAdyacencia.putIfAbsent(localidad, new LinkedList<>());
    }

    /**
     * Método para agregar una carretera a la lista de adyacencia.
     *
     * @param carretera La carretera a agregar.
     */
    public void agregarCarretera(Carretera carretera) {
        listaAdyacencia.get(carretera.getLugarOrigen()).add(carretera);
        listaAdyacencia.get(carretera.getLugarDestino()).add(new Carretera(carretera.getDistancia(), carretera.getLugarDestino(), carretera.getLugarOrigen()));
    }

    /**
     * Método para obtener las carreteras adyacentes a una localidad.
     *
     * @param localidad La localidad de la cual se desean obtener las
     * carreteras.
     * @return La lista de carreteras adyacentes.
     */
    public List<Carretera> obtenerCarretera(Localidad localidad) {
        return listaAdyacencia.get(localidad);
    }

    /**
     * Método para generar el árbol de expansión mínima del estado.
     *
     * @return El árbol de expansión mínima representado como una lista de
     * adyacencia.
     */
    public Map<Localidad, List<Carretera>> generarArbolExpansionMinima() {
        // Algoritmo de Prim para encontrar el árbol de expansión mínima
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

    /**
     * Método para encontrar la distancia más corta entre dos localidades
     * utilizando el algoritmo de Dijkstra.
     *
     * @param inicio La localidad de inicio.
     * @param destino La localidad de destino.
     * @return La distancia más corta entre las dos localidades.
     */
    public double distanciaMasCorta(Localidad inicio, Localidad destino) {
        // Algoritmo de Dijkstra para encontrar la distancia más corta entre dos localidades
        Map<Localidad, Double> distancias = new HashMap<>();
        for (Localidad localidad : listaAdyacencia.keySet()) {
            distancias.put(localidad, Double.POSITIVE_INFINITY);
        }
        distancias.put(inicio, 0.0);

        PriorityQueue<Localidad> colaPrioridad = new PriorityQueue<>(Comparator.comparingDouble(distancias::get));
        colaPrioridad.offer(inicio);

        while (!colaPrioridad.isEmpty()) {
            Localidad actual = colaPrioridad.poll();

            if (actual.equals(destino)) {
                return distancias.get(actual);
            }

            for (Carretera carretera : listaAdyacencia.get(actual)) {
                Localidad vecino = carretera.getLugarDestino();
                double nuevaDistancia = distancias.get(actual) + carretera.getDistancia();
                if (nuevaDistancia < distancias.get(vecino)) {
                    distancias.put(vecino, nuevaDistancia);
                    colaPrioridad.offer(vecino);
                }
            }
        }

        return Double.POSITIVE_INFINITY;
    }

    /**
     * Método para obtener una localidad a partir de su nombre.
     *
     * @param nombre El nombre de la localidad a buscar.
     * @return La localidad encontrada, o null si no se encuentra.
     */
    public Localidad obtenerLocalidadPorNombre(String nombre) {
        for (Localidad localidad : listaAdyacencia.keySet()) {
            if (localidad.getNombre().equalsIgnoreCase(nombre)) {
                return localidad;
            }
        }
        return null;
    }

    /**
     * Método para imprimir las localidades del estado, con un formato de tabla.
     */
    public void imprimirLocalidades() {
        System.out.println("");
        System.out.println("       |------ Ciudades de Chiapas  ------|");
        System.out.println("--------------------------------------------------------------------------");
        int contador = 0;
        for (Localidad localidad : listaAdyacencia.keySet()) {
            System.out.print(localidad.getNombre() + "  ");
            contador++;
            if (contador % 4 == 0) {
                System.out.println();
                System.out.println("--------------------------------------------------------------------------");
            }
        }
        if (contador % 4 != 0) {
            System.out.println();
            System.out.println("--------------------------------------------------------------------------");
        }
    }
}
