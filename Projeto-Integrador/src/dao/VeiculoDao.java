
package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import java.util.List;

import Util.ConnectionUtil;
import modelo.Colaboradores;
import modelo.Veiculo;

public class VeiculoDao {

  
  private static VeiculoDao instance;
  private List<Veiculo> listaVeiculo = new ArrayList<>();
  private Connection con = ConnectionUtil.getConnection();
  
  /*
   * Singleton
   */
  public static VeiculoDao getInstance() {
    if (instance == null) {
      instance = new VeiculoDao();
    }
    return instance;
  }

  public void salvar(Veiculo veiculo) {
	  try {
	    	String sql = "insert Into veiculo (placa, modelo, cor, ano, KmPorLitro) values(?, ?, ?, ?, ?";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setString(1, veiculo.getPlaca());
	    	pstmt.setString(2, veiculo.getModelo());
	    	pstmt.setString(3, veiculo.getCor());
	    	pstmt.setInt(4, veiculo.getAno());
	    	pstmt.setDouble(5, veiculo.getKmPorLitro());
	    	pstmt.execute();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	 } 
  
  
  public void atualizar(Veiculo veiculo) {
	  try {
	    	String sql = "update veiculo set placa = ?, modelo = ?, cor = ?, ano = ?, kmPorLitro = ?";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setString(1, veiculo.getPlaca());
	    	pstmt.setString(2, veiculo.getModelo());
	    	pstmt.setString(3, veiculo.getCor());
	    	pstmt.setInt(4, veiculo.getAno());
	    	pstmt.setDouble(5, veiculo.getKmPorLitro());
	    	    	
	    	pstmt.execute();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	    	
	 }   


   public void excluir(int veiculo) {
	   try {
	    	String sql = "Delete from veiculo where placa =? ";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, veiculo);
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
	    	    Veiculo v = new Veiculo();
	    	    v.setPlaca(rs.getString("placa"));
	    	    v.setModelo(rs.getString("modelo"));
	    	    v.setAno(rs.getInt("ano"));
	    	    v.setCor(rs.getString("cor"));
	    	    v.setKmPorLitro(rs.getDouble("kmPorLitro"));
	    	    		
	    	    listaVeiculo.add(v);
	    	        	    
	    	    
	    	
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	  return listaColaboradores;
}

  }
  