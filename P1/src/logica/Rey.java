package logica;

public class Rey extends Ficha{

	public Rey(int posicionInicialX, int posicionInicialY) {
		super(posicionInicialX, posicionInicialY);
		// TODO Auto-generated constructor stub
	}

	@Override
	public int contarMovimientos() {
		// TODO Auto-generated method stub
		int movimientos=4;
		if (this.posicionInicialX==1) {
			movimientos=movimientos-1;
		} else if(this.posicionInicialX==8) {
			movimientos=movimientos-1;
		}
		if (this.posicionInicialY==1) {
			movimientos=movimientos-1;
		} else if (this.posicionInicialY==8) {
			movimientos=movimientos-1;
		}
		return movimientos;
	}

}
