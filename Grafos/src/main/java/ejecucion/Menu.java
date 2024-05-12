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
 * @author Usuario
 */
public class Menu {

    Estado chiapas;
    Localidad localidad1;
    Localidad localidad2;
    Scanner tec = new Scanner(System.in);

    public Menu(Estado estado) {
        this.chiapas = estado;
        this.localidad1 = null;
        this.localidad2 = null;
    }

    public void desplegarMenu() {
        int opcion;
        System.out.printf("|------  M E N U   D E   O P C I O N E S  ------| %n");
        System.out.printf("1. Mostrar Grafo %n");
        System.out.printf("2. Mostrar Arbol de esparcimiento minimo  %n");
        System.out.printf("3. Mostrar la ruta mas corta entre dos ciudades %n");
        System.out.printf("4. Salir %n");
        System.out.printf("Ingrese una opcion: ");
        opcion = tec.nextInt();
        tec.nextLine();

        switch (opcion) {
            case 1:
                System.out.println("");
                System.out.printf("|------ Grafo de Chiapas  ------| %n");
                chiapas.imprimirLista(chiapas.getListaAdyacencia());
                System.out.println("<<< PRESIONA ENTER PARA CONTINUAR >>>");
                tec.nextLine();
                desplegarMenu();
                break;
            case 2:
                System.out.println("");
                System.out.printf("|------ Arbol de Expansion Minima de Chiapas  ------| %n");
                chiapas.imprimirLista(chiapas.generarArbolExpansionMinima());
                System.out.println("<<< PRESIONA ENTER PARA CONTINUAR >>>");
                tec.nextLine();
                desplegarMenu();
                break;
            case 3:
                System.out.println("");
                System.out.printf("|------ Distancia mas corta entre 2 Ciudades  ------| %n");
                chiapas.imprimirLocalidades();
                while (localidad1 == null || localidad2 == null) {
                    System.out.println("Ingrese la ciudad #1: ");
                    localidad1 = chiapas.obtenerLocalidadPorNombre(tec.nextLine());
                    System.out.println("Ingrese la ciudad #2: ");
                    localidad2 = chiapas.obtenerLocalidadPorNombre(tec.nextLine());
                    if (localidad1 == null || localidad2 == null) {
                        System.out.println("");
                        System.out.println("Ingrese un nombre correcto.");
                        System.out.println("");
                    }
                }
                System.out.println("-------------------------------------------------------------------------------------------");
                System.out.println("La distancia mas corta entre " + localidad1.getNombre() + " y " + localidad2.getNombre() + " es: "
                        + chiapas.distanciaMasCorta(localidad1, localidad2) + "km");
                System.out.println("<<< PRESIONA ENTER PARA CONTINUAR >>>");
                localidad1 = null;
                localidad2 = null;
                tec.nextLine();
                desplegarMenu();
                break;
            case 4:
                System.exit(0);
                break;
            default:
                System.out.printf(" %n Opcion no valida, ingrese una del 1 al 4 %n ");
                System.out.println("");
                System.out.println("");
                desplegarMenu();

        }
    }
}
