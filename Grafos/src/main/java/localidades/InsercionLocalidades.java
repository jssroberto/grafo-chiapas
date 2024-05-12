package localidades;

/**
 *
 * @author Roberto García
 */
public class InsercionLocalidades {

    private Estado chiapas;

    public InsercionLocalidades(Estado chiapas) {
        this.chiapas = chiapas;
    }

    public void insertarLocalidades() {
        chiapas.agregarLocalidad("Tuxtla Gutiérrez");
        chiapas.agregarLocalidad("Tapachula de Córdova y Ordóñez");
        chiapas.agregarLocalidad("San Cristóbal de Las Casas");
        chiapas.agregarLocalidad("Comitán de Domínguez");
        chiapas.agregarLocalidad("Heroica Chiapa de Corzo");
        chiapas.agregarLocalidad("Palenque");
        chiapas.agregarLocalidad("Cintalapa de Figueroa");
        chiapas.agregarLocalidad("Ocosingo");
        chiapas.agregarLocalidad("Ocozocoautla de Espinosa");
        chiapas.agregarLocalidad("Tonalá");
        chiapas.agregarLocalidad("Villaflores");
        chiapas.agregarLocalidad("Berriozábal");
        chiapas.agregarLocalidad("Huixtla");
        chiapas.agregarLocalidad("Reforma");
        chiapas.agregarLocalidad("Motozintla de Mendoza");
        chiapas.agregarLocalidad("Arriaga");
        chiapas.agregarLocalidad("Las Margaritas");
        chiapas.agregarLocalidad("Frontera Comalapa");
        chiapas.agregarLocalidad("Las Rosas");
        chiapas.agregarLocalidad("Teopisca");

    }
}
