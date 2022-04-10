package modelo;

public class Colaboradores {
	private int id;
	private Double cpf;
	private String nome;
	private double dataNasc;
	private boolean habilitado;
	
	
	
	public Colaboradores(int id, double cpf, String nome, double dataNasc, boolean habilitado) {
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.dataNasc = dataNasc;
		this.habilitado = habilitado;
	}
	
	
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public Double getCpf() {
		return cpf;
	}
	public void setCpf(double cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public double getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(double i) {
		this.dataNasc = i;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean b) {
		this.habilitado = b;
	}
	public String toString(){
		return nome + " - " + id + " - " + cpf + " - " + dataNasc + " - " + habilitado;
	}
}
	
	
	

