package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class Practice02 {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JCheckBox chckbxNewCheckBox;
	private JCheckBox chckbxNewCheckBox_1;
	private JCheckBox chckbxNewCheckBox_2;
	private JCheckBox chckbxNewCheckBox_3;
	private JLabel lblNewLabel;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JLabel lblNewLabel_3;
	

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Practice02 window = new Practice02();
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
	public Practice02() {
		
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
		frame.getContentPane().add(getTextField());
		frame.getContentPane().add(getTextField_1());
		frame.getContentPane().add(getChckbxNewCheckBox());
		frame.getContentPane().add(getChckbxNewCheckBox_1());
		frame.getContentPane().add(getChckbxNewCheckBox_2());
		frame.getContentPane().add(getChckbxNewCheckBox_3());
		frame.getContentPane().add(getLblNewLabel());
		frame.getContentPane().add(getLblNewLabel_1());
		frame.getContentPane().add(getLblNewLabel_2());
		frame.getContentPane().add(getLblNewLabel_3());
	}

	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setBounds(30, 30, 130, 26);
			textField.setColumns(10);
		}
		return textField;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.setColumns(10);
			textField_1.setBounds(30, 73, 130, 26);
		}
		return textField_1;
	}
	private JCheckBox getChckbxNewCheckBox() {
		if (chckbxNewCheckBox == null) {
			chckbxNewCheckBox = new JCheckBox("plus");
			  
			chckbxNewCheckBox.addActionListener( new CheckEvent() );
			chckbxNewCheckBox.setBounds(271, 31, 128, 23);
		}
		return chckbxNewCheckBox;
	}
	private JCheckBox getChckbxNewCheckBox_1() {
		if (chckbxNewCheckBox_1 == null) {
			chckbxNewCheckBox_1 = new JCheckBox("minus");
			
			chckbxNewCheckBox_1.addActionListener( new CheckEvent() );
			chckbxNewCheckBox_1.setBounds(271, 55, 128, 23);
		}
		return chckbxNewCheckBox_1;
	}
	private JCheckBox getChckbxNewCheckBox_2() {
		if (chckbxNewCheckBox_2 == null) {
			chckbxNewCheckBox_2 = new JCheckBox("multiply");
			
			chckbxNewCheckBox_2.addActionListener( new CheckEvent() );
			chckbxNewCheckBox_2.setBounds(271, 76, 128, 23);
		}
		return chckbxNewCheckBox_2;
	}
	private JCheckBox getChckbxNewCheckBox_3() {
		if (chckbxNewCheckBox_3 == null) {
			chckbxNewCheckBox_3 = new JCheckBox("divide");
			
			chckbxNewCheckBox_3.addActionListener( new CheckEvent() );
			chckbxNewCheckBox_3.setBounds(271, 100, 128, 23);
		}
		return chckbxNewCheckBox_3;
	}
	private JLabel getLblNewLabel() {
		if (lblNewLabel == null) {
			lblNewLabel = new JLabel();
			lblNewLabel.setBounds(30, 160, 130, 16);
		}
		return lblNewLabel;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel();
			lblNewLabel_1.setBounds(30, 188, 130, 15);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel();
			lblNewLabel_2.setBounds(30, 215, 130, 16);
		}
		return lblNewLabel_2;
	}
	private JLabel getLblNewLabel_3() {
		if (lblNewLabel_3 == null) {
			lblNewLabel_3 = new JLabel();
			lblNewLabel_3.setBounds(30, 243, 130, 16);
		}
		return lblNewLabel_3;
	}
	
	class CheckEvent implements ActionListener {
	
		@Override
		public void actionPerformed(ActionEvent e) {
			int num1 =Integer.parseInt(textField.getText());
			int num2 =Integer.parseInt(textField_1.getText());
			
			// add
			if(chckbxNewCheckBox.isSelected() == true) {
				
				lblNewLabel.setText(String.format("%d",num1 + num2));
				
			}else {
				lblNewLabel.setText("");
			}
			
			// minus
			if(chckbxNewCheckBox_1.isSelected() == true) {
				if(lblNewLabel.getText().equals("")) {
					lblNewLabel.setText(String.format("%d",num1 - num2));
				}else {
					lblNewLabel_1.setText(String.format("%d",num1 - num2));
				}
				
			}else {
				lblNewLabel_1.setText("");
			}
			
			// multiply
			
			if(chckbxNewCheckBox_2.isSelected() == true) {
				if(lblNewLabel.getText().equals("")) {
					lblNewLabel.setText(String.format("%d",num1 * num2));
				}else if(lblNewLabel_1.getText().equals("")) {
					lblNewLabel_1.setText(String.format("%d",num1 * num2));
				}else {
					lblNewLabel_2.setText(String.format("%d", num1 * num2));
				}
			}else {
				lblNewLabel_2.setText("");
			}
			
			// Divide
			
			if(chckbxNewCheckBox_3.isSelected() == true) {
				double divide = num1 / (num2 * 1.0);
				String sDivide = Double.toString(divide);

				if(lblNewLabel.getText().equals("")) {
					lblNewLabel.setText(sDivide);					
				}else if(lblNewLabel_1.getText().equals("")) {
					lblNewLabel_1.setText(sDivide);
				}else if(lblNewLabel_2.getText().equals("")) {
					lblNewLabel_2.setText(sDivide);
				}else {
					lblNewLabel_3.setText(sDivide);
				}
				
			}else {
				lblNewLabel_3.setText("");
			}
			
			

		
			}
	
	}
}
	

			
		
		
	

