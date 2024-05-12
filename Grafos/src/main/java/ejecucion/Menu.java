/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejecucion;

import java.util.Scanner;
import localidades.Estado;
import localidades.Localidad;

/**
 *
 * @author Usuario Clase que representa el menú de opciones para interactuar con
 * el estado de Chiapas.
 */
public class Menu {

    Estado chiapas;
    Localidad localidad1;
    Localidad localidad2;
    Scanner tec = new Scanner(System.in);

    /**
     * Constructor de la clase Menu.
     *
     * @param estado El estado de Chiapas sobre el cual se interactúa.
     */
    public Menu(Estado estado) {
        this.chiapas = estado;
        this.localidad1 = null;
        this.localidad2 = null;
    }

    /**
     * Método que despliega el menú de opciones y maneja las acciones del
     * usuario.
     */
    public void desplegarMenu() {
        int opcion;
        // Desplegar opciones del menú
        System.out.printf("|------  M E N U   D E   O P C I O N E S  ------| %n");
        System.out.printf("1. Mostrar Grafo %n");
        System.out.printf("2. Mostrar Arbol de esparcimiento minimo  %n");
        System.out.printf("3. Mostrar la ruta mas corta entre dos ciudades %n");
        System.out.printf("4. Salir %n");
        System.out.printf("Ingrese una opcion: ");
        opcion = tec.nextInt();
        tec.nextLine();

        // Manejar la opción seleccionada por el usuario
        switch (opcion) {
            case 1:
                // Mostrar grafo
                System.out.println("");
                System.out.printf("|------ Grafo de Chiapas  ------| %n");
                chiapas.imprimirLista(chiapas.getListaAdyacencia());
                System.out.println("<<< PRESIONA ENTER PARA CONTINUAR >>>");
                tec.nextLine();
                desplegarMenu();
                break;
            case 2:
                // Mostrar árbol de expansión mínima
                System.out.println("");
                System.out.printf("|------ Arbol de Expansion Minima de Chiapas  ------| %n");
                chiapas.imprimirLista(chiapas.generarArbolExpansionMinima());
                System.out.println("<<< PRESIONA ENTER PARA CONTINUAR >>>");
                tec.nextLine();
                desplegarMenu();
                break;
            case 3:
                // Mostrar distancia más corta entre dos ciudades
                System.out.println("");
                System.out.printf("|------ Distancia mas corta entre 2 Ciudades  ------| %n");
                chiapas.imprimirLocalidades();
                while (localidad1 == null || localidad2 == null) {
                    // Solicitar al usuario las ciudades
                    System.out.println("Ingrese la ciudad #1: ");
                    localidad1 = chiapas.obtenerLocalidadPorNombre(tec.nextLine());
                    System.out.println("Ingrese la ciudad #2: ");
                    localidad2 = chiapas.obtenerLocalidadPorNombre(tec.nextLine());
                    if (localidad1 == null || localidad2 == null) {
                        // Manejar entradas incorrectas
                        System.out.println("");
                        System.out.println("Ingrese un nombre correcto.");
                        System.out.println("");
                    }
                }
                // Calcular y mostrar la distancia entre las ciudades
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("La distancia mas corta entre " + localidad1.getNombre() + " y " + localidad2.getNombre() + " es: "
                        + chiapas.distanciaMasCorta(localidad1, localidad2) + "km");
                System.out.println("<<< PRESIONA ENTER PARA CONTINUAR >>>");
                // Reiniciar las localidades seleccionadas para futuras consultas
                localidad1 = null;
                localidad2 = null;
                tec.nextLine();
                desplegarMenu();
                break;
            case 4:
                // Salir del programa
                System.exit(0);
                break;
            default:
                // Manejar opciones inválidas
                System.out.printf(" %n Opcion no valida, ingrese una del 1 al 4 %n ");
                System.out.println("");
                System.out.println("");
                desplegarMenu();

        }
    }
}
