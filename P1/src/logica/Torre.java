package logica;

public class Torre extends Ficha {

	
	
	public Torre(int posicionInicialX, int posicionInicialY) {
		super(posicionInicialX, posicionInicialY);
		// TODO Auto-generated constructor stub
	}

	public int contarMovimientos() {
		this.posiblesMovimientos = 14;
		return 14;
	}

}
