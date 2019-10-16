package view;

import java.awt.FlowLayout;

import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

public class Cadastro extends JFrame{
	JRadioButton celularJRadioButton, tvRadioButton;
	JTextField marcaField, valorField, modeloField, polegadasField, bateriaField,romField, ramField, voltagemField, possuiControleRemotoField;
	JLabel marcaLabel, valorLabel, modeloLabel, polegadasLabel, bateriaLabel,romLabel, ramLabel, voltagemLabel, possuiControleRemotoLabel;
	JButton okButton;
	
	public Cadastro() {
		super("Cadatrar");
		setSize(200, 400);
		setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);

		celularJRadioButton = new JRadioButton("Celular");
		tvRadioButton = new JRadioButton("TV");
		okButton = new JButton("OK");
		
		marcaField = new JTextField(10);
		valorField = new JTextField(10);
		modeloField = new JTextField(10);
		polegadasField = new JTextField(10);
		bateriaField = new JTextField(10);
		romField = new JTextField(10);
		ramField = new JTextField(10);
		voltagemField = new JTextField(10);
		possuiControleRemotoField = new JTextField(10);
		
		marcaLabel = new JLabel("Marca: ");
		valorLabel = new JLabel("Valor R$: ");
		modeloLabel = new JLabel("Modelo: ");
		polegadasLabel = new JLabel("Polegadas: ");
		bateriaLabel = new JLabel("Bateria: ");
		romLabel = new JLabel("Memória ROM: ");
		ramLabel = new JLabel("Memória RAM: ");
		voltagemLabel = new JLabel("Voltagem: ");
		possuiControleRemotoLabel = new JLabel("Possui Controle remoto?");
		
		ButtonGroup group = new ButtonGroup();
		group.add(celularJRadioButton);
		group.add(tvRadioButton);
		
		add(celularJRadioButton);
		add(tvRadioButton);
		
		
		
		add(okButton);
		
		setVisible(true);
	}
	
}
