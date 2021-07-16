package com.javalec.base;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;


public class GUI01 {

	private JFrame frmAdd;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_1;
	private JLabel lblNewLabel_1;
	private JLabel lblNewLabel_1_2;
	private JButton btnNewButton;
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
		frmAdd.getContentPane().add(getTextField_1());
		frmAdd.getContentPane().add(getTextField_2());
		frmAdd.getContentPane().add(getTextField_3());
		frmAdd.getContentPane().add(getLblNewLabel_1());
		frmAdd.getContentPane().add(getTextField_5());
		frmAdd.getContentPane().add(getLblNewLabel_1_2());
		frmAdd.getContentPane().add(getTextField_6());
		frmAdd.getContentPane().add(getBtnNewButton());
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
	
	private JLabel getLblNewLabel_1_2() {
		if (lblNewLabel_1_2 == null) {
			lblNewLabel_1_2 = new JLabel("=");
			lblNewLabel_1_2.setBounds(237, 125, 10, 16);
		}
		return lblNewLabel_1_2;
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
	
	
//	 BUTTON ACTION STRUCTURE 
	
	
	
	private JButton getBtnNewButton() {
		if (btnNewButton == null) {
			btnNewButton = new JButton("+");
			btnNewButton.addActionListener( new EventShitHandler( textField_1 , textField_2, textField_3,
					textField_5,textField_6,lblNewLabel_1));
			btnNewButton.setBounds(186, 26, 61, 29);
		}
		return btnNewButton;
	}
	
	private JButton getBtnX() {
		if (btnX == null) {
			btnX = new JButton("-");
			btnX.addActionListener( new EventShitHandler( textField_1 , textField_2, textField_3,
					textField_5,textField_6,lblNewLabel_1));
			btnX.setBounds(245, 26, 61, 29);
		}
		return btnX;
	}
	private JButton getBtnX_1() {
		if (btnX_1 == null) {
			btnX_1 = new JButton("x");
			btnX_1.addActionListener( new EventShitHandler( textField_1 , textField_2, textField_3,
					textField_5,textField_6,lblNewLabel_1));
			btnX_1.setBounds(301, 26, 61, 29);
		}
		return btnX_1;
	}
	private JButton getBtnNewButton_3() {
		if (btnNewButton_3 == null) {
			btnNewButton_3 = new JButton("/");
			btnNewButton_3.addActionListener( new EventShitHandler( textField_1 , textField_2, textField_3,
					textField_5,textField_6,lblNewLabel_1));
			btnNewButton_3.setBounds(357, 26, 61, 29);
		}
		return btnNewButton_3;
	}
	
}

// External EventShitHandler = > All event handle
/* To make my own new Objects, implements the External library interface.
 * 
 * Short Cut to long way, Reshaped the requirement methods "ActionPerformed" 
 * then, we can use that our own way. */



