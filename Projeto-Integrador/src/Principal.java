import modelo.Chamado;
import modelo.Colaboradores;
import modelo.Veiculo;

public class Principal {
	
	  public static void main(String[] args) {
		    
		    Chamado novoChamado = new Chamado(1,45);
				System.out.println(novoChamado.getDistanciaPercorrida());
				
				Colaboradores colaborador = new Colaboradores(1,123456789, "Jorge", 20020810, true);
				System.out.println(colaborador.getCpf("Documento está certo"));
				
				Veiculo carro = new Veiculo("ABC-1234", "Celta", "Preto", 2017, 13);
				System.out.println(carro.getPlaca());
		  }
		}

}
