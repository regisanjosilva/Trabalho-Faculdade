package controller;

import dao.VeiculoDao;

import modelo.Veiculo;

public class VeiculoController {

  public void registrarVeiculo(Veiculo veiculo) throws Exception {
    if (veiculo.getModelo() == null) {
      throw new Exception("Modelo inválido");
    }
    if (Veiculo.getAno() == null || veiculo.getAno().length() < 4) {
      throw new Exception("Ano inválido");
    }
    VeiculoDao.getInstance().registrarVeiculo(veiculo);
  }
  
}