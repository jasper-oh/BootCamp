package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GUI01 {

	private JFrame frmAdd;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_2;
	private JButton btnNewButton;
	private JTextField textField;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JButton btnX;
	private JButton btnX_1;
	private JButton btnNewButton_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUI01 window = new GUI01();
					window.frmAdd.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public GUI01() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmAdd = new JFrame();
		frmAdd.setTitle("ADD");
		frmAdd.setBounds(100, 100, 450, 214);
		frmAdd.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmAdd.getContentPane().setLayout(null);
		frmAdd.getContentPane().add(getTextField_2());
		frmAdd.getContentPane().add(getTextField_3());
		frmAdd.getContentPane().add(getTextField_1());
		frmAdd.getContentPane().add(getLblNewLabel_1());
		frmAdd.getContentPane().add(getLblNewLabel_2());
		frmAdd.getContentPane().add(getBtnNewButton());
		frmAdd.getContentPane().add(getTextField());
		frmAdd.getContentPane().add(getTextField_4());
		frmAdd.getContentPane().add(getTextField_5());
		frmAdd.getContentPane().add(getTextField_6());
		frmAdd.getContentPane().add(getBtnX());
		frmAdd.getContentPane().add(getBtnX_1());
		frmAdd.getContentPane().add(getBtnNewButton_3());
	}
	private JTextField getTextField_2() {
		if (textField_2 == null) {
			textField_2 = new JTextField();
			textField_2.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_2.setBounds(29, 54, 75, 26);
			textField_2.setColumns(10);
		}
		return textField_2;
	}
	private JTextField getTextField_3() {
		if (textField_3 == null) {
			textField_3 = new JTextField();
			textField_3.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_3.setBounds(29, 120, 75, 26);
			textField_3.setColumns(10);
		}
		return textField_3;
	}
	private JTextField getTextField_1() {
		if (textField_1 == null) {
			textField_1 = new JTextField();
			textField_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
			
					
				}
			});
			textField_1.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_1.setBounds(29, 16, 75, 26);
			textField_1.setColumns(10);
		}
		return textField_1;
	}
	private JLabel getLblNewLabel_1() {
		if (lblNewLabel_1 == null) {
			lblNewLabel_1 = new JLabel("");
			lblNewLabel_1.setBounds(116, 125, 10, 16);
		}
		return lblNewLabel_1;
	}
	private JLabel getLblNewLabel_2() {
		if (lblNewLabel_2 == null) {
			lblNewLabel_2 = new JLabel("");
			lblNewLabel_2.setBounds(237, 125, 10, 16);
		}
		return lblNewLabel_2;
	}
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("+");
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					//1st
//					String stNum1 =  textField_1.getText();
//					String stNum2 =  textField_2.getText();
//					
//					int wkNum1 = Integer.parseInt(stNum1);
//					int wkNum2 = Integer.parseInt(stNum2);
//					int wkResult = wkNum1 + wkNum2;
//					
//					String stResult = Integer.toString(wkResult);
//					textField_3.setText(stResult);
					//2nd
//					int wkNum1_1 = Integer.parseInt(textField_1.getText());
//					int wkNum2_1 = Integer.parseInt(textField_2.getText());
//					
//					
//					textField_3.setText(Integer.toString(wkNum1_1 + wkNum2_1));
					
					String str1 = textField_1.getText();
					String str2 = textField_2.getText();
					
					int num1 = Integer.parseInt(str1);
					int num2 = Integer.parseInt(str2);
					
					textField_3.setText(str1);
					textField_5.setText(str2);
					
					lblNewLabel_1.setText("+");
					lblNewLabel_2.setText("=");
					
					textField_6.setText(Integer.toString(num1 + num2));
					
					
					
					
				}
			});
			btnNewButton.setBounds(186, 26, 61, 29);
		}
		return btnNewButton;
	}
	
	
	private JTextField getTextField() {
		if (textField == null) {
			textField = new JTextField();
			textField.setHorizontalAlignment(SwingConstants.RIGHT);
			textField.setColumns(10);
			textField.setBounds(29, 120, 75, 26);
		}
		return textField;
	}
	private JTextField getTextField_4() {
		if (textField_4 == null) {
			textField_4 = new JTextField();
			textField_4.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_4.setColumns(10);
			textField_4.setBounds(29, 120, 75, 26);
		}
		return textField_4;
	}
	private JTextField getTextField_5() {
		if (textField_5 == null) {
			textField_5 = new JTextField();
			textField_5.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_5.setColumns(10);
			textField_5.setBounds(150, 120, 75, 26);
		}
		return textField_5;
	}
	private JTextField getTextField_6() {
		if (textField_6 == null) {
			textField_6 = new JTextField();
			textField_6.setHorizontalAlignment(SwingConstants.RIGHT);
			textField_6.setColumns(10);
			textField_6.setBounds(263, 120, 75, 26);
		}
		return textField_6;
	}
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("-");
			btnX.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					
					String str1 = textField_1.getText();
					String str2 = textField_2.getText();
					
					int num1 = Integer.parseInt(str1);
					int num2 = Integer.parseInt(str2);
					
					textField_3.setText(str1);
					textField_5.setText(str2);
					
					lblNewLabel_1.setText("-");
					lblNewLabel_2.setText("=");
					
					textField_6.setText(Integer.toString(num1 - num2));
					
					
					
				}
			});
			btnX.setBounds(245, 26, 61, 29);
		}
		return btnX;
	}
	private JButton getBtnX_1() {
		if (btnX_1 == null) {
			btnX_1 = new JButton("x");
			btnX_1.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
				
					int num1 = Integer.parseInt(textField_1.getText());
					int num2 = Integer.parseInt(textField_2.getText());
					
					ButtonAction ba = new ButtonAction(num1 , num2 , "+");
					
					textField_3.setText();
					textField_5.setText();
//					
//					lblNewLabel_1.setText("x");
//					lblNewLabel_2.setText("=");
//					
//					textField_6.setText(Integer.toString(num1 * num2));
					
					
				}
			});
			btnX_1.setBounds(301, 26, 61, 29);
		}
		return btnX_1;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("/");
			btnNewButton_3.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent e) {
					
					String str1 = textField_1.getText();
					String str2 = textField_2.getText();
					
					int num1 = Integer.parseInt(str1);
					int num2 = Integer.parseInt(str2);
					
					textField_3.setText(str1);
					textField_5.setText(str2);
					
					lblNewLabel_1.setText("/");
					lblNewLabel_2.setText("=");
					
					textField_6.setText(Integer.toString(num1 / num2));
					
					
					
				}
			});
			btnNewButton_3.setBounds(357, 26, 61, 29);
		}
		return btnNewButton_3;
	}
}












