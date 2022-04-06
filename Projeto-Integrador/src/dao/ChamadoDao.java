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

public class ChamadoDao {

  private static ChamadoDao instance;
  private List<Chamado> listaChamado = new ArrayList<>();
  private Connection con = ConnectionUtil.getConnection();

  /*
   * Singleton
   */
  public static ChamadoDao getInstance() {
    if (instance == null) {
      instance = new ChamadoDao();
    }
    return instance;
  }

  public void salvar(Chamado chamado) {
    try {
    	String sql = "insrt into chamado ( id, distanciaPercorrida, co2Emitido ) values (?, ? , ?)";
    	PreparedStatement pstmt = con.prepareStatement(sql);
    	pstmt.setInt(1, chamado.getId());
    	pstmt.setDouble(2, chamado.getDistanciaPercorrida());
    	pstmt.setDouble(3, chamado.getCo2Emitido());
    	pstmt.execute();
    } catch (SQLException e) {
    	e.printStackTrace();
    }
    	
 }
  
  public void atualizar(Chamado chamado) {
	  try {
	    	String sql = "update chamado set id = ?, distanciaPercorrida = ?, co2Emitido = ? ";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, chamado.getId());
	    	pstmt.setDouble(2, chamado.getDistanciaPercorrida());
	    	pstmt.setDouble(3, chamado.getCo2Emitido());
	    	pstmt.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
  }

   public void excluir(int idChamado) {
	   try {
	    	String sql = "Delete from chamado where id =? ";
	    	PreparedStatement pstmt = con.prepareStatement(sql);
	    	pstmt.setInt(1, idChamado);
	    	pstmt.executeUpdate();
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
  }

  public List<Chamado> listar() {
	  List<Chamado> listaChamado = new ArrayList<>();
	  try {
	    	String sql = "select * from chamado ";
	    	Statement stmt = con.createStatement();
	    	ResultSet rs = stmt.executeQuery(sql);
	    	while (rs.next());
	    	    Chamado c = new Chamado();
	    	    c.setId(rs.getInt("id"));
	    	    c.setDistanciaPercorrida(rs.getDouble("DistanciaPercorrida"));
	    	    c.setCo2Emitido(rs.getDouble("co2Emitido"));
	    	    listaChamado.add(c);
	    	        	    
	    	    
	    	
	    } catch (SQLException e) {
	    	e.printStackTrace();
	    }
	  return listaChamado;
  }


  
}