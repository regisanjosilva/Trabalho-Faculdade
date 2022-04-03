
package dao;

import java.util.ArrayList;
import java.util.List;

import modelo.Veiculo;

public class VeiculoDao {

  
  private static VeiculoDao instance;
  private List<Veiculo> listaVeiculo = new ArrayList<>();

  /*
   * Singleton
   */
  public static VeiculoDao getInstance() {
    if (instance == null) {
      instance = new VeiculoDao();
    }
    return instance;
  }

  public void registrarVeiculo(Veiculo veiculo) {
     listaVeiculo.add(veiculo); 
  }
  
  public List<Veiculo> listar() {
	    return listaVeiculo;
	  }
}