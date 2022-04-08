package modelo;

public class Colaboradores {
	private int id;
	private String cpf;
	private String nome;
	private String dataNasc;
	private String habilitado;
	
	
	
	public Colaboradores(int id, String cpf, String nome, String dataNasc, String habilitado) {
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
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String string) {
		this.cpf = string;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDataNasc() {
		return dataNasc;
	}
	public void setDataNasc(String string) {
		this.dataNasc = string;
	}
	public String isHabilitado() {
		return habilitado;
	}
	public void setHabilitado(String string) {
		this.habilitado = string;
	}
	public String toString(){
		return nome + " - " + id + " - " + cpf + " - " + dataNasc + " - " + habilitado;
	}
}
	
	
	

