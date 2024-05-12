package localidades;

/**
 *
 * @author Roberto García
 */
public class InsercionLocalidades {

    private Estado chiapas;
    Localidad tuxtlaGutierrez = new Localidad("Tuxtla Gutiérrez");
    Localidad tapachula = new Localidad("Tapachula de Córdova y Ordóñez");
    Localidad sanCristobal = new Localidad("San Cristóbal de Las Casas");
    Localidad comitanDominguez = new Localidad("Comitán de Domínguez");
    Localidad chiapaCorzo = new Localidad("Heroica Chiapa de Corzo");
    Localidad palenque = new Localidad("Palenque");
    Localidad cintalopaFigueroa = new Localidad("Cintalapa de Figueroa");
    Localidad ocosingo = new Localidad("Ocosingo");
    Localidad ocozocoautla = new Localidad("Ocozocoautla de Espinosa");
    Localidad tonala = new Localidad("Tonalá");
    Localidad villaflores = new Localidad("Villaflores");
    Localidad berriozabal = new Localidad("Berriozábal");
    Localidad huixtla = new Localidad("Huixtla");
    Localidad reforma = new Localidad("Reforma");
    Localidad motozintla = new Localidad("Motozintla de Mendoza");
    Localidad arriaga = new Localidad("Arriaga");
    Localidad margaritas = new Localidad("Las Margaritas");
    Localidad comalapa = new Localidad("Frontera Comalapa");
    Localidad rosas = new Localidad("Las Rosas");
    Localidad teopisca = new Localidad("Teopisca");

    public InsercionLocalidades(Estado chiapas) {
        this.chiapas = chiapas;
    }

    public void insertarLocalidades() {
        chiapas.agregarLocalidad(tuxtlaGutierrez);
        chiapas.agregarLocalidad(tapachula);
        chiapas.agregarLocalidad(sanCristobal);
        chiapas.agregarLocalidad(comitanDominguez);
        chiapas.agregarLocalidad(chiapaCorzo);
        chiapas.agregarLocalidad(palenque);
        chiapas.agregarLocalidad(cintalopaFigueroa);
        chiapas.agregarLocalidad(ocosingo);
        chiapas.agregarLocalidad(ocozocoautla);
        chiapas.agregarLocalidad(tonala);
        chiapas.agregarLocalidad(villaflores);
        chiapas.agregarLocalidad(berriozabal);
        chiapas.agregarLocalidad(huixtla);
        chiapas.agregarLocalidad(reforma);
        chiapas.agregarLocalidad(motozintla);
        chiapas.agregarLocalidad(arriaga);
        chiapas.agregarLocalidad(margaritas);
        chiapas.agregarLocalidad(comalapa);
        chiapas.agregarLocalidad(rosas);
        chiapas.agregarLocalidad(teopisca);

    }

    public void insertarCarreteras() {
        chiapas.agregarCarretera(new Carretera(41.0, tapachula, huixtla));
        chiapas.agregarCarretera(new Carretera(59.0, huixtla, motozintla));
        chiapas.agregarCarretera(new Carretera(182.2, huixtla, tonala));
        chiapas.agregarCarretera(new Carretera(50.2, motozintla, comalapa));
        chiapas.agregarCarretera(new Carretera(20.5, tonala, arriaga));
        chiapas.agregarCarretera(new Carretera(95.4, comalapa, comitanDominguez));
        chiapas.agregarCarretera(new Carretera(69.2, arriaga, cintalopaFigueroa));
        chiapas.agregarCarretera(new Carretera(114, arriaga, villaflores));
        chiapas.agregarCarretera(new Carretera(101, arriaga, ocozocoautla));
        chiapas.agregarCarretera(new Carretera(20.6, comitanDominguez, margaritas));
        chiapas.agregarCarretera(new Carretera(40.0, comitanDominguez, rosas));
        chiapas.agregarCarretera(new Carretera(60.1, comitanDominguez, teopisca));
        chiapas.agregarCarretera(new Carretera(103.0, comitanDominguez, ocosingo));
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
