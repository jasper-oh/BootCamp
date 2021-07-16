package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUIPassword {

	private JFrame frmPasswordfield;
	private JLabel lblNewLabel;
	private JPasswordField passwordField;
	private JButton btnNewButton;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIPassword window = new GUIPassword();
					window.frmPasswordfield.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUIPassword() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmPasswordfield = new JFrame();
		frmPasswordfield.setTitle("PasswordField");
		frmPasswordfield.setBounds(100, 100, 450, 300);
		frmPasswordfield.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmPasswordfield.getContentPane().setLayout(null);
		frmPasswordfield.getContentPane().add(getLblNewLabel());
		frmPasswordfield.getContentPane().add(getPasswordField());
		frmPasswordfield.getContentPane().add(getBtnNewButton());
		frmPasswordfield.getContentPane().add(getTextField());
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("Password");
			lblNewLabel.setBounds(31, 23, 61, 16);
		}
		return lblNewLabel;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(108, 20, 94, 19);
		}
		return passwordField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("Ok");
			btnNewButton.addActionListener(new CheckAction());
			btnNewButton.setBounds(209, 18, 117, 29);
		}
		return btnNewButton;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(86, 95, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	
	class CheckAction implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			char[] str = passwordField.getPassword();
			
			String newStr = new String(str);

			textField.setText(newStr);
			
		}
		
		
		
		
		
	}
	
	
}
