package modelo;
public class Veiculo {

  private String placa;
  private String modelo;
  private int ano;
  private String cor;
  private int kmPorLitro;

  public Veiculo(String placa, String modelo) {
    this.placa = placa;
    this.modelo = modelo;
  }
  public Veiculo() {
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
  public void setModelo(String modelo) {
    this.modelo = modelo;
  }
  public int getAno() {
    return ano;
  }
  public void setAno(int ano) {
    this.ano = ano;
  }
  public String getCor() {
    return cor;
  }
  public void setCor(String cor) {
    this.cor = cor;
  }
  public int getKmPorLitro() {
    return kmPorLitro;
  }
  public void setKmPorLitro(int kmPorLitro) {
    this.kmPorLitro = kmPorLitro;
  }
  
}


