package main;

import java.sql.Connection;


import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.ChamadoController;
import controller.ColaboradoresController;
import controller.VeiculoController;
import modelo.Colaboradores;
import modelo.Chamado;
import modelo.Veiculo;
import Util.ConnectionUtil;

public class Principal {
	public static void main(String[] args) { 
		Colaboradores colaborador1 = new Colaboradores(1, 123456789, "Jorge", 20020810, true);

		Colaboradores colaborador2 = new Colaboradores(2, 987654321, "Mario", 20030321, false);
		
		ColaboradoresController controller = new ColaboradoresController();
		
		try {
		controller.salvar(colaborador1);
		controller.salvar(colaborador2);
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		for (Colaboradores c : controller.listar()) {
			System.out.println(c.toString());
		}
		
		Veiculo carro1 = new Veiculo("ABC-1234", "Celta", "Preto", 2021, 14);
		
		Veiculo carro2 = new Veiculo("DEF-2846", "Fiesta", "Azul", 2018, 14);
		
		VeiculoController carroController = new VeiculoController();
		
		try {
			carroController.registrarVeiculo(carro1);
			carroController.registrarVeiculo(carro2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			for (Veiculo c : carroController.listar()) {
				System.out.println(c.toString());
			}
			
		Chamado chamado1 = new Chamado(0, 0, 0);
		
		Chamado chamado2 = new Chamado(0, 0, 0);
		
		ChamadoController chamadocontroller = new ChamadoController();
		
		try {
			chamadocontroller.salvar(chamado1);
			chamadocontroller.salvar(chamado2);
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
			for (Chamado c : chamadocontroller.listar()) {
				System.out.println(c.toString());
			}
			
			
			consulta();
			System.out.println("---------------------------");
			insere();
			System.out.println("---------------------------");
			consulta();
	}
	
	
	public static void insere() {
		try {
			Connection conexao = ConnectionUtil.getConnection();
			String sql = "";
			PreparedStatement pstmt = conexao.prepareStatement(sql);
			pstmt.
			pstmt
			pstmt
			pstmt.execute();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	public static void consulta() {
		try {
			Connection conexao = ConnectionUtil.getConnection();
			Statement stmt = conexao.createStatement();
			String sql = "select * from";
			ResultSet rs = stmt.executeQuery(sql);
			while (rs.next()) {
				System.out.println(" " + rs.getInt(""));
				System.out.println(" " + rs.getInt(""));
				System.out.println(" " + rs.getInt(""));
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}


