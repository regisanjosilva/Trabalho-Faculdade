package dao;

import java.util.List;

import dao.VeiculoDao;
	
import modelo.Veiculo;

public class VeiculoDao<listaVeiculo> {

  
  private static VeiculoDao instance;
  private List<Veiculo> listaVeiculo = new ArrayList<> ();

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
     Veiculo.add(veiculo); 
  }

public List<Veiculo> getListaVeiculo() {
	return listaVeiculo;
}

public void setListaVeiculo(List<Veiculo> listaVeiculo) {
	this.listaVeiculo = listaVeiculo;
}
  
}