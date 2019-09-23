package game;

import java.util.ArrayList;

public class Personaje {
	
	private Casillero casilleroDePosicion; // Dentro tendra una posicion (x;y)
	private boolean poseeObjetos; ///puede ser innecesario
	private ArrayList<Objeto> inventarioDeObjetos;
	private int cantDeMonedas;
	private Dado dado;
	
	
	public Personaje() {
		// TODO Auto-generated constructor stub
	}
	
	public void lanzarDado() {
		dado.generarNumero();
	}
	
	private void avanzar() {
		
	}
	
	private void faseDeAccion() { //// Segun la consigna luego de lanzar el dado y avanzar los casilleros, el jugador podra tomar acciones
		
	}
	
	public void utilizarObjeto() {
		
	}
	
	
	
	
	
	
	

}
