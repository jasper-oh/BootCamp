package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JCheckBox;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CheckRadio {

	private JFrame frame;
	private JCheckBox check_1;
	private JCheckBox check_2;
	private JButton btn_ok;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CheckRadio window = new CheckRadio();
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
	public CheckRadio() {
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
		frame.getContentPane().add(getCheck_1());
		frame.getContentPane().add(getCheck_2());
		frame.getContentPane().add(getBtn_ok());
		frame.getContentPane().add(getTextField());
	}
	private JCheckBox getCheck_1() {
		if (check_1 == null) {
			check_1 = new JCheckBox("Apple");
			check_1.setBounds(27, 26, 128, 23);
		}
		return check_1;
	}
	private JCheckBox getCheck_2() {
		if (check_2 == null) {
			check_2 = new JCheckBox("Banana");
			check_2.setBounds(27, 62, 128, 23);
		}
		return check_2;
	}
	private JButton getBtn_ok() {
		if (btn_ok == null) {
			btn_ok = new JButton("OK");
			btn_ok.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					fruitCheck();
					
					
				}

				
			});
			btn_ok.setBounds(27, 112, 75, 29);
		}
		return btn_ok;
	}
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(25, 191, 170, 29);
			textField.setColumns(10);
		}
		return textField;
	}
	
	private void fruitCheck() {
		textField.setText("");
		
		if(check_1.isSelected()) {
			textField.setText("Apple was Chosen");
		}
		
		if(check_2.isSelected()) {
			textField.setText("Banana was Chosen");
		}
		
	}
	
	
	
}
