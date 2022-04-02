package controller;

import java.util.List;

import dao.ChamadoDao;
import modelo.Chamado;

public class ChamadoController {

  public void salvar(Chamado chamado) throws Exception {
    if (chamado.getVeiculoPlaca() == null || chamado.getVeiculoPlaca().length() < 3) {
      throw new Exception("Número da placa invalida");
     }
     ChamadoDao.getInstance().salvar(chamado);
    
  }
  
  public void atualizar(Chamado chamado) throws Exception {
    if (chamado.getVeiculoPlaca() == null || chamado.getVeiculoPlaca().length() < 3) {
      throw new Exception("Número da placa invalida");
     }
     ChamadoDao.getInstance().salvar(chamado);
    
  }

   public void excluir(int idChamado) throws Exception {
     if (idChamado == 0) {
       throw new Exception("Nenhum número selecionado");
     }
     ChamadoDao.getInstance().excluir(idChamado);
  }

  public List<Chamado> listar() {
    return ChamadoDao.getInstance().listar();
  }
  
}