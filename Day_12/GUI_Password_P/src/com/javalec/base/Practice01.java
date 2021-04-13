package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Practice01 {

	private JFrame frame;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JPasswordField passwordField;
	private JTextField textField;
	private JButton btnNewButton;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice01 window = new Practice01();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Practice01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getPasswordField());
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getBtnNewButton());
		frame.getContentPane().add(getTextField_1());
	}

	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel("User");
			lblNewLabel.setBounds(107, 83, 61, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("Password");
			lblNewLabel_1.setBounds(107, 121, 61, 16);
		}
		return lblNewLabel_1;
	}
	private JPasswordField getPasswordField() {
		if (passwordField == null) {
			passwordField = new JPasswordField();
			passwordField.setBounds(218, 116, 130, 21);
		}
		return passwordField;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(218, 78, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("New button");
			btnNewButton.addActionListener(new CheckEvent());
			btnNewButton.setBounds(278, 147, 117, 29);
		}
		return btnNewButton;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setBounds(45, 218, 339, 26);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	
	
	class CheckEvent implements ActionListener {

		@Override
		public void actionPerformed(ActionEvent e) {
			String userId = textField.getText();
			char[] userPW = passwordField.getPassword();
			
			String newUserPW = new String(userPW);
			
			textField_1.setText("userID = " + userId + " pass = " + newUserPW);
			
			
			
		}
		
	}
	
}
