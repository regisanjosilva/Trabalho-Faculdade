package controller;

import java.util.List;

import dao.ChamadoDao;
import modelo.Chamado;

public class ChamadoController {

  public void salvar(Chamado chamado) throws Exception {
     ChamadoDao.getInstance().salvar(chamado);
    
  }
  
  public void atualizar(Chamado chamado) throws Exception {
     ChamadoDao.getInstance().salvar(chamado);
    
  }

   public void excluir(int idChamado) {
     ChamadoDao.getInstance().excluir(idChamado);
  }

  public List<Chamado> listar() {
    return ChamadoDao.getInstance().listar();
  }
  
}