package Logica;

public abstract class Ficha{
	
	public String Coordenada;
	

	public String getCoordenada() {
		return Coordenada;
	}

	public void coordenada(String coordenada) {
		Coordenada = coordenada;
	}
	
	public void calcularCoordenadasFinales(String Coordenada) {} 
}

