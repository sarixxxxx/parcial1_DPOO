package logica;

public abstract class Ficha {
	protected int posicionInicialX	;
	protected int posicionInicialY	;
	public int posiblesMovimientos;
	
	public Ficha(int posicionInicialX,int posicionInicialY ) {
		this.posicionInicialX=posicionInicialX;
		this.posicionInicialY=posicionInicialY;
	}
	public boolean dentroDelTablero(int posicionInicialX,int posicionInicialY ) {
		if (posicionInicialX<9 && posicionInicialY<9) {
			return true;
		
		} else
			return false;
	}
	public abstract int contarMovimientos();
	
	public void setPosicionInicial(int x, int y) {
		this.posicionInicialX = x;
		this.posicionInicialY = y;
	}
}
