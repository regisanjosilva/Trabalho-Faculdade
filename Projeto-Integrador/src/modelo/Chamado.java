package modelo;

public class Chamado {
	
	private int id;
	private double DistanciaPercorrida;
	
	
	public Chamado(int id, double distanciaPercorrida) {
	    this.id = id;
		DistanciaPercorrida = distanciaPercorrida;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public double getDistanciaPercorrida() {
		return DistanciaPercorrida;
	}
	public void setDistanciaPercorrida(double distanciaPercorrida) {
		DistanciaPercorrida = distanciaPercorrida;
	}
	
}
	
	
	
	

