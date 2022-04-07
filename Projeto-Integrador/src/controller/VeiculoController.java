package controller;

import java.util.List;



import dao.VeiculoDao;
import modelo.Veiculo;

public class VeiculoController {
	

  public void registrarVeiculo(Veiculo veiculo) throws Exception {
    if (veiculo.getModelo() == null) {
      throw new Exception("Modelo inválido");
    }
    VeiculoDao.getInstance().registrarVeiculo(veiculo);
  }
  
  public List<Veiculo> listar() {
	    return VeiculoDao.getInstance().listar();
	  }
}