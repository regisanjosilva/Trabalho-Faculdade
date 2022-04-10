package dao;

import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;


import java.util.List;

import Util.ConnectionUtil;
import modelo.Chamado;
import modelo.Colaboradores;

public class ColaboradoresDao {

  private static ColaboradoresDao instance;
  private List<Colaboradores> listaColaboradores = new ArrayList<>();
  private Connection con = ConnectionUtil.getConnection();


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
	    	PreparedStatement pstmt =  con.prepareStatement(sql);
	    	pstmt.setInt(1, colaboradores.getId());
	    	pstmt.setDouble(2, colaboradores.getCpf());
	    	pstmt.setString(3, colaboradores.getNome());
	    	pstmt.setDouble(4, colaboradores.getDataNasc());
	    	pstmt.setBoolean(5, colaboradores.isHabilitado());
	    	    	
	    	pstmt.execute();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	 }   
  
  
  public void atualizar(Colaboradores colaboradores) {
	  try {
	    	String sql = "update coaboradores set id = ?, cpf = ?, nome = ?, dataNasc = ?, habilitado = ?";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, colaboradores.getId());
	    	pstmt.setDouble(2, colaboradores.getCpf());
	    	pstmt.setString(3, colaboradores.getNome());
	    	pstmt.setDouble(4, colaboradores.getDataNasc());
	    	pstmt.setBoolean(5, colaboradores.isHabilitado());
	    	    	
	    	pstmt.execute();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	 }   


   public void excluir(int idColaboradores) {
	   try {
	    	String sql = "Delete from colaboradores where id =? ";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, idColaboradores);
	    	pstmt.executeUpdate();
	    	    	
	    	pstmt.execute();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	 }   
  

  public List<Colaboradores> listar() {
	  try {
	    	String sql = "select * from colaboradores ";
	    	Statement stmt = con.createStatement();
	    	ResultSet rs = stmt.executeQuery(sql);
	    	while (rs.next());
	    	    Colaboradores c = Colaboradores();
	    	    c.setId(rs.getInt("id"));
	    	    c.setCpf(rs.getDouble("cpf"));
	    	    c.setNome(rs.getString("nome"));
	    	    c.setDataNasc(rs.getDouble("dataNasc"));
	    	    c.setHabilitado(true);
	    	    listaColaboradores.add(c);
	    	        	    
	    	    
	    	
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	  return listaColaboradores;
}


}

  
  



