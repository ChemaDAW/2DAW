package Sugundo_trimestre;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextArea;

public class Calculadora {
	static Scanner teclado = new Scanner(System.in);
	private JFrame frmCalciladora;
	private JTextField txt1;
	private JTextField txt2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frmCalciladora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalciladora = new JFrame();
		frmCalciladora.setTitle("Calculadora");
		frmCalciladora.setBounds(100, 100, 450, 300);
		frmCalciladora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalciladora.getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("Operando 1:");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(86, 77, 91, 14);
		frmCalciladora.getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("Operando 2:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel_1.setBounds(86, 113, 91, 14);
		frmCalciladora.getContentPane().add(lblNewLabel_1);

		txt1 = new JTextField();
		txt1.setBounds(226, 75, 86, 20);
		frmCalciladora.getContentPane().add(txt1);
		txt1.setColumns(10);

		txt2 = new JTextField();
		txt2.setBounds(226, 111, 86, 20);
		frmCalciladora.getContentPane().add(txt2);
		txt2.setColumns(10);

		JButton btnSu = new JButton("+");
		btnSu.setBounds(85, 159, 41, 23);
		frmCalciladora.getContentPane().add(btnSu);

		JButton btnRes = new JButton("-");
		btnRes.setBounds(154, 159, 37, 23);
		frmCalciladora.getContentPane().add(btnRes);

		JButton btnMult = new JButton("*");
		btnMult.setBounds(226, 159, 41, 23);
		frmCalciladora.getContentPane().add(btnMult);

		JButton btnDiv = new JButton(":");
		btnDiv.setBounds(302, 159, 37, 23);
		frmCalciladora.getContentPane().add(btnDiv);

		JTextArea txtResul = new JTextArea();
		txtResul.setBounds(272, 203, 37, 22);
		frmCalciladora.getContentPane().add(txtResul);
		btnSu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Aquí tú código
				int operando1 = Integer.parseInt(txt1.getText());
				int operando2 = Integer.parseInt(txt2.getText());
				int resultado = operando1 + operando2;
				txtResul.setText(String.valueOf(resultado));
			}
		});

		btnRes.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Aquí tú código
				int operando1 = Integer.parseInt(txt1.getText());
				int operando2 = Integer.parseInt(txt2.getText());
				int resultado = operando1 - operando2;
				txtResul.setText(String.valueOf(resultado));
			}
		});

		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Aquí tú código
				int operando1 = Integer.parseInt(txt1.getText());
				int operando2 = Integer.parseInt(txt2.getText());
				int resultado = operando1 * operando2;
				txtResul.setText(String.valueOf(resultado));
			}
		});

		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent ae) {
				// Aquí tú código
				int operando1 = Integer.parseInt(txt1.getText());
				int operando2 = Integer.parseInt(txt2.getText());

				if (operando2 == 0) {
					txtResul.setText("No se puede dividir por 0");
				} else {
					int resultado = operando1 / operando2;
					txtResul.setText(String.valueOf(resultado));
				}
			}
		});
		static Scanner teclado = new Scanner(System.in);
		Scanner teclado = new Scanner(System.in);

		char salir;
		System.out.println("¿Quieres salir (s/n)?");
		salir = teclado.next().charAt(0);
		salir = teclado.next().charAt(0);
	}
}
