package dao;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;


import java.util.List;

import javax.swing.Icon;

import modelo.Colaboradores;

public class ColaboradoresDao {

  private static ColaboradoresDao instance;
  private List<Colaboradores> listaColaboradores = new ArrayList<>();

  /*
   * Singleton
   */
  public static ColaboradoresDao getInstance() {
    if (instance == null) {
      instance = new ColaboradoresDao();
    }
    return instance;
  }
  
  public void salvar(Colaboradores colaboradores) {
	  try {
	    	String sql = "insert into colaboradores(id, cpf, nome, dataNasc, habilitado) values(?, ?, ?, ?, ?)";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, colaboradores.getId());
	    	pstmt.setInt(2, colaboradores.getCpf());
	    	pstmt.setString(3, colaboradores.getNome());
	    	pstmt.setInt(4, colaboradores.getDataNasc());
	    	pstmt.setBoolean(5, colaboradores.isHabilitado());
	    	    	
	    	pstmt.execute();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	 }   
  
  
  public void atualizar(Colaboradores colaboradores) {
    listaColaboradores.set(colaboradores.getId(), colaboradores);
  }

   public void excluir(int idColaboradores) {
    listaColaboradores.remove(idColaboradores);
  }

  public List<Colaboradores> listar() {
    return listaColaboradores;
  }
  
}


