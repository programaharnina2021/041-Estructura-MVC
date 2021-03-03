package control;

import modelo.GestionElementos;

public class Controlador {
	private GestionElementos gestionElementos;

	// Este solo controla toda la estructura
	public Controlador() {
		gestionElementos = new GestionElementos();
	}

	public void hazAlgo() {
		gestionElementos.presenta();
	}

}
