package logica;

public class Peon extends Ficha{

	

	public Peon(int posicionInicialX, int posicionInicialY) {
		super(posicionInicialX, posicionInicialY);
		// TODO Auto-generated constructor stub
	}

	public int contarMovimientos() {
		if (this.posicionInicialY== 2) {
			this.posiblesMovimientos = 2; 
			return 2;
		} else if (posicionInicialY==8) {
			this.posiblesMovimientos =0;
			return 0;
		} else
			return 1;
	}
	
}
