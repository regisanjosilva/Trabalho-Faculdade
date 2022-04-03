package modelo;

public class Chamado {
	private int id;
	private double DistanciaPercorrida;
	private double co2Emitido;
	
	private Veiculo veiculo;
	
	public Chamado(int id, double distanciaPercorrida) {
		this.id = id;
		DistanciaPercorrida = distanciaPercorrida;
	}

	
	public double getCo2Emitido() {
		return co2Emitido;
	}


	public void setCo2Emitido(double co2Emitido) {
		this.co2Emitido = co2Emitido;
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
	
	public void CalcularCo2Emitido() {
		co2Emitido = this.DistanciaPercorrida * veiculo.getKmPorLitro();
	}
	public String toString(){
		return DistanciaPercorrida + " - " + id;
	}
}

	
	

