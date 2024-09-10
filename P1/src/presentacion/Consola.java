package presentacion;
import logica.Ficha;
import logica.Peon;
import logica.Rey;
import logica.Torre;

public class Consola {
	private Ficha ficha;
	public Consola(){
		this.ficha = new Peon(8,8);
		System.out.println(this.ficha.contarMovimientos());
		
		this.ficha = new Rey(4,4);
		System.out.println(this.ficha.contarMovimientos());
		
		this.ficha = new Torre(1,1);
		System.out.println(this.ficha.contarMovimientos());
		
	}
	public static void main(String[] args) {
		new Consola();
	}

	
}
