package view;

import java.awt.EventQueue;


import java.beans.PropertyVetoException;
import java.net.ConnectException;

import javax.swing.JInternalFrame;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

import controller.ColaboradoresController;
import modelo.Colaboradores;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CadastroColaboradorUI extends JInternalFrame {
	private JTextField txtCPF;
	private JTextField txtNome;
	private JTextField txtDataNasc;
	private JTextField txtHabilitado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CadastroColaboradorUI frame = new CadastroColaboradorUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @throws PropertyVetoException 
	 */
	public CadastroColaboradorUI() throws PropertyVetoException {
		setIconifiable(true);
		setClosable(true);
		setMaximum(true);
		setMaximizable(true);
		setTitle("Cadastro Colaborador");
		setBounds(100, 100, 447, 275);
		
		JPanel jpCadastroColaborador = new JPanel();
		jpCadastroColaborador.setBorder(new TitledBorder(null, "colaboradores", TitledBorder.LEADING, TitledBorder.TOP, null, null));
		
		JButton btnSalvar = new JButton("Salvar");
		btnSalvar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			try {
				Colaboradores colaboradores = new Colaboradores();
				colaboradores.setCpf(txtCPF.getText());
				colaboradores.setNome(txtNome.getText());
				colaboradores.setDataNasc(txtDataNasc.getText());
				colaboradores.setHabilitado(txtHabilitado.getText());
				
				new ColaboradoresController().salvar(colaboradores);
				JOptionPane.showMessageDialog(null, "Colaborador Salvo " );
				dispose();
			} catch (Exception ex) {
				JOptionPane.showMessageDialog(null, "Erro a Salvar colaboradores" );
				
				
			}
				
				
			
				
				
				
				
				
			}
		});
		
		JButton btnCancelar = new JButton("Cancelar");
		GroupLayout groupLayout = new GroupLayout(getContentPane());
		groupLayout.setHorizontalGroup(
			groupLayout.createParallelGroup(Alignment.LEADING)
				.addComponent(jpCadastroColaborador, GroupLayout.DEFAULT_SIZE, 434, Short.MAX_VALUE)
				.addGroup(Alignment.TRAILING, groupLayout.createSequentialGroup()
					.addContainerGap(268, Short.MAX_VALUE)
					.addComponent(btnSalvar)
					.addGap(18)
					.addComponent(btnCancelar)
					.addContainerGap())
		);
		groupLayout.setVerticalGroup(
			groupLayout.createParallelGroup(Alignment.TRAILING)
				.addGroup(Alignment.LEADING, groupLayout.createSequentialGroup()
					.addContainerGap()
					.addComponent(jpCadastroColaborador, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(groupLayout.createParallelGroup(Alignment.LEADING)
						.addComponent(btnCancelar)
						.addComponent(btnSalvar))
					.addContainerGap(21, Short.MAX_VALUE))
		);
		
		JLabel jlCPF = new JLabel("CPF ");
		
		txtCPF = new JTextField();
		txtCPF.setColumns(10);
		
		JLabel jlNome = new JLabel("Nome");
		
		JLabel jlDataNasc = new JLabel("Data Nascimento");
		
		JLabel jlHabilitado = new JLabel("Habilitado");
		
		txtNome = new JTextField();
		txtNome.setColumns(10);
		
		txtDataNasc = new JTextField();
		txtDataNasc.setColumns(10);
		
		txtHabilitado = new JTextField();
		txtHabilitado.setColumns(10);
		GroupLayout gl_jpCadastroColaborador = new GroupLayout(jpCadastroColaborador);
		gl_jpCadastroColaborador.setHorizontalGroup(
			gl_jpCadastroColaborador.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlCPF)
							.addGap(18)
							.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, 157, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlDataNasc)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlNome)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(txtNome, GroupLayout.DEFAULT_SIZE, 349, Short.MAX_VALUE))
						.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
							.addComponent(jlHabilitado)
							.addPreferredGap(ComponentPlacement.RELATED)
							.addComponent(txtHabilitado, GroupLayout.PREFERRED_SIZE, 22, GroupLayout.PREFERRED_SIZE)))
					.addContainerGap())
		);
		gl_jpCadastroColaborador.setVerticalGroup(
			gl_jpCadastroColaborador.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_jpCadastroColaborador.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlCPF)
						.addComponent(txtCPF, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(27)
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(jlNome)
						.addComponent(txtNome, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
					.addGap(31)
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtDataNasc, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlDataNasc))
					.addGap(18)
					.addGroup(gl_jpCadastroColaborador.createParallelGroup(Alignment.BASELINE)
						.addComponent(txtHabilitado, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
						.addComponent(jlHabilitado))
					.addContainerGap(88, Short.MAX_VALUE))
		);
		jpCadastroColaborador.setLayout(gl_jpCadastroColaborador);
		getContentPane().setLayout(groupLayout);

	}
}
