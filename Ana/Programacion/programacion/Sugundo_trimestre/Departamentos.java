package Sugundo_trimestre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JEditorPane;
import java.awt.Color;
import javax.swing.JTextPane;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Departamentos {

	private JFrame frmPruebaDeVentanas;
	private JTextField txtCod;
	private JTextField txtNom;
	private JTextField txtLocal;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Departamentos window = new Departamentos();
					window.frmPruebaDeVentanas.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Departamentos() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPruebaDeVentanas = new JFrame();
		frmPruebaDeVentanas.setTitle("PRUEBA DE VENTANAS");
		frmPruebaDeVentanas.setBounds(100, 100, 450, 300);
		frmPruebaDeVentanas.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPruebaDeVentanas.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("DATOS DE DEPARTAMENTOS");
		lblNewLabel.setBounds(130, 18, 148, 14);
		frmPruebaDeVentanas.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Codigo Departamento");
		lblNewLabel_1.setLabelFor(lblNewLabel_1);
		lblNewLabel_1.setBackground(Color.YELLOW);
		lblNewLabel_1.setBounds(72, 82, 155, 14);
		frmPruebaDeVentanas.getContentPane().add(lblNewLabel_1);

		JLabel lblNewLabel_2 = new JLabel("Nombre Departamento");
		lblNewLabel_2.setBounds(72, 125, 131, 14);
		frmPruebaDeVentanas.getContentPane().add(lblNewLabel_2);

		JLabel lblNewLabel_3 = new JLabel("Localidad Departamento");
		lblNewLabel_3.setBounds(72, 163, 131, 14);
		frmPruebaDeVentanas.getContentPane().add(lblNewLabel_3);

		txtCod = new JTextField();
		txtCod.setBounds(213, 79, 86, 20);
		frmPruebaDeVentanas.getContentPane().add(txtCod);
		txtCod.setColumns(10);

		txtNom = new JTextField();
		txtNom.setBounds(213, 122, 126, 20);
		frmPruebaDeVentanas.getContentPane().add(txtNom);
		txtNom.setColumns(10);

		txtLocal = new JTextField();
		txtLocal.setBounds(213, 160, 126, 20);
		frmPruebaDeVentanas.getContentPane().add(txtLocal);
		txtLocal.setColumns(10);

		JTextPane textPane = new JTextPane();
		textPane.setBackground(Color.YELLOW);
		textPane.setBounds(59, 43, 295, 166);
		frmPruebaDeVentanas.getContentPane().add(textPane);

		JButton btnNewButton = new JButton("Insertar Datos");
		btnNewButton.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(81, 220, 89, 23);
		frmPruebaDeVentanas.getContentPane().add(btnNewButton);

		JButton btnNewButton_1 = new JButton("Limpiar Datos");
		btnNewButton_1.setFont(new Font("Tahoma", Font.PLAIN, 9));
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_1.setBounds(226, 220, 89, 23);
		frmPruebaDeVentanas.getContentPane().add(btnNewButton_1);
	}
}
