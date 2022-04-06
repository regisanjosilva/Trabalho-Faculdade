package modelo;

public class Chamado {
	private int id;
	private double distanciaPercorrida;
	private double co2Emitido;
	
	private Veiculo veiculo;
	
	public Chamado(int id, double distanciaPercorrida, double co2Emitido) {
		this.id = id;
		this.distanciaPercorrida = distanciaPercorrida ;
		this.co2Emitido = co2Emitido;
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
		return distanciaPercorrida;
	}
	
	public void setDistanciaPercorrida(double distanciaPercorrida) {
		this.distanciaPercorrida = distanciaPercorrida;
	}
	
	public void CalcularCo2Emitido() {
		co2Emitido = this.distanciaPercorrida * veiculo.getKmPorLitro();
	}
	public String toString(){
		return distanciaPercorrida + " - " + id;
	}
}

	
	

