package Logica;
public class Peon extends Ficha{
	 
	public String Coordenada;
	public int PrimeraJugada;
	
	public void coordenada(String coordenada, int primeraJugada) {
		this.Coordenada = coordenada;
		this.PrimeraJugada = primeraJugada;
	}

	public String getCoordenada() {
		return Coordenada;
	}

	public int getPrimeraJugada() {
		return PrimeraJugada;
	}
	
	public ArrayList<String> calcularCoordenadas(String Coordenada, int PrimeraJugada ) {
		return null;
	}
	 
	

}
