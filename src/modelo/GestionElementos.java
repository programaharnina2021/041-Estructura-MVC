package modelo;

public class GestionElementos {
	private Elemento elementos[];

	public GestionElementos() {
		elementos=new Elemento[1];
		elementos[0]=new Elemento();
	}

	public boolean addElemento(Elemento elemento) {
		return false;
	}

	public void presenta() {
		System.out.println("la que va caer!!!");
		System.out.println(elementos[0].getNombre());
	}
}
