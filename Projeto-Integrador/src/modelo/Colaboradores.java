package modelo;

public class Colaboradores {
	private int id;
	private int cpf;
	private String nome;
	private int dataNasc;
	private boolean habilitado;
	
	
	
	public Colaboradores(int id, int cpf, String nome, int dataNasc, boolean habilitado) {
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
	public int getCpf() {
		return cpf;
	}
	public void setCpf(int cpf) {
		this.cpf = cpf;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public int getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(int dataNasc) {
		this.dataNasc = dataNasc;
	}
	public boolean isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(boolean habilitado) {
		this.habilitado = habilitado;
	}
	public String toString(){
		return nome + " - " + id + " - " + cpf + " - " + dataNasc + " - " + habilitado;
	}
}
	
	
	

