package controller;

import java.util.List;

import dao.ColaboradoresDao;

import modelo.Colaboradores;

public class ColaboradoresController {
	
	public void salvar(Colaboradores colaboradores) throws Exception {
		if (colaboradores.getnome() == null || colaboradores.getnome().length() < 3) {
		      throw new Exception("Nome inválido"); 
      }
		
		ColaboradoresDao.getInstance().salvar(colaboradores);
	}
   
	public void atualizar(Colaboradores colaboradores) throws Exception {
	     if (colaboradores.getnome() == null || colaboradores.getnome().length() < 3) {
	         throw new Exception("Nome inválido");
	         }
	     ColaboradoresDao.getInstance().salvar(colaboradores);
	  }
	  
	   
	   public void excluir(int idColaboradores) throws Exception {
	     if (idColaboradores == 0) {
	       throw new Exception("Nenhum nome selecionado");
	     }
	     ColaboradoresDao.getInstance().excluir(idColaboradores);
	  }

	  public List<Colaboradores> listar() {
	    return ColaboradoresDao.getInstance().listar();
	  }
	  
	}
	     
	