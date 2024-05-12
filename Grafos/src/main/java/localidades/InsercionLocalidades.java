package localidades;

/**
 *
 * @author Roberto García Clase que se encarga de insertar las localidades y las
 * carreteras en el estado de Chiapas.
 */
public class InsercionLocalidades {

    private Estado chiapas; // Instancia del estado de Chiapas

    // Declaración de las localidades
    Localidad tuxtlaGutierrez = new Localidad("Tuxtla Gutierrez");
    Localidad huixtla = new Localidad("Huixtla");
    Localidad teopisca = new Localidad("Teopisca");
    Localidad comitan = new Localidad("Comitán");
    Localidad chiapaCorzo = new Localidad("Chiapa de Corzo");
    Localidad palenque = new Localidad("Palenque");
    Localidad cintalopaFigueroa = new Localidad("Cintalapa de Figueroa");
    Localidad ocosingo = new Localidad("Ocosingo");
    Localidad ocozocoautla = new Localidad("Ocozocoautla de Espinosa");
    Localidad tonala = new Localidad("Tonala");
    Localidad villaflores = new Localidad("Villaflores");
    Localidad berriozabal = new Localidad("Berriozabal");
    Localidad tapachula = new Localidad("Tapachula");
    Localidad reforma = new Localidad("Reforma");
    Localidad motozintla = new Localidad("Motozintla de Mendoza");
    Localidad arriaga = new Localidad("Arriaga");
    Localidad margaritas = new Localidad("Las Margaritas");
    Localidad comalapa = new Localidad("Frontera Comalapa");
    Localidad rosas = new Localidad("Las Rosas");
    Localidad sanCristobal = new Localidad("San Cristobal de Las Casas");

    /**
     * Constructor de la clase InsercionLocalidades.
     *
     * @param chiapas El estado de Chiapas donde se van a insertar las
     * localidades y carreteras.
     */
    public InsercionLocalidades(Estado chiapas) {
        this.chiapas = chiapas;
    }

    /**
     * Método que inserta las localidades en el estado de Chiapas.
     */
    public void insertarLocalidades() {

        // Agregar cada localidad al estado de Chiapas
        chiapas.agregarLocalidad(tuxtlaGutierrez);
        chiapas.agregarLocalidad(huixtla);
        chiapas.agregarLocalidad(teopisca);
        chiapas.agregarLocalidad(comitan);
        chiapas.agregarLocalidad(chiapaCorzo);
        chiapas.agregarLocalidad(palenque);
        chiapas.agregarLocalidad(cintalopaFigueroa);
        chiapas.agregarLocalidad(ocosingo);
        chiapas.agregarLocalidad(ocozocoautla);
        chiapas.agregarLocalidad(tonala);
        chiapas.agregarLocalidad(villaflores);
        chiapas.agregarLocalidad(berriozabal);
        chiapas.agregarLocalidad(tapachula);
        chiapas.agregarLocalidad(reforma);
        chiapas.agregarLocalidad(motozintla);
        chiapas.agregarLocalidad(arriaga);
        chiapas.agregarLocalidad(margaritas);
        chiapas.agregarLocalidad(comalapa);
        chiapas.agregarLocalidad(rosas);
        chiapas.agregarLocalidad(sanCristobal);

    }

    /**
     * Método que inserta las carreteras entre las localidades en el estado de
     * Chiapas.
     */
    public void insertarCarreteras() {
        
        // Agregar cada carretera entre las localidades al estado de Chiapas
        chiapas.agregarCarretera(new Carretera(41.0, tapachula, huixtla));
        chiapas.agregarCarretera(new Carretera(59.0, huixtla, motozintla));
        chiapas.agregarCarretera(new Carretera(182.2, huixtla, tonala));
        chiapas.agregarCarretera(new Carretera(50.2, motozintla, comalapa));
        chiapas.agregarCarretera(new Carretera(20.5, tonala, arriaga));
        chiapas.agregarCarretera(new Carretera(95.4, comalapa, comitan));
        chiapas.agregarCarretera(new Carretera(69.2, arriaga, cintalopaFigueroa));
        chiapas.agregarCarretera(new Carretera(114, arriaga, villaflores));
        chiapas.agregarCarretera(new Carretera(101, arriaga, ocozocoautla));
        chiapas.agregarCarretera(new Carretera(20.6, comitan, margaritas));
        chiapas.agregarCarretera(new Carretera(40.0, comitan, rosas));
        chiapas.agregarCarretera(new Carretera(60.1, comitan, teopisca));
        chiapas.agregarCarretera(new Carretera(103.0, comitan, ocosingo));
        chiapas.agregarCarretera(new Carretera(93.1, margaritas, ocosingo));
        chiapas.agregarCarretera(new Carretera(27.6, rosas, teopisca));
        chiapas.agregarCarretera(new Carretera(33.7, teopisca, sanCristobal));
        chiapas.agregarCarretera(new Carretera(105, teopisca, ocosingo));
        chiapas.agregarCarretera(new Carretera(95.1, ocosingo, sanCristobal));
        chiapas.agregarCarretera(new Carretera(119, ocosingo, palenque));
        chiapas.agregarCarretera(new Carretera(187, palenque, reforma));
        chiapas.agregarCarretera(new Carretera(193, reforma, berriozabal));
        chiapas.agregarCarretera(new Carretera(194, reforma, ocozocoautla));
        chiapas.agregarCarretera(new Carretera(213, reforma, tuxtlaGutierrez));
        chiapas.agregarCarretera(new Carretera(256, reforma, ocosingo));
        chiapas.agregarCarretera(new Carretera(54.1, sanCristobal, chiapaCorzo));
        chiapas.agregarCarretera(new Carretera(15.3, chiapaCorzo, tuxtlaGutierrez));
        chiapas.agregarCarretera(new Carretera(91.2, tuxtlaGutierrez, villaflores));
        chiapas.agregarCarretera(new Carretera(24.7, tuxtlaGutierrez, berriozabal));
        chiapas.agregarCarretera(new Carretera(34.6, tuxtlaGutierrez, ocozocoautla));
        chiapas.agregarCarretera(new Carretera(14.8, berriozabal, ocozocoautla));
        chiapas.agregarCarretera(new Carretera(366, berriozabal, palenque));
        chiapas.agregarCarretera(new Carretera(367, ocozocoautla, palenque));
        chiapas.agregarCarretera(new Carretera(75.2, ocozocoautla, villaflores));
        chiapas.agregarCarretera(new Carretera(46.3, ocozocoautla, cintalopaFigueroa));
    }

}
