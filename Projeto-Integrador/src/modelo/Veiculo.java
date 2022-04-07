package modelo;

public class Veiculo {
	private String placa;
	private String modelo;
	private String cor;
	private int ano;
	private double KmPorLitro;
	
	
	public Veiculo(String placa, String modelo, String cor, int ano, double KmPorLitro) {
		this.placa = placa;
		this.modelo = modelo;
		this.cor = cor;
		this.ano = ano;
		this.KmPorLitro = KmPorLitro;
	}
	
	
	public String getPlaca() {
		return placa;
	}
	public void setPlaca(String placa) {
		this.placa = placa;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String i) {
		this.modelo = i;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public int getAno() {
		return ano;
	}
	public void setAno(int ano) {
		this.ano = ano;
	}
	public double getKmPorLitro() {
		return KmPorLitro;
	}
	public void setKmPorLitro(double kmPorLitro) {
		KmPorLitro = kmPorLitro;
	}
	public String toString(){
		return placa + " - " + modelo + " - " + cor + " - " + ano + " - " + KmPorLitro;
	}
}
	
	

