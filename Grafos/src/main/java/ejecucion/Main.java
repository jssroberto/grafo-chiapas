package ejecucion;

import localidades.Estado;
import localidades.InsercionLocalidades;

/**
 *
 * @author Roberto García
 */
public class Main {

    public static void main(String[] args) {
        Estado chiapas = new Estado();
        InsercionLocalidades insercionLocalidades = new InsercionLocalidades(chiapas);
        insercionLocalidades.insertarLocalidades();
        insercionLocalidades.insertarCarreteras();
        chiapas.imprimirLista(chiapas.getListaAdyacencia());
    }
}
