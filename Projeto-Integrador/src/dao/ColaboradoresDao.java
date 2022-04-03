package dao;

import java.util.ArrayList;

import java.util.List;

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
    listaColaboradores.add(colaboradores);   
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


