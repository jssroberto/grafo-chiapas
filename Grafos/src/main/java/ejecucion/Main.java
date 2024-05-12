package ejecucion;

import guis.FramePrincipal;
import localidades.Estado;
import localidades.InsercionLocalidades;

/**
 *
 * @author Roberto García
 */
public class Main {

    public static void main(String[] args) {
//        Estado chiapas = new Estado();
//        InsercionLocalidades insercionLocalidades = new InsercionLocalidades(chiapas);
//        insercionLocalidades.insertarLocalidades();
//        insercionLocalidades.insertarCarreteras();
//        Menu menu=new Menu(chiapas);
//        menu.desplegarMenu();
        
        FramePrincipal framePrincipal = new FramePrincipal();
        framePrincipal.cambiarVistaInicio();
        framePrincipal.setVisible(true);
    }
}
