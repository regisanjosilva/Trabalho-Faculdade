package view;

import java.awt.EventQueue;



import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.VeiculoController;
import modelo.Veiculo;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroVeiculoUI extends JInternalFrame {
	private JTextField txtPlaca;
	private JTextField txtModelo;
	private JTextField txtCor;
	private JTextField txtAno;
	private JTextField txtKmPorLitro;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroVeiculoUI frame = new CadastroVeiculoUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public CadastroVeiculoUI() {
		setTitle("Cadastro Veiculo");
		setBounds(100, 100, 450, 329);
		
		JPanel jpCadastroVeiculo = new JPanel();
		jpCadastroVeiculo.setBorder(new TitledBorder(null, "Veiculos", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnCancela = new JButton("Cancela");
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Veiculo veiculo = new Veiculo();
				veiculo.setPlaca(txtPlaca.getText());
				veiculo.setModelo(txtModelo.getText());
				veiculo.setCor(txtCor.getText());
				veiculo.setAno(txtAno.getColumns());
				veiculo.setKmPorLitro(Double.parseDouble(txtKmPorLitro.getText()));
				
			     new VeiculoController().Salvar(veiculo);
				JOptionPane.showMessageDialog(null, "veiculo Salvo " );
				dispose();
			} catch (Exception e) {
				JOptionPane.showMessageDialog(null, " Erro ao Salvar veiculo  " );
			}
			}
		});
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpCadastroVeiculo, GroupLayout.PREFERRED_SIZE, 419, GroupLayout.PREFERRED_SIZE)
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(223, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addGap(18)
					.addComponent(btnCancela)
					.addGap(20))
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addGroup(groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpCadastroVeiculo, GroupLayout.PREFERRED_SIZE, 238, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnCancela)
						.addComponent(btnSalvar))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JLabel jlPlaca = new JLabel("Placa:");
		
		JLabel jlModelo = new JLabel("Modelo:");
		
		JLabel jlCor = new JLabel("Cor:");
		
		JLabel jlAno = new JLabel("Ano:");
		
		JLabel jlKmPorLitro = new JLabel("KmPorLitro");
		
		txtPlaca = new JTextField();
		txtPlaca.setColumns(10);
		
		txtModelo = new JTextField();
		txtModelo.setColumns(10);
		
		txtCor = new JTextField();
		txtCor.setColumns(10);
		
		txtAno = new JTextField();
		txtAno.setColumns(10);
		
		txtKmPorLitro = new JTextField();
		txtKmPorLitro.setColumns(10);
		GroupLayout gl_jpCadastroVeiculo = new GroupLayout(jpCadastroVeiculo);
		gl_jpCadastroVeiculo.setHorizontalGroup(
			gl_jpCadastroVeiculo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroVeiculo.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
							.addComponent(jlPlaca)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
							.addComponent(jlModelo)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
							.addComponent(jlCor)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
							.addComponent(jlAno)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
							.addComponent(jlKmPorLitro)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtKmPorLitro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap(245, Short.MAX_VALUE))
		);
		gl_jpCadastroVeiculo.setVerticalGroup(
			gl_jpCadastroVeiculo.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroVeiculo.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlPlaca)
						.addComponent(txtPlaca, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpCadastroVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlModelo)
						.addComponent(txtModelo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpCadastroVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCor)
						.addComponent(txtCor, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpCadastroVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlAno)
						.addComponent(txtAno, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_jpCadastroVeiculo.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlKmPorLitro)
						.addComponent(txtKmPorLitro, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(73, Short.MAX_VALUE))
		);
		jpCadastroVeiculo.setLayout(gl_jpCadastroVeiculo);
		getContentPane().setLayout(groupLayout);

	}
}
